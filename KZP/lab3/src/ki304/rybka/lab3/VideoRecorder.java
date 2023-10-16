/**
 * 
 */
package ki304.rybka.lab3;

import java.io.FileNotFoundException;

/**
 * Class VideoRecorder implements video recorder
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class VideoRecorder extends VideoPlayer
{
	private boolean isRecording = false;
	/**
	 * Constructor of VideoRecorder
	 * @throws FileNotFoundException 
	 */
	public VideoRecorder() throws FileNotFoundException
	{
		super();
	}
	/**
	 * Constructor of VideoRecorder
	 * @throws FileNotFoundException 
	 */
	public VideoRecorder(boolean on) throws FileNotFoundException
	{
		super(on);
	}
	/**
	 * Show info about device
	 */
	public void aboutDevice() 
	{
		logManager.info("This is VideoRecorder, version is 1.0");
	}
	/**
	 * Start recording
	 */
	public void startRecording() 
	{
		if (isRecording == false)
		{
			super.pause();
			isRecording = true;
			logManager.info("Started recording");
		}
	}
	/**
	 * Stop recording
	 */
	public void stopRecording() 
	{
		if (isRecording == true)
		{
			isRecording = false;
			logManager.info("Stopped recording");
		}
	}
}
