import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age, first name and phone (Separated by space): ");
        int age = scanner.nextInt();
        String name = scanner.next();
        String phone = scanner.next();

        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Worth:\t" + phone);
    }
}
