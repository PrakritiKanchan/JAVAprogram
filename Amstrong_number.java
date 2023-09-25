import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.out);
		System.out.println("Enter any number");
		int n , num,temp,total=0;
		number=n;
		(while n!=0){
			temp=number %10;
			total=total+temp*temp*temp;
			number/=10;
		}
		if(total==num){
			System.out.println("is Amstrong Number");
		}
		else{
			System.out.println("is not an Amstrong Number");
		}
	}
}
