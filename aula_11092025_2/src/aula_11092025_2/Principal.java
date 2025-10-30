package aula_11092025_2;

public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setMarca("Vw");
		c1.setModelo("Gol");
		c1.setAno(2001);
		c1.setNome_motorista("Ana");
		
		System.out.println(c1.getModelo());
		
	}
}
