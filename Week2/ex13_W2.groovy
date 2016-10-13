boolean prime = true
int limitToCount=1000
int numCheck = 2		// number to check. Start from 2 as 0,1 are not considered prime

while (numCheck<=1000) {	// only check upto 1000 numbers
	int counter=2 , result
	while (counter<=(numCheck/2) && (prime)){ 	// start diving by 2 onwards + only need divide upto 1/2 the number to be checked
		result = numCheck % counter				// keep checking remainder to be not equal to 0
		counter++
		if (result==0) { prime = false }		// declare it not prime 
	}
	if (prime) {								// keep printing prime until we have checked upto 1000
		print numCheck + "  "
	}
	numCheck++									// Check next number
	prime=true									// Reset prime to be true
}
println ""										// so command line comes to next line when code finishes