import java.util.Scanner;

class transpose{

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int t[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix element ::::::");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                t[i][j] = a[j][i];
            }
        }
        System.out.println("orignal matrix:::");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("transpose matrix::::");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

}