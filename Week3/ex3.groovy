print "Please enter first number: "
String str1 = System.console().readLine()
double num1 = Double.parseDouble(str1)
print "Please enter second number: "
str1 = System.console().readLine()
double num2 = Double.parseDouble(str1)		// We have two numbers from the user

println "     Please select: "				// put menu option on screen
println "       1 - For multiplication (*)"
println "       2 - For division (/)"
println "       3 - For addition (+)"
println "       4 - For subtraction (-)"
print " Enter your selection : "
str1 = System.console().readLine()
int i = Integer.parseInt(str1)				// we have the user input

switch (i) {								// Do according to user input
	case 1:
		println " Answer is: " + (num1 * num2)
		break
	case 2:
		println " Answer is: " + (num1 / num2)
		break
	case 3:
		println " Answer is: " + (num1 + num2)
		break
	case 4:
		println " Answer is: " + (num1 - num2)
		break
	default: 								// Warn user of invalid input 					
		println " Invalid choice "
		break
}
