public class Arithmetic {
    public static void main(String args[]) {

        System.out.println("Arithmetic Operations::::");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int ch = Integer.parseInt(args[0]);

        double num1, num2;
        System.out.print("Enter the first number: ");
        num1 = Double.parseDouble(args[1]);
        System.out.print("Enter the second number: ");
        num2 =  Double.parseDouble(args[2]);

        double r = 0;

        switch (ch) {
            case 1:
                r = num1 + num2;
                System.out.println("Addition::: " + r);
                break;
            case 2:
                r = num1 - num2;
                System.out.println("Subtraction::: " + r);
                break;
            case 3:
                r = num1 * num2;
                System.out.println("Multiplication::: " + r);
                break;
            case 4:
            r = num1 / num2;
            System.out.println("Division::: " + r);
                break;
            default:
                System.out.println("Invalid choice:::");
        }
    }
}