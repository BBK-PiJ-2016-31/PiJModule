print " Enter number: "
String input = System.console().readLine()
boolean decimalPresent = false
int indexDecimal
String num = ""

// Decimal value for . = 46
// Decimal value for , = 44
// Decimal value for 0 to 9 = 48 to 57

for (int i=0; i<input.length();i++){
	char check = input.charAt(i)
	if (check!=44) {				// remove the ' , ' from the input string first
		num += check
	}
}
// then in the final string, find the index of ' . '
for (int i=0; i<num.length();i++){
	char check = num.charAt(i)
	if (check==46)	{				// if decimal is present, note that
		decimalPresent = true
		indexDecimal = i
	}

}

if (decimalPresent) {
	String num1 = num.substring(0, indexDecimal) // load before decimal
	String num2 = num.substring(indexDecimal+1, num.length()) // load after decimal
	String temp = num1 + num2	// concatinate two strings
	int temp1 = Integer.parseInt(temp)	// convert it to integer value
	double result = temp1				// pass it to a double
	for (int i=0; i<num2.length();i++){
		result = result/10				// divide by 10, for length of after decimal string value
	}
	println result/2				// print the answer
} else {
	println (Integer.parseInt(num)/2)		// go straight to answer if no decimal is present
}
