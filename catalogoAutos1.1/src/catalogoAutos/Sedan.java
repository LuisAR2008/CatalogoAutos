package catalogoAutos;

public class Sedan extends Auto{
	
	private int id;
	private static int contaodrId = 1;

	public Sedan(int id, String nombre, String marca, String modelo, String tipo, String combustible, int anio, double motor, int potencia,
			double precio) {
		
		super(nombre, marca, modelo, tipo, combustible, anio, motor, potencia, precio);
		
		this.id = ++Sedan.contaodrId;
		
	
	}

	

	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Sedan [idSedan=" + id+"," +super.toString()+ "]";
	}


}
