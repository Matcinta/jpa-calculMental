import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Testons votre calcul mental efficiency");
        System.out.println("Regles du jeu: \nNous allons vous posez une série de 10 calculs mentaux à effectuer");
        System.out.println("Chaque bonne réponse rapporte un point");

        System.out.println("Veuillez entrer votre pseudo :");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();


        for (int i = 1; i < 11; i++) {
            System.out.println("Manche: " + i);
            Operation operation = new Operation();
            // proposer un calcul aléatoire
            operation.generateOperation();
            operation.getResult();

            System.out.println(operation.toString());

            //scanner la réponse
            sc.nextInt();


        }

        System.out.println("Bravo, la partie est terminée");


    }
}


