
public class aluno extends pessoa{
    
    private int idade;
    public aluno(String nome, int pos, String email, String palavraChave,int idade){
        super(nome, pos, email, palavraChave);
        this.idade = idade;
    }
}
