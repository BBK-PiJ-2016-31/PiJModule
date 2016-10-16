print "Enter a sentence: "
String str = System.console().readLine()

int counter = 0
String collect = ""			// to record every previous character
boolean carryOn = true

while (carryOn){
	print "Enter character to be found: "
	char ch = System.console().readLine()

	for (int i = 0; i<str.length(); i++){
		char check = str.charAt(i)		// check every character from the string
		if (check==ch) {				
			counter++					// increment if entered char is found
		}
	}
	for (int i = 0; i<collect.length(); i++){	// check if this character is present in collection
		char check = collect.charAt(i)		// check every character from collect
		if (check==ch) {				
			carryOn = false					// prepare to exit if char is found
		}
	}

	if (carryOn) {println "Count: " + counter} // print the answer if entered char is not repeated
	collect = collect + character			// append the char to the collection 
	counter = 0								// reset the counter
}
println "Repeated character. Exiting the program..."
println "Thank you for your cooperation. Good bye!"