import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        int usuario = 1021;
        String agencia;
        String cliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo, por favor digite o numero de sua agência:");
        agencia = sc.nextLine();
        System.out.println("usuario:" + usuario);

        System.out.println("Seu nome: ");
        cliente = sc.nextLine();

        System.out.println("agora insia o valor a ser depositado");
        saldo = sc.nextDouble();

        System.out.println("Olá " + cliente + " obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + usuario +" e seu saldo de " + saldo + " já está disponível para saque");


    }
}
