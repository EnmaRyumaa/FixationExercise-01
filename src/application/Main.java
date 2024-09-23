import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        
        System.out.println("\tNumero: ");
        int numero = sc.nextInt();

        System.out.println("\tData (dd/MM/yyyy): ");
        String date = sc.next();

        System.out.println("\tValor do Contrato: ");
        double valor = sc.nextDouble();

        System.out.println("\tNumero de parcelas desejadas: ");
        int qtParcelas = sc.nextInt();
    }
}