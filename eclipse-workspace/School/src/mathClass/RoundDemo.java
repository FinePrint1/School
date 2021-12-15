package mathClass;

public class RoundDemo {
	public static void main(String[] args) {
		
		System.out.println(" Round 1  Round: " + Math.round(5.3));
		
		System.out.println(" Round 2  Round: " + Math.round(5.8));
		
		System.out.println(" Round 1  Ceil: " + Math.ceil(5.3));
		
		System.out.println(" Round 1  Ceil: " + Math.ceil(5.8));
		
		System.out.println(" Round 1  Floor: " + Math.floor(5.3));
		
		System.out.println(" Round 1  Floor: " + Math.floor(5.8));
		
		
		int num = (int) (6 * Math.random()) + 1;
		
		System.out.println("num = " + num);
	}
}