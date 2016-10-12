boolean prime = true
int numCheck = 2
int counter1=0

while (counter1<=1000) {
	int counter=2 , result
	while (counter<=(numCheck/2) && (prime)){
		result = numCheck % counter
		counter++
		if (result==0) {prime = false}
	}
	if (prime) {
		print "  "+ numCheck
		counter1++
	}
	numCheck++
	prime=true
}
println ""