package atv12;

public class comissionado extends empregado{
    double totalDeVenda;
    double taxaDeComissao;

    comissionado(String nome, String sobrenome, String cpf,double totalDeVenda, double taxaDeComissao){
        super(nome, sobrenome, cpf);
        this.totalDeVenda = totalDeVenda;
        this.taxaDeComissao = taxaDeComissao;
    }   

    public double vencimento(){
        double salario = (this.totalDeVenda * taxaDeComissao)/100;
        return salario;
    }

}
