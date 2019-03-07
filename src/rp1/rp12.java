package rp1;

public class rp12 {

	public static void main(String[] args) {
int x=10;
		
		try{
			System.out.println(x/0);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(IllegalStateException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("After the exception occurs,");
		}
       System.out.println("Hello");
       System.out.println("Lets continue...");
	}

	}


