int nextUp
int nextDown
int input
int counter1=1
boolean complete = false
int result
print "***** Enter your number : "
String str = System.console().readLine()
input = Integer.parseInt(str)			// We now have user input

while (!complete) {
	nextUp = input - counter1
	nextDown = input + counter1
	int counter = 2
	boolean prime1 = true, prime2 = true
	while ((counter<=(nextDown/2)) && prime2) { 	// start diving by 2 onwards + only need divide upto 1/2 the number to be checked
		result = nextDown % counter				// keep checking remainder to be not equal to 0
		if (result==0) { prime2 = false }
		counter++
	}
	counter=2
	while ((counter<=(nextUp/2)) && prime1) { 	// start diving by 2 onwards + only need divide upto 1/2 the number to be checked
		result = nextUp % counter				// keep checking remainder to be not equal to 0
		if (result==0) { prime1 = false }
		counter++
	}
	if (prime1) {
		println "PrimeUp : " + nextUp
		complete = true
	}
	if (prime2) {
		println "PrimeDown : " + nextDown
		complete = true
	}
	counter1++
}