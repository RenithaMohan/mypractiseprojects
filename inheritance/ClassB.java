package inheritance;

public class ClassB extends ClassA {
	public void methodZ()
	   {
	     System.out.println("class Z method");
	   }
	   public static void main(String args[])
	   {
	     ClassB obj = new ClassB();
	     obj.methodA(); //calling grand parent class method
	     obj.methodA(); //calling parent class method
	     obj.methodZ(); //calling local method
	  }


}
