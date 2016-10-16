print "Enter the short string to be found: "
String strShort = System.console().readLine()

print "Enter the long text/sentence: "
String strLong = System.console().readLine()

int counter = 0
int timesFound =0 

for (int i = 0; i<strLong.length(); i++){
	char check1 = strLong.charAt(i)		// check every character from the long string
	char check2 = strShort.charAt(counter)	// get first letter of the short text
	boolean match =  (check1==check2)? true : false	// load match if the start sync bot matched
	if (match) { 		// keep incrementing the counter is the letters are matching
		counter++		// both i and counter will increment together if word matches
		} else{
			counter=0	// reset the counter if one letter doesn't match
		}
	if (counter==strShort.length()){	// check is the whole word has matched?
		counter=0						// reset counter for next time
		timesFound++
	}
}
println "Short text  - Times found : " + timesFound