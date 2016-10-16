print " Enter text: "
String str = System.console().readLine()

print str 		// print the original text without a line break
for (int i = str.length(); i>0 ; i--){	// start from the end
	print str.charAt(i-1)		// start pringing the end character until you reach the start
}
println "" // insert a line break to see the command prompt on the next line