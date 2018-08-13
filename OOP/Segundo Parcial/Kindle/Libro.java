public class Libro{

	private String titulo;
	private String autor;
	private int numPag;

	Libro(String titulo, String autor, int numPag){
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	public String getTitulo(){return titulo;}
	public String getAutor(){return  autor;}
	public int getNumPag(){return numPag;}

	public void printData(){
		System.out.println(getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Paginas: " + getNumPag());
	}

}