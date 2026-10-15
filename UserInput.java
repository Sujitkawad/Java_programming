import java.util.Scanner;

public class UserInput {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your mark: ");
      Float mark = sc.nextFloat();

        System.out.println("Age is: " + age + "\nName is: " + name + "\nMark is: " + mark );

    }
}
