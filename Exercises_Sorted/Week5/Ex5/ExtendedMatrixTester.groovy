Matrix abc = new Matrix(5,5); // row = 0-4 , column = 0-4

abc.setElement(2,3,6);
abc.setElement(1,1,12);
abc.setElement(2,6,18);
abc.setElement(4,3,100);

abc.setRow(0,"10,10,10,10,50")

abc.setColumn(1,"6,6,6,6,6")
String str = abc.toString();
println str;

//abc.prettyPrint();
abc.setMatrix("10,10,10,10,10;1,1,1,1,1;2,2,2,2,2;3,3,3,3,3;20,20,20,20,20")
abc.prettyPrint();
