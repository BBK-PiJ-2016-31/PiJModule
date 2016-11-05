
	print "Enter a number for array dimension: ";
	String str = System.console().readLine();
	int num = Integer.parseInt(str);

	Target target = new Target(num);	// create a user defined array of same size in all 3 dimensions
	boolean cont = true;	
	println "Here they come! Try to bring the plane down!"

while (cont){
	print "Enter a coordinate x: ";
	str = System.console().readLine();
	int x = Integer.parseInt(str);
	print "Enter a coordinate y: ";
	str = System.console().readLine();
	int y = Integer.parseInt(str);
	print "Enter a coordinate z: ";
	str = System.console().readLine();
	int z = Integer.parseInt(str);			// get all the x,y,z co-ordinates

	String msg = (target.fire(x,y,z));		// send it to the java file as ints
											// the message back turns into STRING
	if (msg.equals("OUT_OF_RANGE")){		// check return types
		println "That shot was way out of range! Try harder!"
	}else if (msg.equals("FAIL_LEFT")){
		println "You missed! The target is to the Left!"
	} else if (msg.equals("FAIL_RIGHT")){
		println "You missed! The target is to the Right!"
	} else if(msg.equals("FAIL_HIGH")){
		println "You missed! The target is Above!"
	}else if (msg.equals("FAIL_LOW")){
		println "You missed! The target is Below"
	} else if (msg.equals("FAIL_LONG")){
		println "You missed! The target is Further"
	}else if (msg.equals("FAIL_SHORT")){
		println "You missed! The target is Nearer!"
	} else if (msg.equals("HIT")){
		print "Well Done! Would you like to play another round? (y or n): "
		str = System.console().readLine();
		if (str.equals("n")){
			cont = false;
			println "--------GOOD BYE----------"
		} else {
			target = null;			
			target = new Target(num);
			println "Here they come! Try to bring the plane down!"
		}
	}

}