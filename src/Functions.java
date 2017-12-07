import java.util.Scanner;

/**
 * @Author:Shea Salloum
 * @Lisence:GNU
 * @Date: 12/2/17
 */
public class Functions {
    public static void main (String [] args){
        System.out.println("SUM"+f(input()));
        System.out.println("To the 10th Power" + power(input()));
        System.out.println("Square Root " + root(input()));
        System.out.println("Absolute Value: " + absolute(input()));

        
    }
    //x+y
    public static int f(int x){
        return x + 1;
    }
    //power of 10
    public static int power (int x){
        return x*x*x*x*x*x*x*x*x*x;

    }
    public static double root (int x){
        return Math.sqrt(x);

    }
    //absolute value method
    public static int absolute (int x){
        return (x>=0)?x:(-1*x);
    }
    public static int input (){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        return keyboard.nextInt();
    }
}
