print " Enter text: "
String str = System.console().readLine()
boolean complete = false

while (!complete){
	for (int i = 0; i<(str.length()/2); i++){	// only need to check upto half the sentence
		char start = str.charAt(i)		// take the begining character, then go up by 1
		char end = str.charAt((str.length()-1)-i)	// take the end charater to start with then go down by 1
		if (start!=end) {		// if they don't match!
			complete = true		// stop here and don;t proceed
			break				// come out of for loop
		}
	}
	if (!complete) {			// if iteration is all valid
		println " The text is a Palindrome "
		complete = true			// come out of while loop
	} else {
		println " The text is a NOT Palindrome "
	}
}