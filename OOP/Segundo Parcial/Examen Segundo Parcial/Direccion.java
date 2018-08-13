public class Direccion{

	private String calle;
	private int numero;
	private int codPostal;
	private String ciudad;

	Direccion(String calle, int numero, int codPostal, String ciudad){
		this.calle =calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
	}

	public String formato(){
		return "" + calle + " #" + numero + " CP:" + codPostal + ", " + ciudad; 
	}

}