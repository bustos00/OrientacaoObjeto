package patinete;

public class Patinete {

	String cor;
	String velocidade;
	String freios;
	
	public void estrutura() {
		
		System.out.println("\nCor: "+ cor+ "\nVelocidade"+ velocidade+ "\nfreios"+freios);
	}
	
	public void imprimir() {
		
		System.out.println("Qual a cor do seu patinete?: "+ cor);
		System.out.println("Qual é a velocidade dele? : "+ velocidade);
		System.out.println("Tem freios???: "+ freios);
	}
	
}
