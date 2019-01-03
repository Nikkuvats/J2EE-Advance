import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		int num=0;
		int arr[]=new int[10];
		int element=0;
		System.out.print("Enter size of Array: \n");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.print("Enter element of Array: \n");
		for(int i=0; i<size;i++)
		{
		arr[i]=sc.nextInt();
		num=arr[i];
		System.out.println(num);
		}
	}
}
