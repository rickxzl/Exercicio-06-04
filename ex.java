import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class ex {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50; 
        double measure = 53.234567;

        System.out.println(" Products : " +product1 + " , which price is $ " + price1);
        System.out.println(" Products : " +product2 + " , which price is $ " + price2);

        System.out.println(age + " years old, code " + code + ", gender " + gender);
        System.out.println(measure + " weight with eight decimal places: " + String.format(" %.2f ", measure));
        System.out.println(" Rounded (three decimal places): " + String.format(" %.2f ", measure));
        Locale locale = Locale.US;
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.printf("Us decimal point: " + nf.format(measure));

    }
}