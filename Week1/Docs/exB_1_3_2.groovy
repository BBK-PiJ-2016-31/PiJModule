print "Enter Husband's Salary: "
String j=System.console().readLine()
int a=Integer.parseInt(j)

print "Enter wife's Salary: "
String k=System.console().readLine()
int b=Integer.parseInt(k)
println "--------------"

String result= ((a+b)>40000)? "Higher Income Bracket":"Lower Income Bracket"
println result
println ""