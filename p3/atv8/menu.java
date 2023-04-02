package p3.atv8;
import java.util.Scanner;
public class menu{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long conta, saque, deposito, answer;
        String dia;
        System.out.println("o que você deseja fazer?");
        System.out.println("0 - criar conta");
        System.out.println("1 - depositar");
        System.out.println("2 - sacar");
        System.out.println("qualquer numero menor que 0 - sacar");

        answer = sc.nextLong();

        if(answer == 0){
            
            System.out.println("Informe sua conta");
            conta = sc.nextLong();
            System.out.println("Informe que dia é hoje");
            dia = sc.nextLine();
            dia = sc.nextLine();
            if(dia.equals(banco.domingo.name()) || dia.equals(banco.sabado.name())){
                System.out.println("o banco está fechado, tente outro dia");
            }else{
                System.out.println("o banco está aberto! a sua ação será realizada");
            }
           
        }else if(answer == 1){

            System.out.println("Informe sua conta");
            conta = sc.nextLong();
            System.out.println("Informe o valor do depósito");
            deposito = sc.nextLong();
            System.out.println("Informe que dia é hoje");
            dia = sc.nextLine();
            dia = sc.nextLine();
            if(dia.equals(banco.domingo.name()) || dia.equals(banco.sabado.name())){
                System.out.println("o banco está fechado, tente outro dia");
            }else{
                System.out.println("o banco está aberto! a sua ação será realizada");
            }
            
        }else if(answer == 2){
            
            System.out.println("Informe sua conta");
            conta = sc.nextLong();
            System.out.println("Informe o valor do saque");
            saque = sc.nextLong();
            System.out.println("Informe que dia é hoje");
            dia = sc.nextLine();
            dia = sc.nextLine();
            if(dia.equals(banco.domingo.name()) || dia.equals(banco.sabado.name())){
                System.out.println("o banco está fechado, tente outro dia");
            }else{
                System.out.println("o banco está aberto! a sua ação será realizada");
            }
            
        }else if(answer < 0){
            sc.close();
        }
    }
}