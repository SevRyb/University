"""
PowerSupply
"""

class PowerSupply:
    def __init__(self):
        """ Constructor """
        self.__isOn = False


    def turnOn(self, on):
        """ Turn on """
        self.__isOn = on


    def isOn(self):
        """ If it's turned on """
        return self.__isOn
    
