package pips.com.pe.domain;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Animal")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Animal implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private Integer id_animal;
	private String descripcion;
	
	private Date fecha_registro;
	private Date fecha_modificacion;
	private String usuario_registro;
	private String usuario_modificacion;
	
	
	public Animal() {
	}
	
	

	public Animal(Integer id_animal,String descripcion) {
		this.id_animal = id_animal;
		this.descripcion = descripcion;
	}
	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_animal", unique = true, nullable = false)
	public Integer getId_animal() {
		return id_animal;
	}
	
	
	public void setId_animal(Integer id_animal) {
		this.id_animal = id_animal;
	}
	
	@Column(name = "descripcion", length = 60)
	public String getDescripcion() {
		return descripcion;
	}
	
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	


	
	@Column(name = "fecha_registro", length = 23)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFecha_registro() {
		return fecha_registro;
	}



	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}


	@Column(name = "fecha_modificacion", length = 23)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}



	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}


	@Column(name = "usuario_registro", length = 60)
	public String getUsuario_registro() {
		return usuario_registro;
	}



	public void setUsuario_registro(String usuario_registro) {
		this.usuario_registro = usuario_registro;
	}



	@Column(name = "usuario_modificacion", length = 60)
	public String getUsuario_modificacion() {
		return usuario_modificacion;
	}



	public void setUsuario_modificacion(String usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}



	


}
