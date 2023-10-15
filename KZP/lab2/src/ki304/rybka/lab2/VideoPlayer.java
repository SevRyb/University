/**
 * 
 */
package ki304.rybka.lab2;

import java.io.FileNotFoundException;

/**
 * Class VideoPlayer implements video player
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class VideoPlayer 
{
	private	PowerSupply powerSupply;
	private LogManager logManager;
	private MediaPlayer mediaPlayer;
	/**
	 * Constructor of VideoPlayer
	 * @throws FileNotFoundException 
	 */
	public VideoPlayer() throws FileNotFoundException 
	{
		powerSupply = new PowerSupply();
		logManager = new LogManager();
		mediaPlayer = new MediaPlayer(logManager);
	}
	/**
	 * Constructor of VideoPlayer
	 * @param on Is turned on
	 * @throws FileNotFoundException 
	 */
	public VideoPlayer(boolean on) throws FileNotFoundException 
	{
		powerSupply = new PowerSupply();
		logManager = new LogManager();
		mediaPlayer = new MediaPlayer(logManager);
		if (on == true)
			turnOn();
	}
	/**
	 * Turn on
	 */
	public void turnOn() 
	{
		if (powerSupply.isOn() == false)
		{
			powerSupply.turnOn(true);
			logManager.info("Turned on");
		}
	}
	/**
	 * Turn off
	 */
	public void turnOff() 
	{
		if (powerSupply.isOn() == true)
		{
			powerSupply.turnOn(false);
			logManager.info("Turned off");
		}
	}
	/**
	 * Play
	 */
	public void play()
	{
		mediaPlayer.play();
	}
	/**
	 * Pause
	 */
	public void pause()
	{
		mediaPlayer.pause();
	}
	/**
	 * Next video
	 */
	public void nextVideo() 
	{
		mediaPlayer.nextVideo();
	}
	/**
	 * Previous video
	 */
	public void prevVideo() 
	{
		mediaPlayer.prevVideo();
	}
	/**
	 * Set video list
	 * @param videos Video names
	 */
	public void setVideos(String[] videos) 
	{
		mediaPlayer.setVideos(videos);
	}
	/**
	 * Show current video
	 */
	public void showCurrentVideo()
	{
		mediaPlayer.showCurrentVideo();
	}
	/**
	 * Show videos
	 */
	public void showVideos()
	{
		mediaPlayer.showVideos();
	}
	/**
	 * Clean up
	 */
	public void cleanUp()
	{
		logManager.close();
	}
}
