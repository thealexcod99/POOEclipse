
public class Pendulo {
	
	//atributos
	private float longitud;
	
	//constructor
	public Pendulo(float longitud) {
		
		this.longitud = longitud;
	}

	//geters
	public float getLongitud() {
		
		return longitud;
	}

	//metodo
	public float calcularPeriodo() {
		
		return (float) (2 * Math.PI * Math.sqrt(longitud / 9.8)); 
	}
	
	@Override
	public String toString() {
		return "Pendulo [longitud=" + longitud + "]";
	}
	
	
	
}
