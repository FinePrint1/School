package Everything;

public class Fraction {
	private int num;
	private int denom;
	
	public Fraction() {
		num = 0;
		denom = 1;
	}
	
	public Fraction(int n) {
		num = n;
		denom = 1;
	}
	
	public Fraction(int n, int d) {
		if(d != 0) {
			num = n;
			denom = d;
			reduce();
		}
		
		else {
			throw new IllegalArgumentException("Fraction constuction error: denominator is 0");
		}
	}
	
	
	
	public Fraction(Fraction other) {
		num = other.num;
		denom = other.denom;
	}
	
	public Fraction add(Fraction other) {
		int newNum = num * other.denom + denom * other.num;
		int newdenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}
	
	public Fraction add(int m) {
		return new Fraction(num + m * denom, denom);
		
	}
	
	public Fraction multiply (Fraction other) {
		int newNum = num * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}
	
	public Fraction multiply(int m) {
		return new Fraction(num * m, denom);
	}
	
	public double getValue() {
		return (double)num / (double)denom;
	}
	
	public String toString() {
		return num + "/" + denom;
	}
	
	public void reduce() {
		if(num == 0) {
			denom = 1;
			return;
		}
		
		if(denom < 0) {
			num = -num;
			denom = -denom;
		}
		
		int q = gcf(Math.abs(num), denom);
		num /= q;
		denom /= q;
	}
	
	public int gcf(int n, int d) {
		if(n <= 0 || d <= 0) {
			throw new IllegalArgumentException("gcf precondition failed:" + n + " ' " + d);
		}
		
		if
	}
}





































