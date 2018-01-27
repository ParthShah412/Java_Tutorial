/*This tutorial covers Exception, you would also learn difference between 
* throws and throw in Java*/

public class Tutorial7_8{
	//DividebyZero method is dedicated to show how throws work

	public static void DividebyZero() throws ArithmeticException {
		int result = 7/0;
		System.out.print(result);
	}
	//dummy method is dedicated to show how throw works
	public static void dummy() {
		int result = 0;
		if(result==0) {
			throw new ArithmeticException();
			
		}
	}
	public static void main(String[] args) {
		try {
			//DividebyZero();
			//dummy();e.printStackTrace()
			/*Uncommenting a function at a time makes understanding clearer*/
		}catch(ArithmeticException e) {
			System.err.println("Error!!");
		}finally {
			System.out.println("Program Executed");
		}
	}
}