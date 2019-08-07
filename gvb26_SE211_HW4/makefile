#Gaurang Bham
#Assignment 4 MakeFile

.PHONY : build run view clean

build :
	chmod +x weatherAlert
	javac weatherAlert/*.java
run : 
	java weatherAlert.ServiceNotifier

view :
	-@\less Service.java EmailService.java PhoneService.java SmsServicer.java ServiceNotifier.java

clean :
	@\rm *.class

