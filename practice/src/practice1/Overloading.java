package practice1;

public class Overloading {

	public static void main(String[] args) {
		add(12,10);
		add(17,19);
		
	}
    public static void add (int a, int b) {
    	System.out.println(a+b);
    }
    	public static void add(double a, double b) {
    		System.out.println(a+b);
    	}
    	public static void add(float a,float b) {
    		System.out.println(a+b);
    	}
    }
    
