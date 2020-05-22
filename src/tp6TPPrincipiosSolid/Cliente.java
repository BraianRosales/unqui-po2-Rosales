package tp6TPPrincipiosSolid;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private SolicitudDeCredito solicitudDeCredito;
	private PropiedadInmobiliaria propiedadInmobiliaria;
	private double montoObtenidoPorElBanco;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual,SolicitudDeCredito solicitudDeCredito, PropiedadInmobiliaria propiedadInmobiliaria) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.solicitudDeCredito= solicitudDeCredito;
		this.propiedadInmobiliaria = propiedadInmobiliaria;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public SolicitudDeCredito getSolicitudDeCredito() {
		return solicitudDeCredito;
	}

	public void setSolicitudDeCredito(SolicitudDeCredito solicitudDeCredito) {
		this.solicitudDeCredito = solicitudDeCredito;
	}

	public PropiedadInmobiliaria getPropiedadInmobiliaria() {
		return propiedadInmobiliaria;
	}

	public void setPropiedadInmobiliaria(PropiedadInmobiliaria propiedadInmobiliaria) {
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}

	public double getMontoObtenidoPorElBanco() {
		return montoObtenidoPorElBanco;
	}

	public void setMontoObtenidoPorElBanco(double montoObtenidoPorElBanco) {
		this.montoObtenidoPorElBanco = montoObtenidoPorElBanco;
	}

	public double ingresoAnual() {
		
		return this.sueldoNetoMensual * 12;
	}


	

	
	
	
}
