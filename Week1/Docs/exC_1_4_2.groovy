println "Please choose an option:"
println "For ’Checking you balance’, please enter 1" 
println "For ’Purchases’, please enter 2"
println "For ’Refunds’, please enter 3"
println "For ’Queries about the warranty’, please enter 4" 
println "For ’Returning faulty goods’, please enter 5" 
println "For any other query, please enter 0"
String s = System.console().readLine()

switch (s) {
case "1":
// go and check balance
	println "1 pressed"
   break;
 case "2":
 	println "2 pressed"
// go and purchase something
   break;
 case "3":
 	println "3 pressed"
// go and process refunds
   break;
 case "4":
// go and answer queries
   break;
 case "5":
// return faulty goods
   break;
 default:
// go and talk with a human operator
break; }