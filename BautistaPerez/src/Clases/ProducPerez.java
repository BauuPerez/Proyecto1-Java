package Clases;

public class ProducPerez {
	private int codigo;
	private String nombreDelProducto;
	private float precio;
	private int cant;
	private int porcentajeGanancia;

	public ProducPerez(int codigo, String nombreDelProducto, float precio, int cant, int porcentajeGanancia) {
		this.codigo = codigo;
		this.nombreDelProducto = nombreDelProducto;
		this.precio = precio;
		this.cant = cant;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreDelProducto() {
		return nombreDelProducto;
	}

	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public int getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(int porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	@Override
	public String toString() {
		return "ProducPerez codigo: " + codigo + ", nombreDelProducto: " + nombreDelProducto + ", precio: " + precio
				+ ", cant: " + cant + ", porcentajeGanancia: " + porcentajeGanancia;
	}
	
	

}
