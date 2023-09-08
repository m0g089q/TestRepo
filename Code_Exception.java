import java.util.InputMismatchException;
import java.util.Scanner;

class DivideByZeroException extends Exception{
	public DivideByZeroException(String msgCode,String msgText){
		System.out.println(msgCode+":"+msgText);
	}
}

class MathOperations{
	public static long add(int num1,int num2){
		return (long)(num1+num2);
	}
	public static int sub(int num1,int num2){
		return num1-num2;
	}
	public static long multiply(int num1,int num2){
		return (long)(num1*num2);
	}
	public static double divide(int num1,int num2){
		return (double)(num1/num2);
	}
}

/**
 * Main class
 */
public class Code_Exception {
	
    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
		int integer1,integer2;
		
		Scanner inScanner = new Scanner(System.in);
			
		try{
			integer1 = inScanner.nextInt();
			integer2 = inScanner.nextInt();

			System.out.println("Summation="+MathOperations.add(integer1,integer2));
			System.out.println("Difference="+MathOperations.sub(integer1,integer2));
			System.out.println("Product="+MathOperations.multiply(integer1,integer2));
			if (integer2==0)
				throw new DivideByZeroException("ERROR502","Divide by zero Exception");
			System.out.println("Quotient="+MathOperations.divide(integer1,integer2));
			
		}
		catch(DivideByZeroException e){}
		catch(InputMismatchException e){
			System.out.println("ERROR501:Input type not valid integer");
		}
		
		
    }
}
