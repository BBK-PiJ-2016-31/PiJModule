print "Enter Marks: "
String marks=System.console().readLine()
int examMark=Integer.parseInt(marks)
if (examMark>=70){
	println "An exceptional result!"
	println "We except a first class project"
} else if(examMark>=50){
	println "A satisfactory result!"
	println "You may proceed with your project"
} else {
	println "Iam afraid you've failed!"
	println "You can try next year"
}