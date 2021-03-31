package newthinkers;

import java.util.List;
import java.util.ArrayList;

class Cozinha{

  private String nome;
  private String tipo;
  private int horaAbertura;
  private int horaFechamento;
  private String pratoPrincipal;
  private List<Ingrediente> ingrediente = new ArrayList<>();
  private List<Funcionario> funcionario = new ArrayList<>();

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setTipoCozinha(String tipo){
    this.tipo = tipo;
  }

  public String getTipoCozinha(){
    return tipo;
  }

  public void setHoraAbrir(int horaAbertura){
    this.horaAbertura = horaAbertura;
  }

  public int getHoraAbrir(){
    return horaAbertura;
  }

  public void setHoraFechamento(int horaFechamento){
    this.horaFechamento = horaFechamento;
  }

  public int getHoraFechamento(){
    return horaFechamento;
  }

  public void setPratoPrincipal(String pratoPrincipal){
    this.pratoPrincipal = pratoPrincipal;
  }

  public String getPratoPrincipal(){
    return pratoPrincipal;
  }

  public void setIngrediente(List<Ingrediente>ingredientes){
    this.ingrediente = ingredientes;
  }

  public List<Ingrediente> getIngrediente(){
    return ingrediente;
  }

  public void setFuncionario(List<Funcionario>funcionario){
    this.funcionario = funcionario;
  }

  public List<Funcionario> getFuncionario(){
    return funcionario;
  }

}