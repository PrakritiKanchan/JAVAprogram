import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner jk=new Scanner(System.in);
        int n=jk.nextInt();
        int s=0;
        int mul=1;
        while(n!=0){
            int h=n%10;
            s+=h*mul;
            mul=mul*2;
            n/=10;
        }
        System.out.println(s);
    }
}
