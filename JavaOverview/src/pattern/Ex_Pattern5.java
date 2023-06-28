package pattern;

public class Ex_Pattern5 {
	public static void main(String[] args) {
		Ex_Pattern5.pattern1(4);
	}
	
	static void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
