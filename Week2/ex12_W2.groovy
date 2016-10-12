int num=1
int counter=num
boolean finish=false
while (!finish) {
	while (counter>0) {
		print num
		counter--
	}
	num++
	counter=num
	println ""
	if (num==8) {finish=true}
}