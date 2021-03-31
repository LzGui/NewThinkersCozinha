
package newthinkers;

public class Main {
  public static void main(String[] args) {

    System.out.println("Iniciando os trabalhos do resturante");

    // Cozinha Mineira
    Cozinha cozMin = new Cozinha();
    cozMin.setNome("Bão di +");
    cozMin.setTipoCozinha("Mineira");
    cozMin.setHoraAbrir(14);
    cozMin.setHoraFechamento(20);
    cozMin.setPratoPrincipal("Feijoada");

    Ingrediente ingredienteFei1 = new Ingrediente("Arroz", "22/12/2021");
    cozMin.getIngrediente().add(ingredienteFei1);
    Ingrediente ingredienteFei2 = new Ingrediente("Farinha", "22/12/2021");
    cozMin.getIngrediente().add(ingredienteFei2);
    Ingrediente ingredienteFei3 = new Ingrediente("Feijão", "22/01/2022");
    cozMin.getIngrediente().add(ingredienteFei3);
    Ingrediente ingredienteFei4 = new Ingrediente("Carne de Porco", "24/04/2021");
    cozMin.getIngrediente().add(ingredienteFei4);
    Ingrediente ingredienteFei5 = new Ingrediente("Linguiça", "11/05/2021");
    cozMin.getIngrediente().add(ingredienteFei5);

    Funcionario funcMin1 = new Funcionario("João", "Cozinheiro");
    cozMin.getFuncionario().add(funcMin1);
    Funcionario funcMin2 = new Funcionario("Carla", "Gerenteo");
    cozMin.getFuncionario().add(funcMin2);
    Funcionario funcMin3 = new Funcionario("Lucas", "Garçom");
    cozMin.getFuncionario().add(funcMin3);
    Funcionario funcMin4 = new Funcionario("Diego", "Caixa");
    cozMin.getFuncionario().add(funcMin4);

    // Cozinha Chinesa
    Cozinha cozChi = new Cozinha();
    cozChi.setNome("Takonfome");
    cozChi.setTipoCozinha("Chinesa");
    cozChi.setHoraAbrir(10);
    cozChi.setHoraFechamento(21);
    cozChi.setPratoPrincipal("Yakissoba");

    Ingrediente ingredienteChi1 = new Ingrediente("Champignon", "02/06/2021");
    cozChi.getIngrediente().add(ingredienteChi1);
    Ingrediente ingredienteChi2 = new Ingrediente("Brócolis", "19/04/2021");
    cozChi.getIngrediente().add(ingredienteChi2);
    Ingrediente ingredienteChi3 = new Ingrediente("Macarrão", "24/09/2021");
    cozChi.getIngrediente().add(ingredienteChi3);
    Ingrediente ingredienteChi4 = new Ingrediente("Carne", "07/04/2021");
    cozChi.getIngrediente().add(ingredienteChi4);

    Funcionario funcChi1 = new Funcionario("Ping", "Cozinheiro");
    cozChi.getFuncionario().add(funcChi1);
    Funcionario funcChi2 = new Funcionario("Pong", "Gerente");
    cozChi.getFuncionario().add(funcChi2);
    Funcionario funcChi3 = new Funcionario("Xing Ling", "Garçom");
    cozChi.getFuncionario().add(funcChi3);

    // Cozinha Italiana
    Cozinha cozIta = new Cozinha();
    cozIta.setNome("Capisce");
    cozIta.setTipoCozinha("Italiana");
    cozIta.setHoraAbrir(13);
    cozIta.setHoraFechamento(22);
    cozIta.setPratoPrincipal("Yakissoba");

    Ingrediente ingredienteIta1 = new Ingrediente("Molho", "05/04/2021");
    cozIta.getIngrediente().add(ingredienteIta1);
    Ingrediente ingredienteIta2 = new Ingrediente("Macarrão", "18/07/2021");
    cozIta.getIngrediente().add(ingredienteIta2);
    Ingrediente ingredienteIta3 = new Ingrediente("Carne", "15/04/2021");
    cozIta.getIngrediente().add(ingredienteIta3);

    Funcionario funcIta1 = new Funcionario("Marcone", "Cozinheiro");
    cozIta.getFuncionario().add(funcIta1);
    Funcionario funcIta2 = new Funcionario("Franccesco", "Garçom");
    cozIta.getFuncionario().add(funcIta2);

    //TODO implementar a saída
    System.out.println(cozMin);
    System.out.println(cozIta);
    System.out.println(cozChi);
  }
}
