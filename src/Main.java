import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = nome.next().toLowerCase(); // toLowerCase deixa as letras minúsculas após digitar 
        // System.out.println(nomeProduto); // para testar se o sistema pegou o valor digitado

        // switch
        switch (nomeProduto){
            case "banana":
                System.out.println("R$9,90");
                break;

            case "abacate":
                System.out.println("R$ 7,90");
                break;

            case "abacaxi":
                System.out.println("R$ 10,90");
                break;

            default:
                System.out.println("Fruta não cadastrada");
        }
    }
}