import java.util.Scanner;

class Bank {
    private long accnum;

    public Bank(long accnum) {
        this.accnum = accnum;
    }

    public long getAcc() {
        return accnum;
    }
}

class Customer {
    private String name;
    private Bank bank;

    public Customer(long accnum, String name) {
        this.bank = new Bank(accnum);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAcc() {
        return bank.getAcc();
    }
}

class Deposit {
    private double payment;
    private Bank bank;

    public Deposit(long accnum, double payment) {
        this.bank = new Bank(accnum);
        this.payment = payment;
    }

    public double getPay() {
        return payment;
    }

    public void setPay(double payment) {
        this.payment = payment;
    }

    public long getAcc() {
        return bank.getAcc();
    }
}

public class Mainstud2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please put in customer name: ");
        String b = obj.nextLine();
        System.out.print("Please put in account number: ");
        long a = obj.nextLong();
        System.out.print("Please put in payment: RM");
        double c = obj.nextDouble();
        Customer x = new Customer(a, b);
        System.out.println("-----------------------------------------------");
        System.out.println(" MAYBANK BERHAD ");
        System.out.println("-----------------------------------------------");
        System.out.println("\nAccount number is: " + x.getAcc());
        System.out.println("Customer name is: " + x.getName());
        Deposit y = new Deposit(a, c);
        System.out.println("Payment is: RM" + y.getPay());
        System.out.println("-----------------------------------------------");
    }
}