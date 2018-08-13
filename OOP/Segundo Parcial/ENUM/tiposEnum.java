public enum tiposEnum{

		CLASICA(7500.00, 699.00, 29.00, 47.00), ORO(15000.00, 959.00, 25.00, 45.00),
		PLATINUM(45000.00, 1999.00, 16.00, 33.00), BLACK(100000.00, 4599.00, 9.9, 26.00);

		private final double ingresoMinimo;
		private final double anualidad;
		private final double min;
		private final double max;

		tiposEnum(double ingresoMinimo, double anualidad, double min, double max){
			this.ingresoMinimo = ingresoMinimo;
			this.anualidad = anualidad;
			this.min = min;
			this.max = max;
		}

		public double getIM(){return ingresoMinimo;}
		public double getA(){return anualidad;}
		public double getMin(){return min;}
		public double getMax(){return max;}

		double tasaInteresAnual(){
			double tIA = 7.7 /*Este es el TIIE */ + (max - min); /* Puntos Porcentuales*/
			return tIA;
		}

		double tasaInteresMensual(){
			double tIM = (tasaInteresAnual() / 360)*30;
			return tIM;
		}

	}//tarjetaCredito