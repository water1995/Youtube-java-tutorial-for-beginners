package inheritance;

public class myclass{
	
	public static void main(String[] args) {
		
		rectangle rec = new rectangle();
		triangle tri = new triangle();
		rec.set_values(10,10);
		tri.set_values(10,10);
		
		System.out.println(rec.area());
		System.out.println(tri.area());
	}
}