int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear; // Get age as in how many years old
String result = (ageAprox > 17) ? "" : "not "  // either leave result blank or fill it with "not" if age>17
println "It seems you are " + result + "an adult." // print it seems.... anadult  - or -  "not" an adult