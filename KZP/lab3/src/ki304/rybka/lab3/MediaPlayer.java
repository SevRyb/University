/**
 * 
 */
package ki304.rybka.lab3;

/**
 * Class MediaPlayer implements media player
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class MediaPlayer 
{
	private LogManager logManager;
	private boolean isPlaying = false;
	private int currentVideoIndex = 0;
	private int totalVideos = 0;
	private String[] videoNames;
	/**
	 * Constructor of MediaPlayer
	 * @param _logManager LogManager
	 */
	public MediaPlayer(LogManager _logManager)
	{
		logManager = _logManager;
	}
	/**
	 * Play
	 */
	public void play()
	{
		if (!isPlaying && totalVideos > 0)
		{
			isPlaying = true;
			logManager.info("Playing: " + videoNames[currentVideoIndex]);
		}
	}
	/**
	 * Pause
	 */
	public void pause()
	{
		if (isPlaying)
		{
			isPlaying = false;
			logManager.info("Paused");
		}
	}
	/**
	 * Next video
	 */
	public void nextVideo() 
	{
		if (currentVideoIndex < totalVideos-1)
		{
			currentVideoIndex++;
			logManager.info("Playing: " + videoNames[currentVideoIndex]);
			isPlaying = true;
			return;
		}
		logManager.error("No next video");
	}
	/**
	 * Previous video
	 */
	public void prevVideo() 
	{
		if (currentVideoIndex > 0)
		{
			currentVideoIndex--;
			logManager.info("Playing: " + videoNames[currentVideoIndex]);
			isPlaying = true;
			return;
		}
		
		logManager.error("No prev video");
	}
	/**
	 * Set video list
	 * @param videos Video names
	 */
	public void setVideos(String[] videos) 
	{
		videoNames = videos;
		totalVideos = videos.length;
		currentVideoIndex = 0;
		for (String name : videoNames)
		{
			logManager.info("Video added: " + name);
		}
		isPlaying = false;
	}
	/**
	 * Show current video
	 */
	public void showCurrentVideo()
	{
		if (totalVideos > 0)
			logManager.info("Current: " + videoNames[currentVideoIndex]);
	}
	/**
	 * Show videos
	 */
	public void showVideos()
	{
		for (String name : videoNames)
		{
			logManager.info("Video: " + name);
		}
	}
}
