import java.util.Scanner;

/*7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method.
@006_akash kadbhane_JH
*/

class MathOperation {
        static int  add(int num1 , int num2){
                int add = (num1 + num2) ;
                return add;
        }
        static int subtract(int num1 , int num2){
                int sub = (num1 - num2);
                return sub;
        }
        static int multiply (int num1 , int num2){
                int multi=(num1 * num2);
                return multi;
        }
        static double power(int num1 , int num2){
                double pow = Math.pow(num1, num2);
                return pow;
        }
}

public class DemoOop {
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two integer no.s =");
                System.out.print("Number1=");
                int number1 = sc.nextInt();
                System.out.print("Number2=");
                int number2 = sc.nextInt();

                System.out.println("Addition="+MathOperation.add(number1,number2));
                System.out.println("Subtraction="+MathOperation.subtract(number1,number2));
                System.out.println("Multiplication="+MathOperation.multiply(number1,number2));
                System.out.println("Power="+MathOperation.power(number1,number2));
                sc.close();
        }
       
}


