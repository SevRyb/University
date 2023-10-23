"""
MediaPlayer
"""
from log_manager import LogManager

class MediaPlayer:
    def __init__(self, log_manager):
        """ Constructor """
        self.__logManager = log_manager
        self.__isPlaying = False
        self.__currentVideoIndex = 0
        self.__totalVideos = 0
        self.__videoNames = []


    def play(self):
        """ Play video """
        if self.__isPlaying == False and self.__totalVideos > 0:
            self.__isPlaying = True
            self.__logManager.info(f"Playing: {self.__videoNames[self.__currentVideoIndex]}")


    def pause(self):
        """ Pause video """
        if self.__isPlaying == True:
            self.__isPlaying = False
            self.__logManager.info("Paused")


    def nextVideo(self):
        """ Next video """
        if self.__currentVideoIndex < self.__totalVideos - 1:
            self.__currentVideoIndex += 1
            self.__isPlaying = True
            self.__logManager.info(f"Playing: {self.__videoNames[self.__currentVideoIndex]}")
        else:
            self.__logManager.error("No next video")


    def prevVideo(self):
        """ Previous video """
        if self.__currentVideoIndex > 0:
            self.__currentVideoIndex -= 1
            self.__isPlaying = True
            self.__logManager.info(f"Playing: {self.__videoNames[self.__currentVideoIndex]}")
        else:
            self.__logManager.error("No prev video")


    def setVideos(self, videos):
        """ Set videos """
        self.__videoNames = videos
        self.__totalVideos = len(self.__videoNames)
        self.__currentVideoIndex = 0
        self.__isPlaying = False
        for video in self.__videoNames:
            self.__logManager.info(f"Video added: {video}")


    def showCurrentVideo(self):
        """ Show current video name """
        if self.__totalVideos > 0:
            self.__logManager.info(f"Current: {self.__videoNames[self.__currentVideoIndex]}")


    def showVideos(self):
        """ Show video names """
        for video in self.__videoNames:
            self.__logManager.info(f"Video: {video}")
            