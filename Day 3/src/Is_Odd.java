import java.util.Scanner;
public class Is_Odd {
public int FindOdd(int num) {
	if((num%2==1)|(num%2==-1)) {
		return 2;
	}
	else {
		return 1;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           Is_Odd obj=new Is_Odd();
           System.out.println("Enter a number:");
           int num1=sc.nextInt();
          System.out.println(obj.FindOdd(num1));
           
	}

}
