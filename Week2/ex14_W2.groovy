boolean prime = true		// start with assumtion to be true for prime
int numCheck = 2			// start checking from 2 as 0,1 are not prime
int counter1=0

while (counter1<1000) {							// do it until 1000 primes are not found
	int counter=2 , result
	while (counter<=(numCheck/2) && (prime)){	// keep iterating until not prime is establised OR half the numCheck value is reached
		result = numCheck % counter
		counter++
		if (result==0) {prime = false}			// declare it false i.e not prime if remainder is 0
	}
	if (prime) {								// keep incrementing to count how many primes are found and keep printing them as well
		print "  "+ numCheck
		counter1++
	}
	numCheck++
	prime=true									// reset assumtion for next iteration
}	
println ""										// so that command line appears on next line when code finishes