package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_empleado database table.
 * 
 */
@Entity
@Table(name="tbl_empleado")
@NamedQuery(name="TblEmpleado.findAll", query="SELECT t FROM TblEmpleado t")
public class TblEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idempleado;

	private String apeempleado;

	private String apellido;

	private String dni;

	private String dniempleado;

	private String email;

	private String emailempleado;

	private String nombre;

	private String nomempleado;

	private String sexo;

	private String telefonoempleado;

	private String telf;

	public TblEmpleado() {
	}

	public int getIdempleado() {
		return this.idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}


	public String getApeempleado() {
		return this.apeempleado;
	}

	public void setApeempleado(String apeempleado) {
		this.apeempleado = apeempleado;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDniempleado() {
		return this.dniempleado;
	}

	public void setDniempleado(String dniempleado) {
		this.dniempleado = dniempleado;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmailempleado() {
		return this.emailempleado;
	}

	public void setEmailempleado(String emailempleado) {
		this.emailempleado = emailempleado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNomempleado() {
		return this.nomempleado;
	}

	public void setNomempleado(String nomempleado) {
		this.nomempleado = nomempleado;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefonoempleado() {
		return this.telefonoempleado;
	}

	public void setTelefonoempleado(String telefonoempleado) {
		this.telefonoempleado = telefonoempleado;
	}

	public String getTelf() {
		return this.telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

}