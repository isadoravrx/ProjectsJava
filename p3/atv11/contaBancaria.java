package p3.atv11;

public class contaBancaria {
    private String nome;
    private long numeroDaConta;
    private long saldo;

    public contaBancaria(String nome, long numeroDaConta, long saldo){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void depositar(long deposito){
        this.saldo = this.saldo + deposito;
    }

    public void sacar (long deposito) throws Exception{
        
        if(this.saldo - deposito >= -200){
            this.saldo = this.saldo - deposito;
        }else{
            throw new Exception("a conta ficará mais negativa que o limite");
        }
    }   
}

