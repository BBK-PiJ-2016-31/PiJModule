int numOfGuess=0
int numberToGuess = Math.abs(1000 * Math.random())
int guess=-1
int tryCount=0
println "Try to guess my number!"
while (guess!=numberToGuess) {
	String input = System.console().readLine()
	guess = Integer.parseInt(input)
	
	if (guess<numberToGuess){
		println "No! My number is higher"
		tryCount++
	} else if (guess>numberToGuess){
		println "No! My number is lower"
		tryCount++
	} else {
	//case guess==numberToGuess:
		println "CORRECT!"
		println " You needed " + tryCount + " guesses."
	}
}
println ""