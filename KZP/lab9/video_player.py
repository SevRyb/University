"""
VideoPlayer
"""
from power_supply import PowerSupply
from media_player import MediaPlayer
from log_manager import LogManager

class VideoPlayer:
    def __init__(self, on = False):
        """ Constructor """
        self._powerSupply = PowerSupply()
        self._logManager = LogManager()
        self._mediaPlayer = MediaPlayer(self._logManager)
        if on == True:
            self.turnOn()


    def aboutDevice(self):
        """ Shows information about device """
        self._logManager.info("This is VideoPlayer, version is 1.0")


    def turnOn(self):
        """ Turn on """
        if self._powerSupply.isOn() == False:
            self._powerSupply.turnOn(True)
            self._logManager.info("Turned on")

    
    def turnOff(self):
        """ Turn off """
        if self._powerSupply.isOn() == True:
            self._powerSupply.turnOn(False)
            self._logManager.info("Turned off")


    def play(self):
        """ Play video """
        self._mediaPlayer.play()


    def pause(self):
        """ Pause video """
        self._mediaPlayer.pause()


    def nextVideo(self):
        """ Next video """
        self._mediaPlayer.nextVideo()


    def prevVideo(self):
        """ Previous video """
        self._mediaPlayer.prevVideo()


    def setVideos(self, videos):
        """ Set videos """
        self._mediaPlayer.setVideos(videos)


    def showCurrentVideo(self):
        """ Show current video name """
        self._mediaPlayer.showCurrentVideo()


    def showVideos(self):
        """ Show video names """
        self._mediaPlayer.showVideos()
