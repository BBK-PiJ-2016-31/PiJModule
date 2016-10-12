boolean cont = true							// Used to iterate the while loop again until value changes
while (cont) {
	print "Please enter the first number: "		// Get two inputs
	String str1 = System.console().readLine()
	int num1 = Integer.parseInt(str1)
	print "Please enter the second number: "
	str1 = System.console().readLine()
	int num2 = Integer.parseInt(str1)
	int counter = 0 , result = 0
	boolean positive = true					// Assume the result will be positive, or record it to be -ve if changed to false
	if (num1<0 && num2<0){					// Change signs if both are negative as result will be positive
		num2 = -num2
		num1 = -num1
		counter = num2
	} else if (num2<0 && num1>0){			// Always take num2 number as counter, for calculation, change all to +ve and record the change
	 	num2 = -num2
	 	counter = num2
		positive = false					
	} else if (num2>0 && num1<0){			// same as above comment
		counter = num2
		num1 = -num1
		positive = false					
	} else {								// if both are positive
		counter = num2
	}
	while (counter>0){						// keep adding num1, num2 number of times
		result = result + num1
		counter--
	}
	if (!positive) {						// change sign if only 1 of the num was recorded as negative and print result
		result = -result
	}
	println "Product total is : " + result
	print "- - Want to continue? (y or n) - - : "	// Exit gracefully or iterate the loop again
	String ans = System.console().readLine()
	if (ans=="n") { 
		cont=false
		println "Goodbye!"
	}
	positive=true
}