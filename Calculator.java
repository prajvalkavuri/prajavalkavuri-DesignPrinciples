import java.lang.*;
import java.util.Scanner;
abstract class operators{
        abstract void getOutput(int a,int b);

}
class Addition extends Operators{
        void getOutput(int num1,int num2){
                System.out.println("result="+(num1+num2));
        }
}
class Subtraction extends Operators{
        void getOutput(int num1,int num2){
                System.out.println("result="+(num1-num2);
        }
}
class Multiplication extends Operators{
        void getOutput(int num1,int num2){
                System.out.println("result="+(num1*num2));
        }
}
class Division extends Operators{
        void getOutput(int num1,int num2){
                System.out.println("result="+(num1/num2));
        }
}
class Calculator{
        public static void main(String args[]){

                Operators oper;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter num1:");
                int num1=sc.nextInt();
                System.out.print("Enter num2:");
                int num2=sc.nextInt();
                System.out.println("Enter an operation");
                char k=sc.next().charAt(0);
                switch(k)
                {
                case'+':
                        oper=new Add();
                        oper.getOutput(num1,num2);
                        break;
                case'-':
                        oper=new Add();
                        oper.getOutput(num1,num2);
                        break;
                case'*':
                        oper=new Add();
                        oper.getOutput(num1,num2);
                        break;
                case'/':
                        oper=new Add();
                        oper.getOutput(num1,num2);
                        break;
                default:
                        System.out.println("incorrect");
                }

        }
}
