print " Enter total amount borrowed: "
String str = System.console().readLine()
double totalBorrowed = Double.parseDouble(str)
print " Enter total number of years to pay: "
str = System.console().readLine()
double yearsToPay = Double.parseDouble(str)
print " Enter interest rate charged: "
str = System.console().readLine()
double interestRate = Double.parseDouble(str)

double t = totalBorrowed * (1+ (interestRate/100))

println ("Total to be paid: " + t)
println ("Every year " + t/yearsToPay+" has to paid")
