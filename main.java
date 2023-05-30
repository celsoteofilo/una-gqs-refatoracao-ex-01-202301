import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Mensagem mensagem = new Mensagem();

        boolean erroTentativas = false;
        int contadorErros = 0;

        // Coleta de dados
        System.out.println("Informe o seu nome:");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Informe a sua idade:");
        pessoa.setIdade(scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer do scanner

        // Perguntas com respostas "SIM" ou "NAO"
        while (contadorErros < 3) {
            erroTentativas = false;

            if (!erroTentativas) {
                erroTentativas = mensagem.realizaPerguntaCartaoVacina(pessoa, scanner);
            }

            if (!erroTentativas) {
                erroTentativas = mensagem.realizaPerguntaTeveSintomasRecentemente(pessoa, scanner);
            }

            if (!erroTentativas) {
                erroTentativas = mensagem.realizaPerguntaTeveContatoPessoasSintomaticas(pessoa, scanner);
            }

            if (!erroTentativas) {
                erroTentativas = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);
            }

            if (erroTentativas) {
                contadorErros++;
                System.out.println("Resposta inválida. Por favor, tente novamente.");
            } else {
                contadorErros = 0;
            }
        }

        if (contadorErros == 3) {
            System.out.println("Não foi possível realizar o diagnóstico.");
            System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
        } else {
            CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
            calculoPorcentagem.calculaPorcentagem(pessoa);

            mensagem.imprimirDadosPessoa(pessoa);
            mensagem.imprimirProbabilidadeInfeccao(pessoa);
            mensagem.imprimirOrientacaoFinal(pessoa);
        }

        scanner.close();
    }
}
