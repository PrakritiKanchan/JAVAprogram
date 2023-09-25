import java.util.Scanner;
public class concatinate_string {
    public static void main(String[] args) {
        String a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first String");
        a=sc.nextLine();
        System.out.println("Enter the second String");
        b=sc.nextLine();
        a=a.concat(b);
        System.out.println("string after concatination "+a);
    }
}
