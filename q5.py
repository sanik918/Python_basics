class myclass:
	def __init__(self):
	   self.s = ""
 
        def getstring(self):
	   self.s = raw_input()

        def printstr(self):
	  print self.s.upper()

strobj = myclass()
strobj.getstring()
strobj.printstr()
