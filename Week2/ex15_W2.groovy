int numOfGuess=0
int numberToGuess = Math.abs(1000 * Math.random())
int guess=-1
int tryCount=0

println "Try to guess my number!"

while (guess!=numberToGuess) {				// this condition will always be true when entering the first time
	print "Enter your Guess : "
	String input = System.console().readLine()
	guess = Integer.parseInt(input)
											// we have the user input now
	if (guess<numberToGuess){				// Keep checking higher or lower
		println "No! My number is higher"
		tryCount++							// keep recording the number of tries in both high/low cases
	} else if (guess>numberToGuess){
		println "No! My number is lower"
		tryCount++
	} else {								// declare/print result with number of tries
		println "CORRECT!"
		println " You needed " + tryCount + " guesses."
	}
}