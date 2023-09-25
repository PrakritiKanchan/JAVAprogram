import java.util.Scanner;
public class uppercase_lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("This Character is a Lowercase Alphabate");
        }
        else{
            System.out.println("This character is a Uppercase Alphabate");
        }
    }
}
