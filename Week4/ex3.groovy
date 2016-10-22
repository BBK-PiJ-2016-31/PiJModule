
int power2 (int e){
	if (e==0) {
		return 1
	} else {
		return power(2,e)
	}
}

int power (int b, int e){
	for (int counter=1; counter<e ; counter++){
		b *= 2
	}
	return b
}

int binary2decimal(String input){
	int length = input.length()
	int result = 0
	for (int counter=0 ; counter<length ; counter++){
		char c = input.charAt(counter)
		if (c=='1') {
			result += power2((length-counter)-1)
		}
	}
	return result
}

String decimal2Binary(String input){
	if (input=="0") { return "0"}
	int temp = Integer.parseInt(input)
	int temp2=0
	String result = ""
	String finalResult =""
	while (temp>1 || temp!=0){
		temp2 = temp % 2
		if (temp2==1) {
			result += "1"
		} else {
			result += "0"
		}
		temp = temp/2
	}
	for (int a=0 ; a<result.length() ; a++){
		finalResult += result.charAt((result.length()-a)-1)
	}
	return finalResult
}

boolean carryOn = true
while (carryOn){
	println ( "Please choose conversion mode: ")
	println ("1 : Binary to Decimal")
	println ("2 : Decimal to Binary")
	println ("0 : Exit")
	print " Enter your choice: "
	String choice = System.console().readLine()
	int option = Integer.parseInt(choice)
	switch (choice){
		case "0":
			carryOn = false
			break
		case "1":
			print "Enter binary form-: "
			String input = System.console().readLine()
			println "Decimal result is: "+ binary2decimal(input)
			println ""
			break
		case "2":
			print "Enter decimal number: "
			String input = System.console().readLine()
			println "Binary result is: " + decimal2Binary(input)
			println ""
			break
		default:
			println ("** Invalid Option Entered **")
	}
}
println "Good Bye!"







