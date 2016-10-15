class Point {
	double x
	double y
}

class Rectangle{
	Point upLeft = new Point()				// Need to initialise the points to avoid error (nullpointer)
	Point downRight = new Point()
}

void assignCordinate( Point newPoint, Rectangle current) {	// Get entire rectangle then assign co-ordinates
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

	println  " Please enter the new point's 'x' coordinate "	// then get the coordinates of the new point from the user
	str = System.console().readLine()
	newPoint.x = Double.parseDouble(str)
	println  " Please enter the new point's 'y' coordinate "
	str = System.console().readLine()
	newPoint.y = Double.parseDouble(str)

}

void checkBoundaries (Point newPoint, Rectangle A){ // if the coordiate is after first x and before next x and also below upper y and above lower y then is it inside
	if (((newPoint.x>=A.upLeft.x) && (newPoint.x<=A.downRight.x)) && ((newPoint.y<=A.upLeft.y) && (newPoint.y>=A.downRight.y))) {
		println " New point is inside the rectangle "
	} else {
		println " New point is outside the rectangle "
	}
}

Rectangle A = new Rectangle()
println " Please assign the coordinates -"
Point newPoint = new Point()
assignCordinate(newPoint, A)
checkBoundaries(newPoint,A)
