spublic class TarjetaCredito{

	private String numero;
	private double saldo;
	private Fecha fechaExpiracion;
	private Fecha fechaExpedicion;
	private tiposEnum tipoTC;

	TarjetaCredito(String numero, double saldo, int diaExp, int mesExp, int yearExp, int diaExpiracion, int mesExpiracion, int yearExpiracion, tiposEnum tipoTC){

		this.numero = numero;
		this.saldo = saldo;
		fechaExpedicion = new Fecha(diaExp, mesExp, yearExp);
		fechaExpiracion = new Fecha(diaExpiracion, mesExpiracion, yearExpiracion);
		this.tipoTC = tipoTC;

	}

	public void compras(double cantidad){
		if (cantidad > saldo) {
			System.out.println("Fondos Insuficientes");
		}else{
			saldo = saldo - cantidad;
		}
	}//compras

	public void printTipo(){

		switch(tipoTC){

			case CLASICA:
			System.out.println("Tipo de Tarjeta: " + tipoTC);
			System.out.printf("Tasa de interes mensual: %.2f\n", tipoTC.tasaInteresMensual());
			System.out.printf("Tasa de interes anual: %.2f\n", tipoTC.tasaInteresAnual());
			break;

			case ORO:
			System.out.println("Tipo de Tarjeta: " + tipoTC);
			System.out.printf("Tasa de interes mensual: %.2f\n", tipoTC.tasaInteresMensual());
			System.out.printf("Tasa de interes anual: %.2f\n", tipoTC.tasaInteresAnual());
			break;

			case PLATINUM:
			System.out.println("Tipo de Tarjeta: " + tipoTC);
			System.out.printf("Tasa de interes mensual: %.2f\n", tipoTC.tasaInteresMensual());
			System.out.printf("Tasa de interes anual: %.2f\n", tipoTC.tasaInteresAnual());
			break;

			case BLACK:
			System.out.println("Tipo de Tarjeta: " + tipoTC);
			System.out.printf("Tasa de interes mensual: %.2f\n", tipoTC.tasaInteresMensual());
			System.out.printf("Tasa de interes anual: %.2f\n", tipoTC.tasaInteresAnual());
			break;

			default:
			break;

		}//switch

	}//Tipo

	public void printTC(){
		System.out.printf("Tarjeta de Credito: %s\nSaldo: %2f\n", numero, saldo);
		System.out.println("Fecha de Expiracion: " + fechaExpiracion.formatoFecha() + "\nFecha de Expedicion: " +fechaExpedicion.formatoFecha());
	}//printTC

}