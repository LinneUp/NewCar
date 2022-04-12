package pecas;
import pecas.Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite qual a marca do carro:");
        String marcaCarro = scanner.nextLine();

        System.out.println("Digite qual a cor que você deseja no carro:");
        String cor = scanner.nextLine();

        System.out.println("Digite Quantas Portas você deseja no carro:");
        String portas = scanner.nextLine();

        System.out.println("Você deseja teto solar no carro?");
        String teto = scanner.nextLine();

        System.out.println("Você deseja Ar Condicionado?");
        String ar = scanner.nextLine();

        System.out.println("Voce deseja camera de ré?");
        String re = scanner.nextLine();

        System.out.println("Tipo de Combustivel?");
        String combustivel = scanner.nextLine();


        carro novocarro = new carro(1,2,3,4,6);

        System.out.println("Marca do carro: " + marcaCarro);

        System.out.println("Cor do carro: " + cor);

        System.out.println("Quantidade de Portas: " + portas);

        System.out.println("Inclui teto solar: " + teto);

        System.out.println("Tem ar-condicionado: " + ar);

        System.out.println("Tem camera de ré: " + re);

        System.out.println("Quantidade de Pneus: " + novocarro.getQPneus());

        System.out.println("Quantidade de Calotas: " + novocarro.getCalotas());

        System.out.println("Quantidade de parafusos nos Pneus: " + novocarro.getParafusos());

        System.out.println("Tipo de Combustivel: "+combustivel);

        System.out.println("Numero do Chassi: "+novocarro.getnChassi());

        System.out.println("Ano de fabricação: "+novocarro.getAnoFabricacao());

        System.out.println("Montagem do Carro Concluída! ");



    }

}
