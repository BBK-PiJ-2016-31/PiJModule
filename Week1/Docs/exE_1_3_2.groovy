int f1=0
while (f1!=-1){
	print "Enter time: "
	String str1=System.console().readLine()
	f1=Integer.parseInt(str1)

	if ((f1>=1800) && (f1<2400)) {
		println "Good Night"
	} else if((f1>=1200) && (f1<1800)) {
		println "Good Afternoon"
	}else if((f1==2400) || (f1<1200 && f1>0)){
		println "Good Morning"
	} else{
		println "??????"
	}
}