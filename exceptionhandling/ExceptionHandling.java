package exceptionhandling;

class ExceptionHandling extends Exception{
	   String str1;
	   ExceptionHandling(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new ExceptionHandling("This is My error Message");
		}
		catch(ExceptionHandling exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }}
