import java.util.Scanner;
public class Second_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number:");
         int number1=0;
         int number=sc.nextInt();
         if(number<0) {
       	  number1=number*-1;
         }
         int temp=number1/10;
         int second_last=temp%10;
         System.out.println("The second last digit of "+number+" is "+second_last);
	}

}
