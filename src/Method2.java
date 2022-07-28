

//call by value
	public class Method2{
		int val = 120;
		int operation(int val) {
			val=val*10/100;
			return(val);
		}
		public static void main(String args[]) {
			Method2 b=new Method2();
			System.out.println("Before operation value of data is :"+b.val);
			b.operation(100);
			System.out.println("After operation value of data is:"+b.val);
			
		}
	}