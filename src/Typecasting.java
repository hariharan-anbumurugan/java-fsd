
public class Typecasting {

	public static void main(String[]args) {
		
		System.out.println("Implicit Type Casting");
		char a='H';
		System.out.println("Value of a:"+a);
		int b=a;
		System.out.println("Value of b:"+b);
		float c=a;
		System.out.println("Value of c:"+c);
		long d=a;
		System.out.println("Value of d:"+d);
		double e=a;
		System.out.println("Value of e:"+e);
		
		System.out.println("\n");
		
		System.out.println("Explicit Type casting");
		
		double p=95.5;
		int q=(int)p;
		System.out.println("Value of p:"+p);
		System.out.println("Value of q:"+q);
		
		
	}
}
