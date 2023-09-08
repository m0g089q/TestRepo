import java.util.*;
public class ScanInput {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c)
			System.out.println(a+" is the maximum value");
		else if(b>c)
			System.out.println(b+" is the maximum value");
		else
			System.out.println(c+" is the maximum value");

	}

}
