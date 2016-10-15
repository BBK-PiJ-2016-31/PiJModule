class Point {
	double x
	double y
}
void assignCordinate( Point current) {	// As for user input for the given point
	print "Please enter 'x' coordinate: "
	String str = System.console().readLine()
	current.x = Double.parseDouble(str)
	print "Please enter 'y' coordinate: "
	str = System.console().readLine()
	current.y = Double.parseDouble(str)
}
 double getDistance(Point A, Point B) {	// return the distance as per the given formula between two points
 	return (Math.sqrt (((A.x-B.x) * (A.x-B.x)) + ((A.y-B.y) * (A.y-B.y))))
 }

 Point A = new Point()
 println " Enter details of the first coordinate"
 assignCordinate(A)
 Point B = new Point()
 println " Enter details of the second coordinate"
 assignCordinate(B)
 Point C = new Point()
 println " Enter details of the third coordinate"
 assignCordinate(C)

 double ab = getDistance (A,B)
 println "Distance from A to B is: " + ab
 double bc = getDistance (B,C)
 println "Distance from B to C is: " + bc
 double ca = getDistance (C,A)
 println "Distance from C to A is: " + ca

 if (ab<bc) {  
 	if (ab<ca){
 		println "Distance from A to B is the shortest" 
 	} else {
 		println "Distance from C to A is the shortest"  			
 	}
 } else {
 	if (bc<ca) {
 		println "Distance from B to C is the shortest" 
 	} else {
	 	println "Distance from C to A is the shortest"	
 	}
 }