
public class Numero_par {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("O número " + i + " é par");
            }
            Thread.sleep(700); 
        }
    }
}
