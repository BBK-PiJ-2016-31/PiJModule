

void decimal2Hex(String input){
	int temp=Integer.parseInt(input)	// GET IN DECIMAL FORMAT
	if (temp<16){			
		switch (temp){				// GIVE STRAIGHT ANSWER IF 0-15
			case 0..9:
				println "Hex result is: " + temp
				break		
			case 10:
				println "Hex result is: A"
				break
			case 11:
				println "Hex result is: B"
				break
			case 12:
				println "Hex result is: C"
				break
			case 13:
				println "Hex result is: D"
				break
			case 14:
				println "Hex result is: E"
				break
			case 15:
				println "Hex result is: F"
		}
	} else {					
		int temp2=0
		boolean complete = false
		String result=""
		while (!complete){
			if (temp<16){complete = true}	// THIS WILL NEVER BE TRUE THE FIRST TIME IN METHOD
			temp2 = temp % 16				// CHECK TH REMAINDER AFTER DIVING BY 16
			switch (temp2){					// KEEP CREATING A STRING OF ANSWER
				case 0..9:
					result += temp2			// AUTOMATICALLY CONVERT INT TO STRING
					break
				case 10:
					result += "A"
					break
				case 11:
					result += "B"
					break
				case 12:
					result += "C"
					break
				case 13:
					result += "D"
					break
				case 14:
					result += "E"
					break
				case 15:
					result += "F"
			}
			temp = temp/16
		}
		String finalResult=""	
		for (int temp3=0 ; temp3<result.length() ; temp3++) {	// REVERSE THE STRING SO RESULT IS CORRECT
			finalResult += result.charAt((result.length()-temp3)-1)
		}
		println "Hex result is: " + result
	}
}

void hex2Decimal(String input){
	String str = input.substring(2,input.length())  // we have the complete hex value
	int decimalValue=0
	for (int i=0;i<str.length();i++){
		char value = str.charAt((str.length()-i)-1) // get the Least Significant Bit first
		if (value.isLetter()){		// if it is a letter, load value straightaway
			switch (value){			// value x 16 to the power (of place in the string)
				case 'A':
					decimalValue += (10 * 16.power(i))	// i holds the place in the string
					break
				case 'B':
					decimalValue += (11* 16.power(i))
					break
				case 'C':
					decimalValue += (12 * 16.power(i))
					break
				case 'D':
					decimalValue += (13 * 16.power(i))
					break
				case 'E':
					decimalValue += (14 * 16.power(i))
					break
				case 'F':
					decimalValue += (15 * 16.power(i))
			}

		} else {
			int temp = value-48		// to get the decimal value from the string value 0..9
			if (i==0) {				// if first iteration
				decimalValue += temp
			} else {
				decimalValue += (temp*(16.power(i)))
			}
		}
	}
	println "Decimal result is: " + decimalValue
}

boolean checkHex(String input){			// compare the first two substrings to check decimal OR hex
	if (input.length()<3) {return false}	// length of hex will always be more than 2
	String temp = input.substring(0,2)
	if (temp.equals("0x") || temp.equals("0X")){
		return true
	} else {
		return false
	}
}

print " Enter your text: "
String input = System.console().readLine()
boolean hex = checkHex(input)
if (hex) {
	hex2Decimal(input)
} else {
	decimal2Hex(input)
}