"""
Implementation of Lab 9
by Severyn Rybka
"""
from video_recorder import VideoRecorder

def main():
	"""
	Main function
	"""
	videoRecorder = VideoRecorder()
	videoRecorder.turnOn()

	videoRecorder.setVideos(["video1", "video2"])
	videoRecorder.play()
	videoRecorder.pause()
	videoRecorder.nextVideo()

	videoRecorder.play()
	videoRecorder.nextVideo()
	videoRecorder.showCurrentVideo()
	videoRecorder.nextVideo()
	videoRecorder.prevVideo()

	videoRecorder.setVideos(["movie", "youtube-video"])
	videoRecorder.showVideos()
	videoRecorder.play()

	videoRecorder.startRecording()
	videoRecorder.stopRecording()

	videoRecorder.aboutDevice()

	videoRecorder.turnOff()


if __name__ == "__main__":
	main()
