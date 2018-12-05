/**
 * 
 */

/**
 * @author Alejandro A.
 * @version 1.0
 */
public class Rectangulo {
	
	//atributos
	private int base;
	private int altura;
	
	//constructor
	/**
	 * Constructor único para crear objetos de tipo Rectángulo
	 * @param base int relacionado con la base del rectángulo.
	 * @param altura int relacionado con la altura del rectángulo.
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//geters y setters
	/**
	 * @return la base del rectángulo
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base la base del rectángulo a modificar
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return la altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura la altura del rectángulo a modificar
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo de base " + base + " y altura " + altura;
	}
	
	
}
