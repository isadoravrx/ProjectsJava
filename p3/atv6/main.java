package p3.atv6;
import java.util.Scanner;

public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double raio, x,y, xCentro, yCentro;
        raio = sc.nextDouble();
        x = sc.nextDouble();
        y = sc.nextDouble();
        xCentro = sc.nextDouble();
        yCentro = sc.nextDouble();
        isInside teste = new isInside(raio, x, y, xCentro, yCentro);
        System.out.println(teste.inOrOut());
        
    }
}