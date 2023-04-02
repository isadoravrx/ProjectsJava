import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = sc.nextLine();
        System.out.println("digite seu pos");
        int pos = sc.nextInt();
        System.out.println("digite seu email");
        String email = sc.nextLine();
        email = sc.nextLine();
        System.out.println("digite sua palavra chave");
        String palavraChave = sc.nextLine();
        System.out.println("digite sua idade");
        int idade = sc.nextInt();
        aluno obj = new aluno( nome,  pos,  email,  palavraChave, idade);
    }
}

