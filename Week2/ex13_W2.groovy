boolean prime = true
int limitToCount=1000
int numCheck = 2

while (numCheck<=1000) {
	int counter=2 , result
	while (counter<=(numCheck/2) && (prime)){
		result = numCheck % counter
		counter++
		if (result==0) { prime = false }
	}
	if (prime) {
		print " , "+ numCheck
	}
	numCheck++
	prime=true
}
println ""