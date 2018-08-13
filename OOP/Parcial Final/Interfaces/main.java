import java.util.*;

public class Main(){

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Yo", 19));
		al.add(new Student(102, "Tu", 20));
		al.add(new Student(103, "El", 21));

		Collections.sort(al);
	
	for (Student st:al) {
		System.out.println(st.roolNo + " " + st.name + " " + st.age);
	}//for

	}


}