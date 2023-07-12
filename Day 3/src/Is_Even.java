import java.util.Scanner;
public class Is_Even {
public int isEven(int num) {
	if((num&1)==0) {
   	 return 2;
    }
    else {
   	 return 1;
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc=new Scanner(System.in);
             Is_Even obj=new Is_Even();
             System.out.print("Enter a number:");
             int num=sc.nextInt();
             System.out.println(obj.isEven(num));
            	 
	}

}
