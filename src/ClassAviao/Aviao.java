package ClassAviao;

public class Aviao {

	String cor;
	int peso;
	boolean voando;
	
	//Metodos 
	public void Aviao(int valor, String v ) {
		
		this.voando=true;
		this.peso=valor;
		this.cor=v;
	}
	
		public void naoVoando() {
			
			this.voando=false;
		}
	
		public void escrever() {
			
			if(this.voando==false);
			System.out.println("Error!!!Aviao esta na pista");
			
			if(this.voando==true);
				System.out.println("Voando...");
			
		}
		public void status() {
			
			System.out.println("Acor do aviao �: "+ this.cor);
			System.out.println("A carga �: "+ this.peso);
			System.out.println("Esta voando? "+ this.voando);
		}
		
		
}
