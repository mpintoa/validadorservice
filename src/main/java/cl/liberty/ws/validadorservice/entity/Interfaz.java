package cl.liberty.ws.validadorservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name = "Interfaz.findAll", query = "SELECT i FROM INTERFAZ i")
@Table(name = "INTERFAZ")
public class Interfaz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "INTERFAZ")
	private String interfaz;

	@Column(name = "JOB")
	private String job;

	@Column(name = "USUARIO")
	private String usuario;

	@Column(name = "CLAVE")
	private String clave;

	@Column(name = "ESTADO")
	private Integer estado;

	
	
	public Interfaz() {
		super();
	}

	public Interfaz(String interfaz, String job, String usuario, String clave, Integer estado) {
		super();
		this.interfaz = interfaz;
		this.job = job;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
	}

	/**
	 * @return the interfaz
	 */
	public String getInterfaz() {
		return interfaz;
	}

	/**
	 * @param interfaz
	 *            the interfaz to set
	 */
	public void setInterfaz(String interfaz) {
		this.interfaz = interfaz;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave
	 *            the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Interfaz [interfaz=" + interfaz + ", job=" + job + ", usuario=" + usuario + ", clave=" + clave
				+ ", estado=" + estado + "]";
	}
	
	

}