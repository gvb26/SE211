#Gaurang Bham
#Assignment 2 MakeFile

.PHONY : build run view clean

build :
	chmod +x AlphaMobile
	javac AlphaMobile/*.java
run : 
	java AlphaMobile.PhoneStore

view :
	-@\less AlphaMobileFactory.java SingaporeFactory.java NewYorkFactory.java Smart4.java Smart5.java Smart6.java Phone.java AlphaMobile.java PhoneStore.java

clean :
	@\rm *.class

