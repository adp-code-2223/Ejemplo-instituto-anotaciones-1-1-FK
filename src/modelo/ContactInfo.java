package modelo;
// Generated 23 feb 2023 11:16:20 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ContactInfo generated by hbm2java
 */
@Entity
@Table(name = "contactInfo", catalog = "instituto", 
uniqueConstraints = { @UniqueConstraint(columnNames = "email"),
		@UniqueConstraint(columnNames = "profesorId") })
public class ContactInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Profesor profesor;
	private String email;
	private String tlfMovil;

	public ContactInfo() {
	}

	public ContactInfo(Profesor profesor, String email) {
		this.profesor = profesor;
		this.email = email;
	}

	public ContactInfo(Profesor profesor, String email, String tlfMovil) {
		this.profesor = profesor;
		this.email = email;
		this.tlfMovil = tlfMovil;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profesorId", unique = true, nullable = false, updatable=false)
	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Column(name = "email", unique = true, nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tlf_movil", length = 15)
	public String getTlfMovil() {
		return this.tlfMovil;
	}

	public void setTlfMovil(String tlfMovil) {
		this.tlfMovil = tlfMovil;
	}

	@Override
	public String toString() {
		return "ContactInfo [id=" + id + ", profesor-id=" + profesor.getId() + ", email=" + email + ", tlfMovil=" + tlfMovil + "]";
	}
	
	

}
