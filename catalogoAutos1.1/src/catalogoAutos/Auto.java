package catalogoAutos;

public class Auto {
	
	protected String nombre,marca, modelo, tipo, combustible;
	protected int anio, potencia;
	protected double precio, motor;
	protected String imagen;
	
	
	public Auto(String nombre, String marca, String modelo, String tipo, String combustible, int anio, double motor,int potencia,
			double precio) {
		
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.combustible = combustible;
		this.anio = anio;
		this.motor = motor;
		this.potencia = potencia;
		this.precio = precio;
	}

	  public String getImagen() {
	        return imagen;
	    }

	    public void setImagen(String imagen) {
	        this.imagen = imagen;
	    }

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getMotor() {
		return motor;
	}


	public void setMotor(double motor) {
		this.motor = motor;
	}

	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Auto [nombre=").append(nombre).append(", marca=").append(marca).append(", modelo=")
				.append(modelo).append(", tipo=").append(tipo).append(", combustible=").append(combustible)
				.append(", anio=").append(anio).append(", potencia=").append(potencia).append(", precio=")
				.append(precio).append("]");
		return builder.toString();
	}

}
