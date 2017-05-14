print "Enter first number: "
String str1=System.console().readLine()
print "Enter second number: "
String str2=System.console().readLine()

int f1=Integer.parseInt(str1)
int f2=Integer.parseInt(str2)

if (f2!=0){
	String result= ((f1%f2)>0)? "No" : "Yes"
	println result
} else {
	println "Cannot divide by 0"
}
