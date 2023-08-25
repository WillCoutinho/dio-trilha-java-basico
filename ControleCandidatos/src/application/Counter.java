package application;
import entities.InvalidParamsException;
import java.util.Locale;
import java.util.Scanner;
import static application.Calc.calc;

public class Counter {

    public static void main(String[] args) throws InvalidParamsException{
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Inform first parameter: ");
        int firstParam = sc.nextInt();
        System.out.print("Inform second parameter: ");
        int secondParam = sc.nextInt();

        try{
            calc(firstParam, secondParam);
        }catch (RuntimeException e){
            throw new RuntimeException("Error not expected: " + e.getMessage());
        }
    }
}
