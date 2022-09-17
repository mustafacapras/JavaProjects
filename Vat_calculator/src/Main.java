import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double amount, VatAmount, totalAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        amount = input.nextDouble();
        double condition = amount>=0&& amount<=1000 ? 0.18 : 0.08;

        VatAmount = amount * condition;
        totalAmount = amount + VatAmount;
        System.out.println("amount with VAT: "+totalAmount);

        VatAmount = totalAmount - amount;
        System.out.println("Vat amount: "+VatAmount);

        System.out.println("Vat Rate: "+condition);

    }
}
