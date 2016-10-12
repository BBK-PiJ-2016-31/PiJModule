boolean cont = true					// Used to iterate the loop until false
while (cont) {
	print "Please enter dividend (to be divided): " // Get two inputs
	String str1 = System.console().readLine()
	int num1 = Integer.parseInt(str1)
	print "Please enter divisor (divided by): "
	str1 = System.console().readLine()
	int num2 = Integer.parseInt(str1)
	int remainder = 0, quotient = 0
	boolean positive = true			// Assume result to be positive or record change by changing it to false
	int num1Copy = num1
	int num2Copy = num2    			// Use copies as we will change signs below if -ve

	if (num1<0 && num2<0){			// Both negatives or one of them negative in below cases
		num2 = -num2
		num1 = -num1
	} else if (num2<0 && num1>0){
		num2 = -num2
		positive=false
	} else if (num2>0 && num1<0){
		num1 = -num1
		positive=false
	}
	remainder=num1
	if (num2>0) {				// Throw warning if someone tries to divide by 0
		while (remainder>0) {			// Keep subtracting num2 from num1 if number to be divided is greater than 0
			remainder = remainder-num2
			quotient++					// record number of times the subtraction happened
			if (remainder<0) {			// if went below 0 then come back one step as we got our final remainder
				quotient--
				remainder = remainder + num2
				break
			}
		}
		if (!positive) {
			quotient= -quotient			// Change the quotient if one of the num was recorded as -ve
		}
		println num1Copy + " Divide by " + num2Copy + " is " + quotient + ", remainder "+remainder
	} else {
		println "Cannot divide by 0!"
	}
	print "- - Want to continue? (y or n) - - : "	// As user if they wish to do try again
	String ans = System.console().readLine()
	if (ans=="n") { 
		cont=false
		println "Goodbye!"				// Exit gracefully otherwise
	}
	positive=true				// Reset to original assumtions if user wishes to iterate the loop
	remainder=0
	quotient=0
}