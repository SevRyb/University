package ki304.rybka.lab2;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Implementation of Lab2
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
		VideoPlayer videoPlayer = new VideoPlayer();
		videoPlayer.turnOn();
		String[] videos = {"video1", "video2"};
		videoPlayer.setVideos(videos);
		videoPlayer.play();
		videoPlayer.pause();
		videoPlayer.nextVideo();
		
		videoPlayer.play();
		videoPlayer.nextVideo();
		videoPlayer.showCurrentVideo();
		videoPlayer.nextVideo();
		videoPlayer.prevVideo();
		
		String[] videos2 = {"movie", "youtube-video"};
		videoPlayer.setVideos(videos2);
		videoPlayer.showVideos();
		videoPlayer.play();
		
		videoPlayer.turnOff();
		videoPlayer.cleanUp();
	}
}
