#Gaurang Bham
#Assignment 2 MakeFile

.PHONY : build run view clean

build :
	chmod +x AbstractFactory
	javac AbstractFactory/*.java
run : 
	java AbstractFactory.ComputerStore

view :
	-@\less ComputerPartsFactory.java StandardComputerPartsFactory.java AdvancedComputerPartsFactory.java Computer.java ComputerStore.java CPU.java StandardCPU.java AdvancedCPU.java Monitor.java StandardMonitor.java AdvancedMonitor.java Keyboard.java StandardKeyboard.java AdvancedKeyboard.java

clean :
	@\rm *.class

