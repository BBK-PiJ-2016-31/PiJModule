int cont=1
boolean sequence = true
boolean firstStart = true
boolean direction = true
boolean goingUp=true
int last=0

while (cont!=-1) {
	print "Please enter a number: "
	String str1 = System.console().readLine()
	cont = Integer.parseInt(str1)
	if (firstStart) {
		last=cont
		firstStart = false
	} else if (direction) {
		direction = false
		if (cont==last+1) {
			goingUp=true
		} else if (cont==last-1){
			goingUp=false
		} else {
			sequence=false
		}
	} else {
		if (goingUp) {
			if (cont!=(last+1) && (cont!=-1)) {
				sequence = false
			}
		} else {
			if (cont!=(last-1) && (cont!=-1)) {
				sequence = false
			}
		}
	}
		last=cont
}
String answer = sequence? "Yes" : "No"
println "Sequence = " + answer