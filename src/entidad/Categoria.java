package entidad;

public class Categoria {
	// atributos
	private int id;
	private String nombre;

	// constructores
	public Categoria() {
	}

	public Categoria(String nombre) {
		this.nombre = nombre;
	}

	// getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodos
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
}
