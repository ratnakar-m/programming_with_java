import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import javax.swing.*;
import com.sun.pdfview.*;

public class PDFViewer extends JFrame
{

   public static void main (final String [] args) throws IOException
   {
      int pagenum = validateAndParseArgs(args);
	  
	  String pdfFilePath = args[0];
	  Image image = extractImage(pdfFilePath, pagenum);

	  
	  JFrame jframe = prepareDisplayWindow(image);
      jframe.setVisible(true);
   }
   
   public static void openPDFViewer(String pdfFilePath) throws IOException{
	  Image image = extractImage(pdfFilePath, 1);
	  JFrame jframe = prepareDisplayWindow(image);
      jframe.setVisible(true);
   }
   public static int validateAndParseArgs(String[] args){
	  if (args.length < 1 || args.length > 2)
      {
          System.err.println ("usage: java PDFDemo2 <pdf-file> [pagenum]");
          System.exit(1);
      }
      int pagenum = (args.length == 1) ? 1 : Integer.parseInt (args [1]);
      if (pagenum < 1)
          pagenum = 1;
	  
	  return pagenum;
   }
   public static Image extractImage(String filePath, int pagenum) throws IOException{
	  RandomAccessFile raf = new RandomAccessFile (new File (filePath), "r");
      FileChannel fc = raf.getChannel ();
      ByteBuffer buf = fc.map (FileChannel.MapMode.READ_ONLY, 0, fc.size ());
      PDFFile pdfFile = new PDFFile (buf);

      int numpages = pdfFile.getNumPages ();
      System.out.println ("Number of pages = "+numpages);
      if (pagenum > numpages)
          pagenum = numpages;

      PDFPage page = pdfFile.getPage (pagenum);
              
      Rectangle2D r2d = page.getBBox ();

      double width = r2d.getWidth ();
      double height = r2d.getHeight ();
      width /= 72.0;
      height /= 72.0;
      int res = Toolkit.getDefaultToolkit ().getScreenResolution ();
      width *= res;
      height *= res;

      Image image = page.getImage ((int) width, (int) height, r2d, null, true, true);
	  
	  return image;
   }
   
   public static JFrame prepareDisplayWindow(Image image){
	  JFrame jframe = new JFrame("PDF Viewer");
	  jframe.setDefaultCloseOperation (EXIT_ON_CLOSE);
	  JLabel label = new JLabel (new ImageIcon (image));
      label.setVerticalAlignment (JLabel.TOP);
	  jframe.setContentPane (new JScrollPane (label));
      jframe.pack ();
	  return jframe;
   }
}