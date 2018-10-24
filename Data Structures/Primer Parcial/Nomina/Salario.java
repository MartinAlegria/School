public class Salario{

	private double salBase;
	private double retenciones;

	Salario(double salBase){
		this.salBase = salBase;
	}

	public double getSal(){
		return salBase;
	}

	public double getNeto(){
		tax();
		return salBase - retenciones;
	}

	public void add(double n){
		salBase += n;
	}

	public void sub(double n){
		salBase -= n;
	}

	public double tax(){
		if (salBase < 6000) {
			retenciones = salBase * .06;
		}else{
			retenciones = salBase * .09;
		}

		retenciones += 6000 * .05;

		return retenciones;

	}//tax

}