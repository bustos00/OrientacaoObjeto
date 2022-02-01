package Electronic;

public class ProElectro {
	
	
	String marca;
	String modelo;
	int NumSerie;
	int AnoFabric;
	
	public void imprimir() {
	
	System.out.println("caracteristicas"+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumSerie: "+NumSerie+ "\nAnofabric:"+AnoFabric);
	}

	public void construtor() {
	
	System.out.println("Informe seu nome: "+marca);
	
	System.out.println("Informe seu nome: "+modelo);

	System.out.println("Informe idade da pessoa: "+NumSerie);


	System.out.println("Informe telefone da pessoa: "+ AnoFabric);


	}
}


