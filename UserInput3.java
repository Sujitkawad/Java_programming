import java.util.Scanner;

public class UserInput3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = {10,20,30,40};

        int brr[]= new int [size];
        System.out.println("Enter array elements: ");

        for(int i=0;i<size;i++)
        {
            brr[i]=sc.nextInt();
        }

        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++)
        {
           System.out.print(brr[i]+"\t");
        }
    }
}
