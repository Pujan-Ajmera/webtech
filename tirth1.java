import java.util.*;
public class tirth1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int a=sc.nextInt();
		int p=a;
		int sum=0;
		int count=0;
		for(int i=0;a!=0;i++){
			count++;
			a=a/10;
		}
		if(count%2==0){
			for(int i=0;(count)>i;i++)
			{
				sum=sum*10+p%10;
			}
			System.out.println(""+sum);
		}
		else{
			System.out.println("Number Of Digit Is Odd.");
		}
	}
}