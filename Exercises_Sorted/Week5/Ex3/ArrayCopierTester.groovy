ArrayCopier abc = new ArrayCopier();
int[] destination =	[1,2,3,4,5,6,5,4,4,2,1,8,8,8,1];
int[] source=		[1,2,3,4,5,6,7,8,9,9,9,9,9,9,0]

int[] result = abc.copy(source,destination);

print "Destination Array = "
for (int i=0; i<result.length; i++){
	print result[i];
}
println "";
