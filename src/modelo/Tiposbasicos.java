package modelo;
// Generated 23 feb 2023 11:16:20 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tiposbasicos generated by hbm2java
 */
@Entity
@Table(name = "tiposbasicos", catalog = "instituto")
public class Tiposbasicos implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6658909888953823494L;
	private int inte;
	private Long bigint1;
	private Short smallint1;
	private Double float1;
	private Character character1;
	private Byte byte1;
	private Boolean bit1;
	private String stri;
	private Date dateDate;
	private Date timeTime;
	private Date dateTime2;
	private String texto;
	private byte[] binario;
	private BigDecimal bigDecimal;

	public Tiposbasicos() {
	}

	public Tiposbasicos(int inte) {
		this.inte = inte;
	}

	public Tiposbasicos(int inte, Long bigint1, Short smallint1, Double float1, Character character1, Byte byte1,
			Boolean bit1, String stri, Date dateDate, Date timeTime, Date dateTime2, String texto, byte[] binario,
			BigDecimal bigDecimal) {
		this.inte = inte;
		this.bigint1 = bigint1;
		this.smallint1 = smallint1;
		this.float1 = float1;
		this.character1 = character1;
		this.byte1 = byte1;
		this.bit1 = bit1;
		this.stri = stri;
		this.dateDate = dateDate;
		this.timeTime = timeTime;
		this.dateTime2 = dateTime2;
		this.texto = texto;
		this.binario = binario;
		this.bigDecimal = bigDecimal;
	}

	@Id

	@Column(name = "inte", unique = true, nullable = false)
	public int getInte() {
		return this.inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	@Column(name = "bigint1")
	public Long getBigint1() {
		return this.bigint1;
	}

	public void setBigint1(Long bigint1) {
		this.bigint1 = bigint1;
	}

	@Column(name = "smallint1")
	public Short getSmallint1() {
		return this.smallint1;
	}

	public void setSmallint1(Short smallint1) {
		this.smallint1 = smallint1;
	}

	@Column(name = "float1", precision = 53, scale = 0)
	public Double getFloat1() {
		return this.float1;
	}

	public void setFloat1(Double float1) {
		this.float1 = float1;
	}

	@Column(name = "character1", length = 1)
	public Character getCharacter1() {
		return this.character1;
	}

	public void setCharacter1(Character character1) {
		this.character1 = character1;
	}

	@Column(name = "byte1")
	public Byte getByte1() {
		return this.byte1;
	}

	public void setByte1(Byte byte1) {
		this.byte1 = byte1;
	}

	@Column(name = "bit1")
	public Boolean getBit1() {
		return this.bit1;
	}

	public void setBit1(Boolean bit1) {
		this.bit1 = bit1;
	}

	@Column(name = "stri")
	public String getStri() {
		return this.stri;
	}

	public void setStri(String stri) {
		this.stri = stri;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateDate", length = 10)
	public Date getDateDate() {
		return this.dateDate;
	}

	public void setDateDate(Date dateDate) {
		this.dateDate = dateDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "timeTime", length = 8)
	public Date getTimeTime() {
		return this.timeTime;
	}

	public void setTimeTime(Date timeTime) {
		this.timeTime = timeTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateTime2", length = 19)
	public Date getDateTime2() {
		return this.dateTime2;
	}

	public void setDateTime2(Date dateTime2) {
		this.dateTime2 = dateTime2;
	}

	@Column(name = "texto")
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Column(name = "binario")
	public byte[] getBinario() {
		return this.binario;
	}

	public void setBinario(byte[] binario) {
		this.binario = binario;
	}

	@Column(name = "bigDecimal")
	public BigDecimal getBigDecimal() {
		return this.bigDecimal;
	}

	public void setBigDecimal(BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

}
