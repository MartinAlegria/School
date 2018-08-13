public class Cliente{

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private TarjetaCredito tc;

	Cliente(int id, String nombre, String apellido, int edad){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad =  edad;
	}

	public void setTarjetaCredito(TarjetaCredito tc){
		this.tc = tc;
	}

	public void printCliente(){
		System.out.printf("Id: %d\nNombre: %s %s\n", id, nombre, apellido);

		if (tc != null) {
			tc.printTC();
		}else {
			System.out.println("El cliente no tiene tarjeta de credito");
		}

	}

}