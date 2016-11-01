ArrayChecker abc = new ArrayChecker();
int[] check =[1,2,3,4,5,6,5,4,4,2,1];
if (!abc.isSymetrical(check)){
	println "Array is NOT symmetrical!"
	int[] reverse = abc.reverse(check);
	for (int i=0;i<reverse.length;i++){
		print reverse[i];
	}
} else {
	println "Array is Symmetrical";
}
println ""