import java.util.Scanner;

public class alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        display(str);
    }

    public static void display(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

}