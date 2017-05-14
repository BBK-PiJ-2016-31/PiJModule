class Point {
	double x
	double y
}

class Rectangle{
	Point upLeft = new Point()				// Need to initialise the points to avoid error (nullpointer)
	Point downRight = new Point()
}

void assignCordinate( Rectangle current) {	// Get entire rectangle then assign co-ordinates
	print "Please enter upper left 'x' coordinate: "
	String str = System.console().readLine()
	current.upLeft.x = Double.parseDouble(str)

	print "Please enter upper left 'y' coordinate: "
	str = System.console().readLine()
	current.upLeft.y = Double.parseDouble(str)

	print "Please enter down right 'x' coordinate: "
	str = System.console().readLine()
	current.downRight.x = Double.parseDouble(str)

	print "Please enter down right 'y' coordinate: "
	str = System.console().readLine()
	current.downRight.y = Double.parseDouble(str)
}
void assignPointCoordinates (Point newPoint) {
	print  " Please enter the new point's 'x' coordinate: "	// then get the coordinates of the new point from the user
	String str = System.console().readLine()
	newPoint.x = Double.parseDouble(str)
	print  " Please enter the new point's 'y' coordinate: "
	str = System.console().readLine()
	newPoint.y = Double.parseDouble(str)

}

boolean checkBoundaries (Point newPoint, Rectangle given){ // if the coordiate is after first x and before next x and also below upper y and above lower y then is it inside
	if (((newPoint.x>=given.upLeft.x) && (newPoint.x<=given.downRight.x)) && ((newPoint.y<=given.upLeft.y) && (newPoint.y>=given.downRight.y))) {
		return true
	} else {
		return false
	}
}

Rectangle A = new Rectangle()
println " FIRST RECTANGLE :-"
assignCordinate(A)
Rectangle B = new Rectangle()
println " SECOND RECTANGLE :-"
assignCordinate(B)
println " NEW POINT :-"
Point newPoint = new Point()
assignPointCoordinates(newPoint)

boolean first = checkBoundaries(newPoint,A)
boolean second = checkBoundaries(newPoint,B)

if (first) { println " Point lies in first rectangle "}
if (second) { println " Point lies in second rectangle "}
if (!first && !second) { println "Point lies outside both rectangles"}


