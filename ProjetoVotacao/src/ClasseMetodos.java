import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ClasseMetodos {

	public Votacao[] CadastraVotacao(Votacao[] vot) {
		Random gerador = new Random();

		for (int i = 0; i < 100; i++) {
			vot[i] = new Votacao();
		}

		for (int i = 0; i < 100; i++) {
			vot[i].numeroSecao = gerador.nextInt(10);
			vot[i].numeroCandidatos = gerador.nextInt(300);
		}
		return vot;
	}

	public Votacao[] ClassificaSecao(Votacao[] vot) {
		Votacao help = new Votacao();

		for (int i = 0; i < 99; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (vot[i].numeroSecao > vot[j].numeroSecao) {
					help.numeroCandidatos = vot[i].numeroCandidatos;
					help.numeroSecao = vot[i].numeroSecao;

					vot[i].numeroCandidatos = vot[j].numeroCandidatos;
					vot[i].numeroSecao = vot[j].numeroSecao;

					vot[j].numeroCandidatos = help.numeroCandidatos;
					vot[j].numeroSecao = help.numeroSecao;
				}
			}
		}

		return vot;
	}

	public void GravarVotacao(Votacao[] vot) throws IOException {
		BufferedWriter write = new BufferedWriter(new FileWriter("Vota��o2017.txt"));

		for (int i = 0; i < 100; i++) {
			write.write(Integer.toString(vot[i].numeroSecao));
			write.newLine();
			write.write(Integer.toString(vot[i].numeroCandidatos));
			write.newLine();
		}
		System.out.println("Arquivo Gerado!!!");
		write.close();

	}

	public void QuantSecao(Votacao[] vot) {
		int[] quant = new int[10];
		String total = "";

		for (int i = 0; i < 100; i++) {
			quant[vot[i].numeroSecao]++;
		}

		for (int i = 0; i < 10; i++) {
			total += "Seção " + i + ": " + quant[i] + " eleitores\n";
		}

		System.out.println(total);

	}

	public void SecaoMaiorMenor(Votacao[] vot) {
		int[] quant = new int[10];
		int menor = Integer.MAX_VALUE, menorP = 0;
		int maior = 0, maiorP = 0;
		String total = "";

		for (int i = 0; i < 100; i++) {
			quant[vot[i].numeroSecao]++;
		}

		for (int i = 0; i < 10; i++) {
			if (quant[i] < menor) {
				menor = quant[i];
				menorP = i;
			}
			if (quant[i] > maior) {
				maior = quant[i];
				maiorP = i;
			}
		}

		total = "A se��o " + maiorP + " teve o maior numero de eleitores = " + maior + "\n";
		total += "A se��o " + menorP + " teve o menor numero de eleitores = " + menor;

		System.out.println(total);

	}

	public void QuantVotosCand(Votacao[] vot) {
		int[] quant = new int[300];
		String total = "";

		for (int i = 0; i < 100; i++) {
			quant[vot[i].numeroCandidatos]++;
		}

		for (int i = 0; i < 300; i++) {
			total += "Candidato " + i + ": " + quant[i] + " Votos\n";
		}

		System.out.println(total);
	}

	public void MaisVotados(Votacao[] vot) {
		int[][] quant = new int[300][2];
		int[] help = new int[2];
		String total = "";

		for (int i = 0; i < 100; i++) {
			quant[vot[i].numeroCandidatos][0]++;
			quant[i][1] = i;
		}

		for (int i = 0; i < 299; i++) {
			for (int j = i + 1; j < 300; j++) {
				if (quant[i][1] > quant[j][1]) {
					help[0] = quant[i][0];
					help[1] = quant[i][1];

					quant[i][0] = quant[j][0];
					quant[i][1] = quant[j][0];

					quant[j][0] = help[0];
					quant[j][1] = help[1];
				}
			}
		}

		for (int i = 299; i > 289; i--) {
			total += 300 - i + "ºlugar: candidato " + quant[i][0] + " com " + quant[i][1] + " votos\n";

		}
		System.out.println(total);

	}

}
