
public class Cliente {

	String nombre;
	int saldo;
	
	
	//Esto es un constructor
	public Cliente( String nombreC, int saldoC ){
		nombre = nombreC;
		saldo = saldoC;
		
		
	}
	public void depositar(int deposito) {
		saldo = saldo + deposito;
	}
	public void extraer(int dinero) {
		saldo = saldo - dinero;
	}
	
	
	//Este metodo es especial (main) es el principal
	//MODIFICACION 10:40 H.
	public static void main(String[] args) {
		String nombreC = "Juan";
		int saldoC = 1200;
		
		Cliente uno = new Cliente(nombreC, saldoC);
		
		System.out.println("He creado a " + uno.nombre + " y tiene un saldo inicial de " + uno.saldo);
		
		uno.depositar(1000);
		
		System.out.println("Saldo tras deposito " + uno.saldo);
		
		uno.extraer(1000);
		
		System.out.println("Saldo tras extraccion " + uno.saldo);
		

	}

}
