package p3.atv11;
import java.util.Scanner;
public class contas{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String nomeCliente; 
        long numConta;
        long saldo;
        char answer;

        System.out.println("me informem seu nome");
        nomeCliente = sc.nextLine();
       

        System.out.println("me informem sua conta");
        numConta = sc.nextLong();

        System.out.println("me informem seu saldo");
        saldo = sc.nextLong();

        contaPoupanca clienteAdicionando = new contaPoupanca(nomeCliente, numConta, saldo);
        contaEspecial clienteRetirando = new contaEspecial(nomeCliente, numConta, saldo);

        System.out.println(" o que você deseja fazer?");
        System.out.println("a) sacar");
        System.out.println("b) depositar");
        System.out.println("c) atualizar");
        System.out.println("d) mostrar saldo");

        answer = sc.next().charAt(0);
        if(answer == 'a'){
            long saque;
            System.out.println("quanto você deseja sacar?");
            saque = sc.nextLong();
            clienteRetirando.atualizar(saque);
            System.out.println("você ficou com um saldo de:" + clienteRetirando.getSaldo());
        }else if(answer == 'b'){
            long deposito;
            System.out.println("quanto você deseja depositar?");
            deposito = sc.nextLong();
            clienteAdicionando.atualizar(deposito);
            System.out.println("você ficou com um saldo de:" + clienteAdicionando.getSaldo());
        }else if(answer == 'c'){
            long novosaldo;
            novosaldo = sc.nextLong();
            clienteAdicionando.setSaldo(novosaldo);
            System.out.println("seu novo saldo é: "+ clienteAdicionando.getSaldo());
            
        }else if(answer == 'd'){
            long saldoAtual = clienteAdicionando.getSaldo();
            System.out.println("seu saldo atual é:" + saldoAtual);
        }
    }
}