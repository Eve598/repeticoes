package laco_for;

public class Contagem_regressiva {

    public static void main(String[] args) throws InterruptedException {
        int i = 10;

        while (i > 0) {
            System.out.println("Contagem regressiva: " + i);
            Thread.sleep(1000); 
            i--;
        }

        System.out.println(" Decolar!");
    }
}
