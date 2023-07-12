import java.util.Scanner;
public class Sum_of_last_two_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input=new Scanner(System.in);
          System.out.println("Enter a number:");
          int num1=input.nextInt();
          System.out.println("Enter a number:");
          int num2=input.nextInt();
          if(num1<0) {
        	  num1*=-1;  
          }
          if(num2<0) {
        	  num2*=-1;
        	  
          }
          int last1=num1%10;
          int last2=num2%10;
          System.out.println("The sum of last two digits of "+num1+" and "+num2+" is "+(last1+last2));
	}

}
