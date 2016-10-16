double cost
double paid

print " Enter cost of product : "
String str = System.console().readLine()
cost = Double.parseDouble(str)

print " Enter price paid : "
str = System.console().readLine()
paid = Double.parseDouble(str)

BigDecimal balance = BigDecimal.valueOf(paid - cost) // convert double result into BigDecimal for precision

println " Balance : " + balance

while (balance>0){
	balance = checking (balance, 50)	// Keep calling the check function and 
	balance = checking (balance, 20)	// update the balance
	balance = checking (balance, 10)
	balance = checking (balance, 5)
	balance = checking (balance, 2)
	balance = checking (balance, 1)
	balance = checking (balance, 0.5)
	balance = checking (balance, 0.2)
	balance = checking (balance, 0.1)
	balance = checking (balance, 0.05)
	balance = checking (balance, 0.02)
	balance = checking (balance, 0.01)
}

BigDecimal checking (BigDecimal balanceCopy, BigDecimal denomination){
	int counter = 0
	while  (balanceCopy >= denomination) { // keep subtracting the denomination
		balanceCopy -= denomination			// unless balance goes below it
		counter++							// count how many times this happened and print it
	}
	if (counter>0)	{println counter + " x £"+denomination}
	return balanceCopy						// return the balance left to update the balance in while loop
}

