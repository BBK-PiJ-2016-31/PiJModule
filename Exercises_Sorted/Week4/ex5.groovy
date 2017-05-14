class Point {
	double x
	double y

// calculates the distance to a given point
double distanceTo (Point p){
	return Math.sqrt (((x-p.x).power(2)) + ((y-p.y).power(2)))
}
// creates a point at the origin and calculates the distance to origin
double distanceToOrigin (){
	Point origin = new Point()
	origin.x=0
	origin.y=0
	return distanceTo(origin)
}
// moves the points of existing object by proving x and y
void moveTo (double x, double y){
	this.x=x
	this.y=y
}
// move the points to a given point
void moveTo (Point newPoint){
	this.x = newPoint.x
	this.y = newPoint.y
}
// creates a copy of the given point and returns the new point
Point clone () {
	Point newPoint = new Point()
	newPoint.x = this.x
	newPoint.y = this.y
	return newPoint
}
// returns a copy of the opposite point by multiplying a given point co-ordinates by -1
Point opposite () {
	Point newPoint = new Point()
	newPoint.x = ((this.x) * -1)
	newPoint.y = ((this.y) * -1)
	return newPoint
}

}

Point aPoint = new Point()
aPoint.x = 5
aPoint.y = 5

Point anotherPoint = new Point()
anotherPoint.x = 10
anotherPoint.y = 10
// we have two points by here

// Calculate the distance between the two
println "Distance between two point: " + aPoint.distanceTo(anotherPoint)
println "Distance to origin Point1: " + aPoint.distanceToOrigin()
println "Distance to origin Point2: " + anotherPoint.distanceToOrigin()
println ""
// move apoint to anotherpoint
println "Before change- aPoint.x: "+ aPoint.x+" aPoint.y: "+aPoint.y
aPoint.moveTo(4.5,7)
println "aPoint.x changed to: " + aPoint.x + " aPoint.y changed to: " + aPoint.y
println ""
// move aPoint to have same co-ordinate to anotherPoint
println "Before change- aPoint.x: "+ aPoint.x+" aPoint.y: "+aPoint.y
aPoint.moveTo(anotherPoint)
println "aPoint.x changed to: " + aPoint.x + " aPoint.y changed to: " + aPoint.y
println ""
// get a clone point
Point clonePoint = aPoint.clone()
println "clonePoint.x: " + clonePoint.x + " clonePoint.y: " + clonePoint.y
println ""
// get the opposite points

Point oppositePoint = aPoint.opposite()
println "oppositePoint.x: " + oppositePoint.x + " oppositePoint.y: " + oppositePoint.y
println ""

