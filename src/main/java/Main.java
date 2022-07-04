/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner; // imports the scanner
public class Main {

    public static void main(String[] args) {
        String name; //sets variable "name"
        Scanner in = new Scanner(System.in); //creates new scanner that takes input from System.in

        System.out.println("What is your name?: ");
        name = in.nextLine(); //reads input line

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + name + ", how are you today?");
        } else {
            System.out.println("Go away " + name);
        }
    }
}