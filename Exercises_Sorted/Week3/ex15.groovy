print " Enter text: "
String str1 = System.console().readLine()
boolean relaxed = true, complete = false
String str=""			// Initialise this else nullpointer error

for (int i=0 ; i<str1.length() ; i++){	// get the string with spaces etc omitted
	char a = str1.charAt(i)
	if (a.isLetter()){
		str += a.toLowerCase()		// take everything to lowercase
	} else {
		relaxed=false				// if non-letters are found then note this
	}
}

while (!complete){
	for (int i = 0; i<(str.length()/2); i++){	// only need to check upto half the sentence
		char start = str.charAt(i)		// take the begining character, then go up by 1
		char end = str.charAt((str.length()-1)-i)	// take the end charater to start with then go down by 1
		if (start!=end) {		// if they don't match!
			complete = true		// stop here and don't proceed
			break				// come out of for loop
		}
	}
	if (!complete) {			// if iteration is all valid
		String result = (relaxed)? " strict " : " relaxed "		// based on relaxed in the for loop, load appropiate string into result
		println " The text is " + result + " Palindrome "		// print accordingly
		complete = true			// come out of while loop
	} else {
		println " The text is NOT a Palindrome "
	}
}