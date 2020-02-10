package Calculator;
import java.util.*;

public class Calculator {
	public static void main(String args[]) {
		try (Scanner s = new Scanner(System.in)) {
			
			int a,b,x=1;
			while(x!=0) {
				System.out.println("Enter first number:");
				a=s.nextInt();
				System.out.println("Enter second number:");
				b=s.nextInt();
				System.out.println("Enter your choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
				int c=s.nextInt();
				
				switch(c) {
				
				case 1:Addition ob1=new Addition();
					   System.out.println("Addition is:"+ob1.add(a,b));
				       break;
				
				case 2:Subtraction ob2=new Subtraction();
				 System.out.println("Subtraction is:"+ob2.sub(a,b));
			           break;   
				
				case 3:Multiplication ob3=new Multiplication();
				 System.out.println("Multiplication is:"+ob3.mul(a,b));
			           break; 
				
				case 4:Division ob4=new Division();
				 System.out.println("Division is:"+ob4.div(a,b));
			           break;  
				case 5:Modulus ob5=new Modulus();
				 System.out.println("Modulus is:"+ob5.mod(a,b));
		           break; 
		        default:System.out.println("Invalid operator") ;
		                break;    
				}
				
				System.out.println("To continue: Press 1\nTo exit: Press 0");
				x=s.nextInt();

			}
		
		}

	}

}
