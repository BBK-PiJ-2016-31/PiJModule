
print "Enter how many fractions you would like to calculate pi upto: "
String str = System.console().readLine()
int num = Integer.parseInt(str)			// We got the user input

int divisor=1
double result=0
boolean add = true						// to change between addition and subtraction
while (num>0){
	if (add){							// start by adding 4 and then subtracting the next fraction
		result = result + (4/divisor)
		add = !add						// toggles between true and false
	} else {
		result = result - (4/divisor)
		add = !add
	}
	divisor = divisor + 2
	num--
}

println str + " iterations gave result of " + result + " for pi"

