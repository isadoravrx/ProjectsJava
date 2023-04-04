package atv12;
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome,sobrenome,cpf;
        System.out.println("digite o nome");
        nome = sc.nextLine();
        System.out.println("digite o sobrenome");
        sobrenome = sc.nextLine();
        System.out.println("digite o cpf");
        cpf = sc.nextLine();
        System.out.println("o funcionário é qual das opções abaixo?");
        System.out.println("a) assalariado");
        System.out.println("b) comissionado");
        System.out.println("c) horista");
        char answer = sc.next().charAt(0);
        if(answer == 'a'){
            System.out.println("digite o salario dele");
            double salario = sc.nextDouble();
            assalariado obj = new assalariado(nome, sobrenome, cpf, salario);
            System.out.println("o salário é:" + obj.vencimento());
            
        }else if(answer == 'b'){
            System.out.println("digite o total de vendas dele");
            double vendas = sc.nextDouble();
            System.out.println("digite a taxa de comissão");
            double taxaComissao = sc.nextDouble();
            comissionado obj = new comissionado(nome, sobrenome, cpf, vendas, taxaComissao);
            System.out.println("o salário será:" + obj.vencimento());
        }else if(answer == 'c'){
            System.out.println("digite o preço das horas trabalhadas por ele");
            double precohora = sc.nextDouble();
            System.out.println("digite a quantidade de horas trabalhadas");
            double horasTrabalhadas = sc.nextDouble();
            horista obj = new horista(nome, sobrenome, cpf, precohora, horasTrabalhadas);
            System.out.println("o salário será:" + obj.vencimento());
        }else{
            System.out.println("Resposta não válida");
        }
    }
}
