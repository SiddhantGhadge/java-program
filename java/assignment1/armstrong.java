

public class armstrong {
   

 
    public static void check(int n) {
        int rem, rev = 0;
        int temp;
        temp=n;
        while (temp != 0) {
            rem = temp % 10;
            rev =rev+(rem*rem*rem);
            temp = temp / 10;

        }
        if (rev == n) {
            System.out.println("this is armstrong number:::"+rev);
        } else {
            System.out.println("this is not armstrong:::"+rev);
        }
    }

    public static void main(String[] args) {
        armstrong a = new armstrong();
        
        a.check(153);
    }
}
