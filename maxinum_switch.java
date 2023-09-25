import java.util.Scanner;
public class maxnum_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        switch(maxnum_switch){
            case 1:
                System.out.println("MAXIMUM NUMBER " +b);
                break;
            case 2:
                System.out.println("MAXIMUM NUMBER "+a);
                break;
            default:
                System.out.println("BOTH ARE EQUAL");
                break;
        }
    }
}
