import java.util.Scanner;
public class passageiro{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String nomePassageiro, nomeMotorista;
        double telefone;
        double notaPassageiro, notaMotorista;
        double a,b,c;
        System.out.println("você deseja fazer uma corrida? y or n");
        char answer = sc.next().charAt(0);
        while(answer == 'y'){
        System.out.println("qual o nome do passageiro?");
        nomePassageiro = sc.nextLine();
        System.out.println("qual o nome do motorista?");
        nomeMotorista = sc.nextLine();
        System.out.println("qual o telefone do passageiro?");
        telefone = sc.nextDouble();
        
        System.out.println("qual o valor de a?");
        a = sc.nextDouble();
        System.out.println("qual o valor de b?");
        b = sc.nextDouble();
        System.out.println("qual o valor de c?");
        c = sc.nextDouble();
        motorista baskara = new motorista(a,b,c);
        double saldo = baskara.calculo();
        saldo = saldo * 10;
        System.out.println(saldo);
        System.out.println("qual a nota do Passageiro?");
        notaPassageiro = sc.nextDouble();
        System.out.println("qual a nota do Motorista?");
        notaMotorista = sc.nextDouble();
        System.out.println("você deseja fazer uma corrida? y or n");
        answer = sc.next().charAt(0);
        }
        sc.close();;
        
    }
}