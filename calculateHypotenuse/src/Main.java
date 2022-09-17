import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	import java.util.Scanner;

        public class calculateHypotenuse {
            public static void main(String[] args) {
        /*
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of first side: ");
        a = input.nextInt();
        System.out.print("Enter value of second side: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse: "+c);
        */

                //Area of triangle
                int a, b, c;
                double area;
                Scanner input = new Scanner(System.in);
                //System.out.println("Area is = a*b*c");

                System.out.print("Enter value for a:");
                a = input.nextInt();


                System.out.print("Enter value for b:");
                b = input.nextInt();


                System.out.print("Enter value for c:");
                c = input.nextInt();


                System.out.println("a is = " + a);
                System.out.println("b is = " + b);
                System.out.println("c is = " + c);

                area = a * b * c;
                System.out.println("Area of triangle is: " + area);


            }
        }

    }
}
