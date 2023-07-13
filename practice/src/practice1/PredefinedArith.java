package practice1;

public class PredefinedArith {

	public static void main(String[] args) {
	int a =16;
	int b =13;
	
	int c=add(a,b);
	int d=sub(a,b);
	int m=mul(a,b);
	int h=div(a,b);
	
	System.out.println(c);
	System.out.println(d);
	System.out.println(m);	
	System.out.println(h);
	System.out.println(c+d+m+h);
	}
	public static int add(int a, int b) {
		return (a+b);
	}
	public static int sub(int a, int b) {
		return (a-b);
	}
	public static int mul(int a, int b) {
		return (a*b);
	}
	public static int div(int a, int b) {
		return (a/b);
	}
}
