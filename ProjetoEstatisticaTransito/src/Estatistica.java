
public class Estatistica {

	int codCidade; 
	String	nomeCidade ;
	int	qtdAcidentes ;              			
	int	tipoVeiculo;
	
	public Estatistica() {
		 		  this(0 ,"" ,0,0);
		 		  }	 
	public Estatistica ( int codCidadeEst, String nomeCidadeEst,	 
		   int qtdAcidentesEst,	 
		   int tipoVeiculoEst )  {	 
		codCidade = codCidadeEst; 
		nomeCidade = nomeCidadeEst;
		qtdAcidentes = qtdAcidentesEst;              			
		tipoVeiculo = tipoVeiculoEst;	 
   }
	
}
