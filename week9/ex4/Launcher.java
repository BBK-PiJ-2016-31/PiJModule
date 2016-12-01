public class Launcher{
	public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch(){
		StackImplementer<Integer> s = new StackImplementer<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.push(4);
		s.push(5);
		s.push(6);
		s.pop();
		s.push(7);
		s.push(8);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		// StackImplementer<String> m = new StackImplementer<String>();
		// m.push("a");
		// m.push("b");
		// m.push("c");
		// m.pop();
		// m.pop();
		// m.pop();
		StackImplementer<Double> n = new StackImplementer<Double>();
		n.push(1.1);
		n.push(2.2);
		n.push(3.3);
		n.pop();
		n.pop();
		n.pop();
	}
}