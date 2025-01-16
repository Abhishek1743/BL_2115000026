import java.util.*;
public class program1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter your choice");
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Sum is " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction is "+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication is " + (a*b));
                break;
            case 4:
                System.out.println("Division is " + (a/b));
                break;
            default:
                System.out.println("Error! Wrong number entered ");
        }
    }
}
