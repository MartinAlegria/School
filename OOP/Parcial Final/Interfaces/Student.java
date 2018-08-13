/*
Java provee la interfaz Comparable, la cual contiene solo un etodo, compareTo()
Este metodo compara dos objetos para lograr un orden entre ellos.
Este método regresa un enter que pude ser negativo, cero o positivo, para 
indicar que el objeto de entrada es menor, igual o mayor que el objeto existente
*/

public class Student implements Comparable<Student> {

	public int rollNo;
	public String name;
	public int age;

	public Student(int rollNo, String name, int age){

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st){

		if(age == st.age){
			return 0;
		}
		else if (age > st.age){
			return 1;
		}
		else{
			return -1;
		}

	}

}