package ki304.rybka.lab3;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Implementation of Lab3
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class App 
{
	/**
	 * Entry point of the application
	 * @param args Not used
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		VideoRecorder videoRecorder = new VideoRecorder();
		videoRecorder.turnOn();
		String[] videos = {"video1", "video2"};
		videoRecorder.setVideos(videos);
		videoRecorder.play();
		videoRecorder.pause();
		videoRecorder.nextVideo();
		
		videoRecorder.play();
		videoRecorder.nextVideo();
		videoRecorder.showCurrentVideo();
		videoRecorder.nextVideo();
		videoRecorder.prevVideo();
		
		String[] videos2 = {"movie", "youtube-video"};
		videoRecorder.setVideos(videos2);
		videoRecorder.showVideos();
		videoRecorder.play();
		
		videoRecorder.startRecording();
		videoRecorder.stopRecording();
		
		videoRecorder.aboutDevice();
		
		videoRecorder.turnOff();
		videoRecorder.cleanUp();
		
	}
}
