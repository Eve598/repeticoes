package poo;

public class Info_pessoa {
    public static void main(String[] args) {
        Pessoa bebe = new Pessoa();

        bebe.nome = "Robson";
        bebe.idade = 2;
        bebe.genero = "Masculino";
        bebe.nascionalidade = "Brasileiro";
        bebe.etnia = "Preto";
        bebe.altura = 0.60;

        System.out.println("Nome: " + bebe.nome);
        System.out.println("Idade: " + bebe.idade + " anos");
        System.out.println("Gênero: " + bebe.genero);
        System.out.println("Nacionalidade: " + bebe.nascionalidade);
        System.out.println("Etnia: " + bebe.etnia);
        System.out.println("Altura: " + bebe.altura + " metros");
    }
}
