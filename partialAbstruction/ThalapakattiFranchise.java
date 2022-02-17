package partialAbstruction;

public class ThalapakattiFranchise extends ThalapakattiBriyani {
	@Override
	public void chairs() {
		System.out.println("55");
		
	}
	@Override
	public void employee() {
		System.out.println("101");
	}
	public void tables() {
		System.out.println("250");
	}
	public static void main(String[] args) {
		ThalapakattiFranchise n= new ThalapakattiFranchise();
		n.chairs();
		n.employee();
		n.tables();
	}
  
}
