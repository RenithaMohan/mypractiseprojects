package throwandthrow;
import java.io.IOException;  
public class throw2 {
	void m()throws IOException{  
		throw new IOException("device error");//checked exception  
		  }  
		void n() throws IOException{  
		m();  
		  }  
		void p(){  
		try{
		n();  
		   }
		catch(Exception e)
		{
		System.out.println("exception handled");
		}  
		}  
		public static void main(String args[]){  
		   throw2 obj=new throw2();  
		obj.p();  
		System.out.println("normal flow...");  
		  }  


}
