import java.util.Scanner;
public class month_switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int month_switchnum;
        System.out.println("Enter any month number");
        month_switchnum =sc.nextInt();
        switch(month_switchnum){
            case 1:
                System.out.println("Number of days ==31");
                break;
            case 2:
                System.out.println("Number of days == 29");
                break;
            case 3:
                System.out.println("Number of days == 31");
                break;
            case 4:
                System.out.println("Number of days ==30");
                break;
            case 5:
                System.out.println("Number of days == 31");
                break;
            case 6:
                System.out.println("Number of days ==31");
                break;
            case 7:
                System.out.println("Number of days ==30");
                break;
            case 8:
                System.out.println("Number of days == 31");
                break;
            case 9:
                System.out.println("Number of days == 30");
                break;
            case 10:
                System.out.println("Number of days ==31");
                break;
            case 11:
                System.out.println("Number of days ==30");
                break;
            case 12:
                System.out.println("Number of days ==31");
                break;
        }
    }
    
}
