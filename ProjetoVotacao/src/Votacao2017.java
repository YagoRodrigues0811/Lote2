import java.io.IOException;
import java.util.Scanner;

public class Votacao2017 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int op = 0;
		int op2 = 0;
		Votacao[] votacoes = new Votacao[100];
		ClasseMetodos classeMetodos = new ClasseMetodos();
		while (op != 9) {
			System.out.println("Sistema de Votação\n1- Carregar Seção/Numero Eleitor\n2- Classificar por Seção\n3- Gravar Registros\n4- Mostrar Indicadores\n9- Finalizar");
			op = sc.nextInt();

			switch (op) {
			case 1:
				votacoes = classeMetodos.CadastraVotacao(votacoes);
				break;

			case 2:
				votacoes = classeMetodos.ClassificaSecao(votacoes);
				break;

			case 3:
				classeMetodos.GravarVotacao(votacoes);
				break;

			case 4:

				while (op2 != 9) {
					System.out.println("Mostrar Indicadores\nEstatisticas de Votação em 2016\n1- Quantidade Eleitores por Seção\n2- Seção com Maior e Menor número de Eleitores\n3- Quantidade de votos por candidato\n4- 10 Primeiros colocados\n9- Finaliza consulta");
					op2 = sc.nextInt();

					switch (op2) {
					case 1:
						classeMetodos.QuantSecao(votacoes);
						break;

					case 2:
						classeMetodos.SecaoMaiorMenor(votacoes);
						break;

					case 3:
						classeMetodos.QuantVotosCand(votacoes);
						break;

					case 4:
						classeMetodos.MaisVotados(votacoes);
						break;

					case 9:
						break;

					default:
						System.out.println( "Opção Inválida");
						break;
					}
				}

				break;

			case 9:
				break;

			default:
				System.out.println("Opção Inválida");
				break;

			}
		}
		sc.close();

	}

}
