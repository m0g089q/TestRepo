
import java.util.*;


class Hello{
public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Summation of numbers "+(num1+num2));
		System.out.println("difference b/w numbers "+(num1-num2));
		System.out.println("Product of numbers "+(num1*num2));
	 }
}