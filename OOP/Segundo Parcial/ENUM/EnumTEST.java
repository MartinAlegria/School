public class EnumTEST{
	Day day;


	public EnumTEST(Day day){
		this.day = day;
	}

	public void print()
	{
		switch(day){
			case MONDAY:
			System.out.println("El peor día alv");
			break;

			case FRIDAY:
			System.out.println("Día chingón");
			break;

			case SATURDAY: case SUNDAY:
			System.out.println("Fin de semana");
			default:
				System.out.println("Entre semana");
			break;

		}
	}//print

}
