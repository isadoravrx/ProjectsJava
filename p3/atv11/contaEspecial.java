package p3.atv11;

public class contaEspecial extends contaBancaria {

    private long limite = -200;

    public contaEspecial(String nome, long numeroDaConta, long saldo) {
        super(nome, numeroDaConta, saldo);
        
    }

    public void atualizar(long valor) throws Exception{
        sacar(valor);
    }
}
