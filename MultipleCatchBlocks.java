import java.util.Scanner;
public class MultipleCatchBlocks {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the divisor to divide 100 : ");
    int divisor = scanner.nextInt();
    try{
    int[] array=new int[10];
    int result = 100/divisor;
    array[10]=result;
    }catch(ArithmeticException e){
    System.out.println("Arithmetic exception has occurred");
    }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Array Index Out Of Bounds Exception has occur red");
    }catch(Exception e){
    System.out.println("Common exception has occurred");
    }
    }
   }
   
