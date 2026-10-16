package fundamentals;
import java.util.Scanner;
public class CountNumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int count=0;
		
			for(int i=num;i>0;i=i/10) {
				count++;
			}
		
		System.out.println(count);
		sc.close();

	

}
}
