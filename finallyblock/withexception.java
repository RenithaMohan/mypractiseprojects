package finallyblock;

public class withexception {

	public static void main(String[] args) {
		try{
			int number=5/0;  
			System.out.println(number);  
			  }  
			catch(NullPointerException e)
			  {
				System.out.println(e);
			  }  
			finally
			  {
		System.out.println("finally block is always executed");
			  }  
			System.out.println("then rest of the code...");  
			  }

		// TODO Auto-generated method stub

	}

