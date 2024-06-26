/* Cree una clase llamada Estudiante con los atributos especificados abajo y sus
correspondientes métodos getters y setters (haga uso de las facilidades que brinda
eclipse)
● nombre
● apellido
● comision
● email
● direccion

Agregue un método de instancia llamado tusDatos() en la clase Estudiante y en la
clase Profesor, que retorne un String con los datos de los atributos de las mismas.
Para acceder a los valores de los atributos utilice los getters previamente
definidos.

*/
package Punto3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int comision;
	private String email;
	private String direccion;
	
	public Estudiante(String n,String a, int c, String e, String d) {
		this.nombre = n;
		this.apellido = a;
		this.comision = c;
		this.email = e;
		this.direccion = d;
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

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		String retorno ="Nombre "+this.getNombre()+" Apellido "+this.getApellido()+" Comision "+this.getComision()+" Email "+this.getEmail()+" Direccion "+this.getDireccion();
		return retorno;
	}
	
}
