public class motorista{
    double a,b,c;
    double saldo;
    public motorista(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculo(){
        double delta = Math.pow(b,2) - (4 * this.a * this.c);
        double raizO = (-this.b + Math.sqrt(delta))/ (2 * this.a);
        double raizT = (-this.b - Math.sqrt(delta))/ (2 * this.a);
        if(raizO > 0 && raizT < 0){
            return raizO;
        }
        else if(raizO < 0 && raizT > 0){
            return raizT;
        }
        else if(raizO > 0 && raizT > 0){
            return raizO;
        }

        return 0;
    } 

}