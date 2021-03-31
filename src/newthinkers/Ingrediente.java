package newthinkers;

class Ingrediente {
    private String nome;
    private String validadeIngrediente;

    public Ingrediente(String nome, String validadeIngrediente){
        this.nome = nome;
        this.validadeIngrediente = validadeIngrediente;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setValidade(String validadeIngrediente){
        this.validadeIngrediente = validadeIngrediente;
    }

    public String getValidade(){
        return validadeIngrediente;
    }
}