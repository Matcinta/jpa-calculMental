import java.util.ArrayList;

public class Operation {

    private int nbOperations;
    private Operator operator;
    private ArrayList<String> operators;
    private ArrayList<Integer> operands;
    private int result;

    public Operation() {
        operators = new ArrayList<>();
        operands = new ArrayList<>();

    }

    public int getNbOperations() {
        return nbOperations;
    }

    public void setNbOperations(int nbOperations) {
        this.nbOperations = nbOperations;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ArrayList<String> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<String> operators) {
        this.operators = operators;
    }

    public ArrayList<Integer> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<Integer> operands) {
        this.operands = operands;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void generateOperation() {
        // le nb d'operations de ma classe Calculgen est égal à un chiffre aléatoire entre 1 et 3
        this.nbOperations = (int) (Math.random() * 3 + 1); // Math.random multiplie le nombre suivant par un nb situé entre 0 et 0,99999
        // on construit un tableau contenant les 4 opérateurs possibles
        String[] nb = {"+", "-", "/", "x"};
        //on initialise une variable j qui va permettre d'aller chercher un opéateur de ce tableau
        int j = 0;
        //génere de 1 à 3 opérateurs qui seront stockés dans une ArrayList
        for (int i = 0; i < this.nbOperations; i++) {
            // on associe un chiffre aléatoire entre 0 et 3 à j (correspond aux index possibles du tableau)
            j = (int) (Math.random() * 4);
            // l'opérateur présent à l'index déterminé aléatoirement ci-dessus est ajouté à la liste des opérateurs
            operators.add(nb[j]);
            //la boucle est effectuée autant de fois qu'il y a d'opérations (entre 1 et 3 opérations)
        }
        //génere 2, 4 ou 6 opérandes qui seront stockées dans une ArrayList
        for (int i = 0; i < this.nbOperations * 2; i++) {
            j = (int) (Math.random() * 10 + 1);
            operands.add(j);
        }
    }

    public void generateResult() {
        int j = 0;
        for (int i = 0; i < this.nbOperations; i++) {
            switch (operators.get(i)) {
                case "+":
                    result = result + operands.get(j) + operands.get(j + 1);
                    break;
                case "-":
                    result = result + operands.get(j) - operands.get(j + 1);
                    break;
                case "x":
                    result = result + operands.get(j) * operands.get(j + 1);
                    break;
                case "/":
                    int temp = operands.get(j) * operands.get(j + 1);
                    operands.set(j, temp);
                    result = result + operands.get(j) / operands.get(j + 1);
                    break;
            }
            j += 2;
        }


    }

    @Override
    public String toString() {
        return ""  + operators + operands + result;
    }
}




