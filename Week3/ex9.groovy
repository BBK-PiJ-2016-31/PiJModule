print "Enter a sentence: "
String str = System.console().readLine()
int counter = 0

for (int i = 0; i<str.length(); i++){
	char check = str.charAt(i)		// check every character from the string
	if (check=='e') {				
		counter++					// increment counter if 'e' is found
	}
}
println "Counter: " + counter