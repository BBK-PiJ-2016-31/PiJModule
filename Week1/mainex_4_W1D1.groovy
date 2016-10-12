boolean cont=true
while (cont) {									// Cont is used to iterate the loop if the user wishes after first try
	print "Please enter a number: "
	String str1 = System.console().readLine()
	int num = Integer.parseInt(str1)			// get the input number
	int counter = 2
	boolean prime = true						// Start with assumption that number entered will be prime
	if (num>=0) {								// ignore 0 and 1 as they are not considered prime
		if ((num == 1) || (num == 0)) {
			prime = false
		}
		while (counter <= num/2 && prime) {		// move on and start dividing the number starting from 2 onwards + Entered number is +ve
			int result = num%counter
			if (result == 0) { 					// if remainder is 0 then it is not prime. Display the number which the input if fully divisable
				prime = false
				println "Divisible by : " + counter
			} 
			counter++
		}
		System.out.println("Prime = " + prime);
	} else {
		println "Only positive numbers are allowed"
	}
	println "Want to continue? (y or n)"
	String ans = System.console().readLine()
	if (ans=="n") { 							// iterate again if user doesn't enter 'n' or end gracefully!
		cont=false
		println "Goodbye!"
	}
}