public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000;
        double rate =0.05;
        int n = 15;
        int years = 20;
        double amount = principal * Math.pow(1 + (rate / n), n* years);
        double compoundInterest = amount - principal;
        System.out.println("The compound interest is:"+ compoundInterest);
    }
}
