import java.util.Scanner;

public class HelloUser
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Hello " + name);
    }

}