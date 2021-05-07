package com.progress.test;

import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.util.BitSet;
import java.lang.StringBuffer;


public class FSReader
{
	public static void main(String[] args)
	{
		FSReader fsReader = new FSReader();
		String message = fsReader.readFile(args[0]);
		System.out.println(message);
	}

	public String readFile(String path)
	{
		ArrayList pathTokens = convertPathToList(path);
		StringBuffer output = new StringBuffer();
		if(!isItFile(pathTokens))
			return null;
		else
		{
			int recordIndex = getRecordIndex(pathTokens);
			//System.out.println("Record Index = "+recordIndex);

			try
			{

				File fileIndex = new File(".\\FI.txt");
				File fileSystem = new File(".\\FS.txt");

				RandomAccessFile rafi = new RandomAccessFile(fileIndex,"r");
				RandomAccessFile rafs = new RandomAccessFile(fileSystem,"r");

				byte[] record = new byte[48];


				rafi.seek(48*recordIndex);
				rafi.read(record);

				byte[] blocklist = new byte[8];
				System.arraycopy(record,40,blocklist,0,7);

				DataInputStream dis = new DataInputStream(new ByteArrayInputStream(blocklist));
				short[] blockIndexes = new short[4];

				short s = 0;
				for(int m=0; m<4; m++)
				{
					s = dis.readShort();
					//System.out.println("block Index: "+s);
					blockIndexes[m] = s;
				}

				boolean reachedEnd = false;
				byte[][] blockData = new byte[blockIndexes.length][];
				boolean isChain = false;
				short extIndex = 0;
				byte[] singleBlock = null;
				while(!reachedEnd)
				{
					if(!isChain)
						for(int k=0; k<blockIndexes.length; k++)
						{
							blockData[k] = new byte[128];
							//128 - block size in fs
							rafs.seek(blockIndexes[k]*128);
							rafs.read(blockData[k]);
							String strBlock = new String(blockData[k]);
							output.append(strBlock);
						}
					else
					{
						singleBlock = new byte[128];
						rafs.seek(extIndex*128);
						rafs.read(singleBlock);
						String strBlock = new String(singleBlock);
						System.out.print(strBlock);
					}
					if(!isChain)
						if(blockData[3][0] != 0 || blockData[3][1] != 0)
						{
								reachedEnd = false;
								isChain = true;
								byte[] extBytes = new byte[2];
								extBytes[0]= blockData[3][0];
								extBytes[1]= blockData[3][1];

								DataInputStream disa = new DataInputStream(new ByteArrayInputStream(extBytes));
								extIndex = disa.readShort();
						}
						else
						{
							reachedEnd = true;
							isChain = false;
						}
					else
						if(singleBlock[0] !=0 || singleBlock[1] != 1)
						{
							reachedEnd = false;
							isChain = true;
							byte[] extBytes = new byte[2];
							extBytes[0]= singleBlock[0];
							extBytes[1]= singleBlock[1];

							DataInputStream disa = new DataInputStream(new ByteArrayInputStream(extBytes));
							extIndex = disa.readShort();
						}
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			return new String(output);
		}
	}

	private ArrayList convertPathToList(String path)
	{
		StringTokenizer st = new StringTokenizer(path,"\\");
		ArrayList tokens = new ArrayList();
		int i=0;
		while (st.hasMoreTokens())
		{
		         tokens.add(st.nextToken());
				 //System.out.println(tokens.get(i));
		         i++;
		}
		return tokens;
	}

	private boolean isItFile(ArrayList pathTokens)
	{
		boolean isFile = false;
		FileInputStream fis = null;
		try
		{
			byte[] record = new byte[48];
			fis = new FileInputStream(".\\FI.txt");

			//for each path token
			for(int i=0; i<pathTokens.size(); i++)
			{
				//for each record in FI
				   //System.out.println("Token: "+i);

					if(i != (pathTokens.size() -1) )
					{
						while(fis.read(record) != -1)
						{

							byte[] name = new byte[32];
							System.arraycopy(record,0,name,0,31);
							String fileNameFromToken = (String)pathTokens.get(i);
							String fileNameFromIndex = getFileName(name);
							if (!fileNameFromToken.equals(fileNameFromIndex))
								continue;
							else
							{
								//System.out.println(fileNameFromIndex);
								break;
							}
						}

					}
					else
					{
						while(fis.read(record) != -1)
						{
							byte[] name = new byte[32];
							System.arraycopy(record,0,name,0,31);

							String fileNameFromToken = (String)pathTokens.get(i);
							String fileNameFromIndex = getFileName(name);
							//System.out.println(fileNameFromIndex);
							byte[] fileType = new byte[2];
							fileType[0] = record[32];
							fileType[1] = record[33];

							BitSet bs = fromByteArray(fileType);

							boolean is_file = bs.get(15);
							boolean is_text = bs.get(13);

							if (fileNameFromToken.equals(fileNameFromIndex))
							{
								if(is_file && is_text)
								{
									isFile = true;
									break;
								}
								else
									isFile = false;
							}
							else
								isFile = false;
						}
					}
			}
		}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		  isFile = false;
		}
		finally
		{
			try{
				fis.close();
			}
			catch(Exception e){}
		}
 		return isFile;
	}

	private String getFileName(byte[] name)
	{
		int size_of_filename = 0;
		for(int l=0; l<31; l++)
		{
			if(name[l] == 0)
			{
				size_of_filename = l;
				break;
			}
			else
				size_of_filename = l;
		}
		char[] cArray = new char[size_of_filename];
		for(int k=0; k<size_of_filename; k++)
		{
			cArray[k] = (char)name[k];
		}

		return new String(cArray);
	}

	private int getRecordIndex(ArrayList pathTokens)
	{
		boolean isFile = false;
		int recordIndex = -1;
		FileInputStream fis = null;
		try
		{
			byte[] record = new byte[48];
			fis = new FileInputStream(".\\FI.txt");

			//for each path token
			for(int i=0; i<pathTokens.size(); i++)
			{
				//for each record in FI

					if(i != (pathTokens.size() -1) )
					{
						while(fis.read(record) != -1)
						{
							recordIndex++;
							byte[] name = new byte[32];
							System.arraycopy(record,0,name,0,31);
							String fileNameFromToken = (String)pathTokens.get(i);
							String fileNameFromIndex = getFileName(name);


							if (!fileNameFromToken.equals(fileNameFromIndex))
								continue;
							else
							{
								break;
							}
						}

					}
					else
					{
						while(fis.read(record) != -1)
						{
							recordIndex++;

							byte[] name = new byte[32];
							System.arraycopy(record,0,name,0,31);

							String fileNameFromToken = (String)pathTokens.get(i);
							String fileNameFromIndex = getFileName(name);
							byte[] fileType = new byte[2];
							fileType[0] = record[32];
							fileType[1] = record[33];
							//System.arraycopy(record,32,fileType,0,1);

							BitSet bs = fromByteArray(fileType);

							boolean is_file = bs.get(15);
							boolean is_text = bs.get(13);

							if (fileNameFromToken.equals(fileNameFromIndex))
							{
								if(is_file && is_text)
								{
									//System.out.println("in method: recordIndex = "+recordIndex);
									isFile = true;
									break;
								}
								else
									isFile = false;
							}
							else
							{
								isFile = false;
							}
						}

					}
			}
		}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		  isFile = false;
		}
		finally
		{
			try{
				fis.close();
			}
			catch(Exception e){}
		}
 		return recordIndex;

	}

	public BitSet fromByteArray(byte[] bytes)
	{
	    BitSet bits = new BitSet();
	    for (int i=0; i<bytes.length*8; i++)
	    {
	        if ((bytes[bytes.length-i/8-1]&(1<<(i%8))) > 0)
	        {
	            bits.set(i);
	        }
	    }
	    return bits;
	}

}