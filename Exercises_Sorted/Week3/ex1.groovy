BigDecimal d1 = 1.255			// double changed to BigDecimal to gain precision
BigDecimal d2 = d1 + 7 - 4 - 3 
println d2
if (d1 == d2) {
	println("1.255 is equal to 1.255 plus 7 minus 7"); 
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7"); 
}

