public class OurMain {

	public static void main(String[] args) {
		Stack i = new Stack();

		System.out.println("Stack is empty: "+i.empty());
		
		i.push(1);
		i.push(2);
		i.push(3);
		i.push(4);
		i.pop();
		i.pop();
		i.push(5);
		i.push(6);
		i.push(7);
		i.push(8);
		i.push(9);
		i.push(10);
		
		System.out.println("Stack is empty: "+i.empty());

		i.pop();
		i.pop();
		i.pop();
		i.push(11);
		i.pop();
		i.pop();
		i.pop();
		i.pop();
		i.pop();
		i.push(12);
		i.pop();
		i.pop();
		i.pop();
	}
	
}