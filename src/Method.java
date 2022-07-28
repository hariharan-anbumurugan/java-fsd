
public class Method {
	public int multiply(int a,int b) {
		int x=a*b;
		return x;
	}
	public static void main(String[]args) {
		Method a=new Method();
		int ans=a.multiply(21,4);
		System.out.println("Multiplication is :"+ans);
		
	}
	
	
}
