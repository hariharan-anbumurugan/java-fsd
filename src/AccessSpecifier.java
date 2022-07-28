//Class having default access modifier
class defAccessModifier{
	void display()
	{
		System.out.println("I'm using default access specifier");
	}
	}
public class AccessSpecifier {
	public static void main(String[]args){
	//default
	System.out.println("Default Access Specifier");
	defAccessModifier obj= new defAccessModifier();
	obj.display();
}}

