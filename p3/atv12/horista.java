package atv12;

public class horista extends empregado{
    double precohora;
    double horasTrabalhadas;

    horista(String nome, String sobrenome, String cpf,double precohora, double horasTrabalhadas){
        super(nome, sobrenome, cpf);
        this.precohora = precohora;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double vencimento(){
        return precohora * horasTrabalhadas;
    }


}
