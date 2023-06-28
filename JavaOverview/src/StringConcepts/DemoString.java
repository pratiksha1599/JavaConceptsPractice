package StringConcepts;

public class DemoString {

	public static void main(String[] args) {

		String s1 = "Hello";
		// String d = s.concat("world");
		// System.out.println(d);

		// double equals to method

		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println("------------------------");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true

		StringBuffer s4 = new StringBuffer("hi");
		StringBuffer s5 = new StringBuffer("hi");
		System.out.println("stringBuffer equals method");
		System.out.println(s4.equals(s5));
		System.out.println(s4 == s5);

		// String

		// equals method: used for content comparison

		// StringBuffer
		// equals method: used for reference comaparison

		String s = "Rutuja";
		System.out.println(s.length());

		String st = "absbbj";
		System.out.println(st.replace('a', 'b'));

		System.out.println(st.indexOf('z')); // -1 z is not availabe in the string

		System.out.println(s.lastIndexOf('j'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}
