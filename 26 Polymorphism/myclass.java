package polymorphism;

public class myclass {
	
	public static void main(String[] args) {
		
		bank abc = new bank_abc();
		bank def = new bank_def();
		bank xyz = new bank_xyz();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());
	}

}
