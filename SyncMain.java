import java.util.Scanner;

class Payroll {
    synchronized void employee_payroll(Double basicPay) {
        // Calculate gross pay
        Double grossPay = basicPay * 1.2;

        // Calculate net pay
        Double deductions = grossPay * 0.2;
        Double netPay = grossPay - deductions;

        // Print results
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Net pay: $" + netPay);
    }
}

class Manager extends Thread {
    private Payroll payroll;
    private Double basicPay;

    Manager(Payroll payroll, Double basicPay) {
        this.payroll = payroll;
        this.basicPay = basicPay;
    }

    public void run() {
        System.out.println("Manager Net Pay:");
        payroll.employee_payroll(basicPay);
    }
}

class Programmer extends Thread {
    private Payroll payroll;
    private Double basicPay;

    Programmer(Payroll payroll, Double basicPay) {
        this.payroll = payroll;
        this.basicPay = basicPay;
    }

    public void run() {
        System.out.println("Programmer Net Pay:");
        payroll.employee_payroll(basicPay);
    }
}

public class SyncMain {
    public static void main(String[] args) {
        // Create a shared Payroll object
        Payroll payroll = new Payroll();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic pay for Manager: ");
        Double managerPay = scanner.nextDouble();

        System.out.print("Enter basic pay for Programmer: ");
        Double programmerPay = scanner.nextDouble();

        // Create Manager and Programmer threads
        Manager manager = new Manager(payroll, managerPay);
        Programmer programmer = new Programmer(payroll, programmerPay);

        // Start the threads
        manager.start();
        try {
            manager.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        programmer.start();
    }
}
