import java.util.Scanner;

public class Digitos_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int mil,cent,dec,uni;
        System.out.println("Dame un número de 4 cifras y te diré sus dígitos");
        numero = sc.nextInt();
        if(0 <= numero && numero <= 9999) {
            mil = numero / 1000;
            cent = (numero % 1000) / 100;
            dec = ((numero % 1000) % 100) / 10;
            uni = (((numero % 1000) % 100)) % 10;
            System.out.println("El 1º dígito es: " + mil);
            System.out.println("El 2º dígito es: " + cent);
            System.out.println("El 3º dígito es: " + dec);
            System.out.println("El 4º dígito es: " + uni);
        }
        else{
            System.out.println("El número "+numero+" no es valido");
        }
    }
}
