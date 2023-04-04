package atv12;

public class assalariado extends empregado{
    double salario;

    assalariado(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);      
        this.nome = nome;
    }

    public double vencimento(){
        return this.salario;
    }

}
