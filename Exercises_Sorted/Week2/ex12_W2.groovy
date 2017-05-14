int num=1			// Start with 1
int counter=num		
boolean finish=false
while (!finish) {		// until the status changes carry on
	while (counter>0) {	// Run the counter 'num' number of times and keep printing num
		print num
		counter--
	}
	num++
	counter=num
	println ""
	if (num==8) {finish=true}	// print upto 7 only
}
println "\\ldots"		// need \\ to print \ once