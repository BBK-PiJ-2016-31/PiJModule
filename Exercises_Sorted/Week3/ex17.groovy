println " Welcome to My Mail Server!"
int step=1
boolean valid = false
String from
String to
boolean warning = false

while (step<4) {
	print ">>> "
	String input = System.console().readLine()
	if (input=="QUIT") { break }
	if (step==1) {
		valid = checkInput("MAIL FROM: ", input, step)
	} else if (step==2) {
		valid = checkInput("RCPT TO: ", input, step)
	} else if (step==3) {
		if (input=="DATA"){
			readSendEmailMessage()
			step=0			// So we don;t print OK in the last step
			valid = true	// so we can reset step back to 1 below
		} else {
			println "Invalid command."	
		}
	}
	if (valid) { 
			if (step!=0) {println 'OK'}
			step += 1
			valid = false
		}
}
println " Bye! "

void readSendEmailMessage() {
	String user = System.console().readLine()
	String message = ""
	while (user!="."){
		message = message + user + '\n' 
		user = System.console().readLine()				
	}
	println "Sending email..."
	println "from: " + from
	println "to: " + to
	print message
	println "...done!"
}

boolean checkInput(String valid, String input, int step){
	if (input.length()<valid.length()) { 
		println "Invalid command."
		return false
	}

	for (int i=0; i<valid.length();i++){	// Check the first part first i.e. ' MAIL FROM: '
		char check1 = valid.charAt(i)
		char check2 = input.charAt(i)
		if (check1 != check2) {
			println "Invalid command."
			return false
		} // first part matched then move forward else return	
	}

	boolean atSign=false, dot=false
	char check1 = input.charAt(valid.length())

	if (check1.isLetter()) { // if the next is letter than lets check for the ' @ ' and ' . '
		String email = input.substring(valid.length(), input.length()) // capture the email part
		if (step==1) { from = email }		
		if (step==2) { to = email }
		for (int i=0; i<email.length(); i++){
			char temp = email.charAt(i)
			if (temp=='@'){
				if ((i>0) && (i<(email.length()-5))) { atSign = true }
			}
			if (temp=='.'){
				if ((i>0) && (atSign)) { dot = true }
			}
		}
		if (atSign && dot) { 
			return true
		} else {
			println " Invalid email address "
			return false
		}

	} else {
		println " Invalid email address "
		return false
	}
}