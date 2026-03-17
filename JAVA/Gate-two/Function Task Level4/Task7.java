public class Task7 {

    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        double principal = 5000;  
        double rate = 5;        
        double time = 3;          

        double interest = simpleInterest(principal, rate, time);
        System.out.println("Simple Interest = " + interest);
    }
}
