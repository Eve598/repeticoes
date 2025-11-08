package laco_for;

public class Tabuada {
    public static void main(String[] args) throws InterruptedException {
        int total;

        for (int i = 1; i <= 10; i++) {


            for (int j = 0; j <= 20; j++) {
                total = i * j;
                System.out.println(i + " X " + j + " = " + total);
                Thread.sleep(100);
            }

            System.out.println("======================");
            System.out.println("Tabuada do " + i + " finalizada");
            System.out.println("======================");
        }
    }
}
