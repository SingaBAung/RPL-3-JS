import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   
        double celsius;

        System.out.println("masuk aja bos");
        celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Hasilnya nih Broo " + fahrenheit + " Fahrenheit");
    }
}
    