/*
Purpose: To demonstrate the need for threads\\1

https://www.oracle.com/java/technologies/java-archive-downloads-java-client-downloads.html#7372-jmf-2.1.1e-oth-JPR

*/

import java.io.File;
import java.io.IOException;
import javax.media.*;
import java.net.URL;

public class ThreadDemo {
	public static void main(String[] args) throws Exception{
		String audio1Path ="D:\\others\\bonhive\\Language\\threads\\1.wav";
		String audio2Path ="D:\\others\\bonhive\\Language\\threads\\Ramuloo.wav";
        String audio3Path ="D:\\others\\bonhive\\Language\\threads\\Badtameez.wav"; 
		String audio4Path ="D:\\others\\bonhive\\Language\\threads\\sunshine.wav"; 
		
		URL url=new File(audio4Path).toURL();
		
		Player ap=Manager.createRealizedPlayer(url);
		ap.start();
		
		System.out.println("Hello");
	}
}

