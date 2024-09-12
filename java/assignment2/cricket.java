import java.util.Scanner;

public class cricket {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;
   
    public void accept(int pid,String pname,int totalRuns, int inningsPlayed,int notOutTimes){
        this.pid=pid;
        this.pname=pname;
        this.totalRuns=totalRuns;
        this.inningsPlayed=inningsPlayed;
        this.notOutTimes=notOutTimes;
    }
    public void calculateaverage(){
        double avg=totalRuns/(inningsPlayed-notOutTimes+1);
        System.out.println("average::"+avg);
        
    }
    public void display(){
        System.out.println(" player id:"+pid);
        System.out.println(" player name is :"+pname);
        System.out.println(" player total run  :"+totalRuns);
        System.out.println(" player play inning :"+inningsPlayed);
        System.out.println(" player not out mathes :"+notOutTimes);
    }
     public static void main(String[] args)
     {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int n = sc.nextInt();

       
        cricket[] players = new cricket[n];

       
        for (int i = 0; i < n; i++) {
            players[i] = new cricket(); 
            System.out.println("\nEnter details for player " + (i + 1) + ":");
            
            System.out.print("Enter Player ID: ");
            int pid = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Total Runs: ");
            int totalRun = sc.nextInt();

            System.out.print("Enter Innings Played: ");
            int inning_played = sc.nextInt();

            System.out.print("Enter Not Out Count: ");
            int notout = sc.nextInt();

           
            players[i].accept(pid, name, totalRun, inning_played, notout);
        }

        

        System.out.println("the player detailes: ");
        for (int i = 0; i < n; i++) {
            players[i].display();
            players[i].calculateaverage();
        }
    }
    

}

