import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseMetodos {

	String fileName = "ArquivoEstatistica.txt";
	Estatistica[] estatisticas;
	
	public Estatistica[] cadastraEstatistica() throws IOException {
		estatisticas = new Estatistica[15];
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i < 15; i++) {
			estatisticas[i] = new Estatistica();

			estatisticas[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade:"));
			writer.write(Integer.toString(estatisticas[i].codCidade));
			writer.newLine();
			estatisticas[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade:");
			writer.write(estatisticas[i].nomeCidade);
			writer.newLine();
			estatisticas[i].qtdAcidentes = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes:"));
			writer.write(Integer.toString(estatisticas[i].qtdAcidentes));
			writer.newLine();
			estatisticas[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do tipo de veículo\n1 - Carro\n2 - Moto\n3 - Caminhão\n4 - Ônibus"));
			writer.write(Integer.toString(estatisticas[i].tipoVeiculo));
			writer.newLine();
		}
		System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
		writer.close();

		return estatisticas;
	}
	
	public void consultaBytipoVeículo(int tipoVeiculo) throws IOException {
		  estatisticas = new Estatistica[15];
		  BufferedReader ler = new BufferedReader(new FileReader( fileName ));
		  System.out.println("CodCidade    NomeCidade   QTD Acidentes   TipoVeículo");
		  for (int i = 0 ; i < 15 ; i++)   {
			estatisticas[i] = new Estatistica(); 
		    estatisticas[i].codCidade = Integer.parseInt(ler.readLine());  	
		    estatisticas[i].nomeCidade = ler.readLine();
		    estatisticas[i].qtdAcidentes = Integer.parseInt(ler.readLine());
		    estatisticas[i].tipoVeiculo = Integer.parseInt(ler.readLine());
		    if (estatisticas[i].tipoVeiculo == tipoVeiculo) {
		    	System.out.println(estatisticas[i].codCidade+"     "+estatisticas[i].nomeCidade+"     "+estatisticas[i].qtdAcidentes+"     "+estatisticas[i].tipoVeiculo);	
			}
		    
		   }	
		  	
		  
		  ler.close();	
		  }
	
	public void consultaByqtdAcidentes() throws IOException {
		  estatisticas = new Estatistica[15];
		  BufferedReader ler = new BufferedReader(new FileReader( fileName ));
		  System.out.println("CodCidade    NomeCidade   QTD Acidentes   TipoVeículo");
		  for (int i = 0 ; i < 15 ; i++)   {
			estatisticas[i] = new Estatistica(); 
		    estatisticas[i].codCidade = Integer.parseInt(ler.readLine());  	
		    estatisticas[i].nomeCidade = ler.readLine();
		    estatisticas[i].qtdAcidentes = Integer.parseInt(ler.readLine());
		    estatisticas[i].tipoVeiculo = Integer.parseInt(ler.readLine());
		    if (estatisticas[i].qtdAcidentes > 100 && estatisticas[i].qtdAcidentes < 500) {
		    	System.out.println(estatisticas[i].codCidade+"     "+estatisticas[i].nomeCidade+"     "+estatisticas[i].qtdAcidentes+"     "+estatisticas[i].tipoVeiculo);	
			}
		    
		   }	
		  	
		  
		  ler.close();	
		  }

	public void consultaByTdsCidades(Estatistica estatistica) throws IOException {
		  estatisticas = new Estatistica[15];
		  BufferedReader ler = new BufferedReader(new FileReader( fileName ));
		  System.out.println("CodCidade    NomeCidade   QTD Acidentes   TipoVeículo");
		  for (int i = 0 ; i < 15 ; i++)   {
			estatisticas[i] = new Estatistica(); 
		    estatisticas[i].codCidade = Integer.parseInt(ler.readLine());  	
		    estatisticas[i].nomeCidade = ler.readLine();
		    estatisticas[i].qtdAcidentes = Integer.parseInt(ler.readLine());
		    estatisticas[i].tipoVeiculo = Integer.parseInt(ler.readLine());
		    if (estatisticas[i].codCidade == estatistica.codCidade && estatisticas[i].nomeCidade.equals(estatistica.nomeCidade) && estatisticas[i].qtdAcidentes == estatistica.qtdAcidentes) {
		    	System.out.println(estatisticas[i].codCidade+"          "+estatisticas[i].nomeCidade+"          "+estatisticas[i].qtdAcidentes+"          "+estatisticas[i].tipoVeiculo);	
			}
		    
		   }	
		  	
		  
		  ler.close();	
		  }
}
