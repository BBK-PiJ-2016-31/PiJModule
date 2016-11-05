Employee abc = new Employee(2);
String str;
boolean cont= true
while (cont){
	print "ID: ";
	str = System.console().readLine();
	int num = Integer.parseInt(str);
	print "Name: ";
	str = System.console().readLine();
	cont=abc.addRecord(num, str);
}
println "Program complete! Good Bye!"