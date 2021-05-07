import java.io.File;
import java.io.IOException;
import javax.media.*;
import java.net.URL;

public class PlayerDemo {
	public static void main(String[] args) throws Exception{
		String audioFilePath ="sunshine.wav"; 
		URL url=new File(audioFilePath).toURL();
		
		Player player=Manager.createRealizedPlayer(url);
		player.start();
		
		System.out.println("Hello");
		Thread.sleep(30000);
		player.stop();
		player.close();
	}
	
	public static void playAudio(String filePath) throws Exception{
		URL url=new File(filePath).toURL();
		
		Player player=Manager.createRealizedPlayer(url);
		player.start();
		
		System.out.println("Hello");
	}
}