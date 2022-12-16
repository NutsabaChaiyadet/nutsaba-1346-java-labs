package chaiyadet.nutsaba.lab2;

public class MoneyProcessor {
    public static void main(String[] args) {
        if (args.length == 4) {
            int n1000 = Integer.parseInt(args[0]);
            int n500 = Integer.parseInt(args[1]);
            int n100 = Integer.parseInt(args[2]);
            int n20 = Integer.parseInt(args[3]);
            Double total = (double)(n1000 * 1000)+(double)(n500 * 500)+(double)(n100 * 100)+(double)(n20 * 20); 
            System.out.println("Total Money is "+total);
        }
        else {
            System.out.println("Usage: MoneyProcessor <# of 1,000 Baht Notes> <# of 500 Baht Notes> <# of 100 Baht Notes> <# of 20 Baht Notes>");
        }
    }
}
