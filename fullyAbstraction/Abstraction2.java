package fullyAbstraction;

public class Abstraction2 implements Abstraction1{

	@Override
	public void log() {
		System.out.println("kfc");
	}

	@Override
	public void dress() {
		
		System.out.println("shirts and pants");	
	}

	@Override
	public void chairs() {
		
		System.out.println("105");
	}
	public static void main(String[] args) {
		Abstraction2 n= new Abstraction2();
		n.log();
		n.chairs();
		n.dress();
		
	}

}
