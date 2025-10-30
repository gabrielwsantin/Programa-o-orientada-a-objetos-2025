
public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setAutor("johnny");
		l1.setTitulo("bosta");
		l1.setAno(2020);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("joe");
		b1.setLivro(l1);
		
	}
}
