.PHONY:clean

timing:
	@g++ -std=c++11 timingAL.cpp timingAS.cpp timingPL.cpp timingPS.cpp -o timing
	@./timing

arraylist:
	@g++ -std=c++11 arraylist.cpp testingAL.cpp -o arraylist
	@./arraylist

pointerlist:
	@g++ -std=c++11 pointerlist.cpp testingPL.cpp -o pointerlist
	@./pointerlist

arraystack:
	@g++ -std=c++11 arraystack.cpp testingAS.cpp -o arraystack
	@./arraystack


pointerstack:
	@g++ -std=c++11 pointerstack.cpp testingPS.cpp -o pointerstack
	@./pointerstack

clean:
        @\rm -f *.o
