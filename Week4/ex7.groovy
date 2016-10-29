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
double yearlyPayment = (BigDecimal)t / yearsToPay
double interestTotal = t - totalBorrowed

println "--------------------------------------------------"
println "Total to be paid: " + t
println "Every year " + yearlyPayment+" has to paid"
println "Interest total : " + interestTotal

years2Pay(interestTotal, yearlyPayment)

void years2Pay (double interestTotal, double yearlyPayment){
		int years = 0
		while (interestTotal > yearlyPayment){
			years++
			interestTotal -= yearlyPayment
		}
		if (years==0) {
			years=1
		} 
		println "Interest will finish within " + years + " year(s)"
}