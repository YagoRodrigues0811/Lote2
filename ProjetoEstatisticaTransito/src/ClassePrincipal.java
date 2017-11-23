import java.io.IOException;
import java.util.Scanner;

public class ClassePrincipal {
 
	public static void main(String[] args) throws IOException{
		try {
		ClasseMetodos classeMetodos = new ClasseMetodos();
		Scanner sc = new Scanner(System.in);
		Estatistica estatistica = new Estatistica();
		int op = 0;
		
		while(op != 9) {
		System.out.println("-------------------------------------------------\n" + 
				"|	MENU ESTATÍSTICA			|\n" + 
				"| Estatísticas de acidentes em 2015		|\n" + 
				"| 1 - Cadastro Estatística			|\n" + 
				"| 2 - Consulta por tipo de veículo		|\n" + 
				"| 3 - Consulta por quantidade de acidentes	|\n" + 
				"| 4 - Consulta todos as cidades                 |\n" + 
				"| 5 - Consulta maior menor média de acidentes	|\n" + 
				"| 9 - Finaliza.					|\n" + 
				"-------------------------------------------------");
		
		op = sc.nextInt();
		switch (op) {
		case 1:
			 classeMetodos.cadastraEstatistica();
			break;
        case 2:
        	 System.out.println("Digite o código do tipo de veículo para consulta\n1 - Carro\n2 - Moto\n3 - Caminhão\n4 - Ônibus");
			 classeMetodos.consultaBytipoVeículo(sc.nextInt());
			break;	
        case 3:
        	System.out.println("Lista de Estatísticas com Acidentes maior que 100 e menor que 500");
             classeMetodos.consultaByqtdAcidentes();
             break;
        case 4:
        	 estatistica = new Estatistica();
        	 System.out.println("Digite o código da cidade");
        	 estatistica.codCidade = sc.nextInt();
        	 System.out.println("Digite o nome da cidade");
        	 sc.nextLine();
        	 estatistica.nomeCidade = sc.nextLine();
        	 System.out.println("Digite a quantidade de acidentes");
        	 estatistica.qtdAcidentes = sc.nextInt();
        	 classeMetodos.consultaByTdsCidades(estatistica);;
             break;
             
		default:
			break;
		}
		}
		sc.close();
	}catch(Exception e) {
		System.out.println("Erro, Reinicie a Operação");
	}
	}
}
