package p3.atv6;

public class isInside {
    private double raio,x,y, xCentro, yCentro; 

    isInside(double raio,double x, double y, double xCentro, double yCentro){
        this.raio = raio;
        this.x = x;
        this.y = y;
        this.xCentro = xCentro;
        this.yCentro = yCentro;
    }

    private double distanciaEntrepontos(){
        double subtração1, subtração2,soma, raiz;
        subtração1 = Math.pow(this.xCentro - this.x,2);
        subtração2 = Math.pow(this.yCentro - this.y,2);
        soma = subtração1 + subtração2;
        raiz = Math.sqrt(soma);
        return raiz;            
    }

        String inOrOut(){
        distanciaEntrepontos();
        if(distanciaEntrepontos() == raio){
            return "distância igual ao raio";
        }if(distanciaEntrepontos() > raio){
            return "o ponto está fora";
        }if(distanciaEntrepontos() < raio){
            return "o ponto está dentro";
        }

        return "";
    }
}
