import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("Seja Bem-vindo ao LavaCar dos BOLAS");

        Carro c = new Carro();
        System.out.println("Qual é o modelo do carro?");
        c.setModeloC(scan.nextLine());
        System.out.println("Qual é a placa do carro?");
        c.setPlacaC(scan.nextLine());
        System.out.println("Qual é o nome do proprietário do carro?");
        c.setProprietarioC(scan.nextLine());
        System.out.println("Selecione o tipo de serviço que gostaria: " +
                " 1 - Lavagem completa  (R$ 250,00) " +
                " 2 - Troca de Oleo  (R$300,00)" +
                "  3 - Sair ");
        i = scan.nextInt();
        if (i == 1) {
            System.out.println("Lavagem Completa solicitada. Dados do carro -  Modelo: " + c.getModeloC() + " / Placa:  " + c.getPlacaC() + " / Proprietário: " + c.getProprietarioC());
            System.out.println("Obrigado e volte sempre!");
        } else if (i == 2) {
            System.out.println("Troca de Oleo solicitada. Dados do carro -  Modelo: " + c.getModeloC() + " / Placa:  " + c.getPlacaC() + " / Proprietário: " + c.getProprietarioC());
            System.out.println("Obrigado e volte sempre!");
        } else {
            System.out.println("Obrigado e volte sempre!");
        }
    }
}