import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string::");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char a=Character.toUpperCase(s.charAt(i));
             if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                
                System.out.println(s.charAt(i));
        }
    }
     
    }
}
