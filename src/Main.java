import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = sc.nextLine();


        String stringInvertida = InverterString.inverterString(stringOriginal);


        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);

        sc.close();
    }
}