import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, phy, che, polish, history;

        Scanner inp = new Scanner(System.in);

        System.out.print("grades for Math: ");
        mat = inp.nextInt();
        //System.out.println("Math="+mat);

        System.out.print("grades for physics: ");
        phy = inp.nextInt();

        System.out.print("grades for chemistry: ");
        che = inp.nextInt();

        System.out.print("grades for polish: ");
        polish = inp.nextInt();

        System.out.print("grades for history: ");
        history = inp.nextInt();

        int total = (mat + phy + che + polish + history);
        double average = total / 5;

        System.out.println("Average is = " + average);

        System.out.println(average >= 50 ? "Passed" : "Failed");
    }
}
