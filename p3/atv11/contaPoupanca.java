package p3.atv11;

public class contaPoupanca extends contaBancaria{

    private long diaDeRendimento;

    public contaPoupanca(String nome, long numeroDaConta, long saldo) {
        super(nome, numeroDaConta, saldo);
    }

    public void atualizar(long taxaDeRendimento){
        if(taxaDeRendimento < 0){
            System.out.println("essa taxa é negativa, não pode ser adicionada");
        }
        depositar(taxaDeRendimento);
    }
 

}
