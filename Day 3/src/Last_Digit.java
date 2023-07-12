import java.util.Scanner;
public class Last_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number:");
          int number=sc.nextInt();
          int number1=0;
          if(number<0) {
        	  number1=number*-1;
          }
          int last=number1%10;
          System.out.println("The last number of"+" "+number+" is"+"  "+last);
          
	}

}
