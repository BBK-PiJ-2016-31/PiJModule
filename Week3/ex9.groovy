print "Enter a sentence: "
String str = System.console().readLine()
int counter = 0

print "Enter character to be found: "
char ch = System.console().readLine()

for (int i = 0; i<str.length(); i++){
	char check = str.charAt(i)		// check every character from the string
//	if (check=='e'){				// increment counter if 'e' is found
	if (check==ch) {				
		counter++					// increment is entered char is found
	}
}
println "Count: " + counter