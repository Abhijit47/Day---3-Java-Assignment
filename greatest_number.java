import java.util.Scanner;

class greatest_number {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number :: ");
        a = sc.nextInt();
        System.out.print("Enter the 2nd number :: ");
        b = sc.nextInt();
        System.out.print("Enter the 3rd number :: ");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest number is :: " + a);
        }
        else if (b > a && b > c ) {
            System.out.println("The greatest number is :: " + b);
        }
        else {
            System.out.println("The greatest number is :: " + c);
        }

        System.out.println("***END OF PROGRAMME***");
    }
    
}