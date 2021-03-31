package newthinkers;

public class Funcionario{
    private String nome;
    private String atividade;

    public Funcionario(String nome, String atividade){
        this.nome = nome;
        this.atividade = atividade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAtividade(String atividade){
        this.atividade = atividade;
    }

    public String getAtividade(){
        return atividade;
    }
}