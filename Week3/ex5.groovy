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

double getParameter (Rectangle current){						// Seperate function for calculations.
	double result = 2 * (current.downRight.x - current.upLeft.x)	// both sides are equal lengths of a rectangle to * 2
	result +=  (2 * (current.upLeft.y - current.downRight.y))		// Add it to the result, same for the other two sides
	return result
}

double getArea (Rectangle current){
	double result = (current.downRight.x - current.upLeft.x)	// Side x side = area. No need to times by 2 here.
	result *=  (current.upLeft.y - current.downRight.y)
	return result
}

Rectangle A = new Rectangle()
println " Please assign the coordinates -"
assignCordinate(A)

println " *** Parameter *** : " + (getParameter(A))		// Print the result directly by showing the return value of the functions
println " ***    Area   *** : " + (getArea(A))