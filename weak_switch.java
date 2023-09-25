import java.util.Scanner;
public class weak_switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int weak_switchnum;
        System.out.println("Enter any weak number");
        weak_switchnum =sc.nextInt();
        switch(weak_switchnum){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THRUSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            }
        }
}
