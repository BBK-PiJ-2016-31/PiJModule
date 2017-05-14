// Take 3 numbers and print in ascending order
int highestNum
int middleNum
int lowestNum

print "Enter the first number: "			// Get 3 inputs
String str = System.console().readLine()
int getNum1 = Integer.parseInt(str)
print "Enter the second number: "
str = System.console().readLine()
int getNum2 = Integer.parseInt(str)
print "Enter the third number: "
str = System.console().readLine()
int getNum3 = Integer.parseInt(str)

println (" You entered : " + getNum1 + " , " + getNum2 + " and " + getNum3)

if (getNum1 < getNum2) {
	if (getNum1 < getNum3) {
		lowestNum = getNum1		// If getNum1 is less than both others
		if (getNum2 > getNum3){	// Check the other two
			highestNum = getNum2
			middleNum = getNum3
		} else {
			highestNum = getNum3
			middleNum = getNum2
		}
	} else {					// If getNum1 is less than one but greater than other
		lowestNum = getNum3
		middleNum = getNum1
		highestNum = getNum2
	}
} else {  					// If getNum1 is less than one of them and bigger than other
	if (getNum1 < getNum3) {
		middleNum = getNum1
		highestNum = getNum3
		lowestNum = getNum2
	} else {				// if bigger than bothe of them
		highestNum = getNum1
		if (getNum2> getNum3) {	// Check the rest two and print the results
			middleNum = getNum2
			lowestNum = getNum3
		} else {
			middleNum = getNum3
			lowestNum = getNum2
		}
	}
}
println (" Numbers in highest order first : " + highestNum + " , " + middleNum + " , " + lowestNum)
