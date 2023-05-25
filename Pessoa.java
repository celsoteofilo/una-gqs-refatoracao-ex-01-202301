import java.util.Scanner;

public class Pessoa {
  public int idade;
  public String cartaoVacinaEmDia;
  public String teveSintomasRecentemente;
  public String teveContatoComPessoasSintomaticas;
  public String estaRetornandoViagem;
  public int porcentagemInfeccao;
  public String orientacaoFinal;

  public void coletaIdade(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nInforme a sua idade: ");
    pessoa.idade = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer após a leitura do inteiro
  }
}
