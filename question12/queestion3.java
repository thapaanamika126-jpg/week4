import java.util.Scanner;

/**
 * Write a description of class queestion3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class queestion3
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}