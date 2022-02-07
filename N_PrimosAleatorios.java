import java.util.Random;

public class N_PrimosAleatorios {

    public static int funAleatorio(){
        Random random = new Random();
        int aleatorio = 23 + random.nextInt(84+1 - 23);
        return aleatorio;
    }

    public static boolean funPrimo(int x){
        boolean primo = true;
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        int rand;
        for (int i = 1; i <=10; i++){
            rand = funAleatorio();
            if (funPrimo(rand)){
                System.out.println("El número "+rand+" es primo");
            }
            else {
                System.out.println("El número "+rand+" no es primo");
            }
        }
    }
}
