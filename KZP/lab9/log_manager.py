"""
LogManager
"""

class LogManager:
    def info(self, msg):
        """ Logs info massage """
        print("[INFO]", msg)

    def error(self, msg):
        """ Logs error massage """
        print("[ERROR]", msg)
