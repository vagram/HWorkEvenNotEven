import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        countEven();

    }
    public static void countEven(){
        int number = new Scanner(System.in).nextInt();
        if (number%2 == 0){
            System.out.println("Число " + number + " целое" );
        }else System.out.println("Число " + number + " не целое" );

    }
}
