import java.util.Scanner;

/**
 * Main class
 */
public class Encryption_of_Message {
	
	public static String encrypt(String message){
		String eMessage="";
		
		for (int i=0;i<message.length();i++){
			if (message.charAt(i)>48&&message.charAt(i)<=57){
				eMessage+=(char)(message.charAt(i)+1);
			}
			else if (message.charAt(i)=='a'){
				eMessage+='e';
			}
			else if (message.charAt(i)=='e'){
				eMessage+='a';
			}
			else if (message.charAt(i)=='o'){
				eMessage+='u';
			}
			else if (message.charAt(i)=='u'){
				eMessage+='o';
			}
			else if (message.charAt(i)=='i'){
				eMessage+='!';
			}
			else if (message.charAt(i)==' '){
				eMessage+='+';
			}
			else if (message.charAt(i)=='z'){
				eMessage+='b';
			}
			else if (message.charAt(i)=='0'){
				eMessage+='1';
			}
			else if (message.charAt(i)>=97&&message.charAt(i)<122){
				
				if(message.charAt(i)+1=='a'||message.charAt(i)+1=='e'||message.charAt(i)+1=='i'||
					message.charAt(i)+1=='o'||message.charAt(i)+1=='u') 
					eMessage+=(char)(message.charAt(i)+2); 
				else if(message.charAt(i)!='a'&&message.charAt(i)!='e'&&message.charAt(i)!='i'&&
					message.charAt(i)!='o'&&message.charAt(i)!='u')
					eMessage+=(char)(message.charAt(i)+1);	
			}
			
		}
		
		return eMessage;
	}	
    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String code = in.nextLine();
		
		System.out.print(encrypt(code.toLowerCase()));		
    }
}
