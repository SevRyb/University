"""
VideoRecorder
"""
from video_player import VideoPlayer

class VideoRecorder(VideoPlayer):
    def __init__(self, on = False):
        """ Constructor """
        super().__init__(on)
        self.__isRecording = False

    def aboutDevice(self):
        """ Shows information about device """
        self._logManager.info("This is VideoRecorder, version is 1.0")


    def startRecording(self):
        """ Starts recording """
        if self.__isRecording == False:
            super().pause()
            self.__isRecording = True
            self._logManager.info("Started recording")


    def stopRecording(self):
        """ Stops recording """
        if self.__isRecording == True:
            self.__isRecording = False
            self._logManager.info("Stopped recording")
