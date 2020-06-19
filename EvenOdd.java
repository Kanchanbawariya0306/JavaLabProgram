import java.util.Scanner;

  public class EvenOdd {
	public static void main(String [] args) {
		 Scanner sc= new Scanner(System.in);
		  	System.out.print("Enter the num find even or odd  :");
		  	float  a =sc.nextFloat();
		  	if(a%2==0) {
		  		System.out.print(" is even num " + a);
		  	}
		  	else
		  		System.out.print(" is  not even num" + a);
	}
}
