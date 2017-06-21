package pips.com.pe.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Etapa")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Etapa  implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private Integer id_etapa;
	private Animal id_animal;
	private String descripcion;
	private Double molde;
	private String  tamanho;
	private String edad;
	private Date fecha_registro;
    private Date fecha_modificacion;
    private String usuario_registro;
    private String usuario_modificacion;
		
		


	public Etapa(){

    }
	
	/*public Etapa(Integer id_etapa,Animal id_animal,
	 String descripcion,
	 Double molde,
	 String  tamanho,
     String edad,
	 Date fecha_registro,
     Date fecha_modificacion,
     String usuario_registro,
     String usuario_modificacion){
		
		        this.id_etapa= id_etapa;
		        this.id_animal = id_animal;
				this.descripcion = descripcion;
				this.molde = molde;
				this.tamanho = tamanho;
				this.edad=edad;
				this.fecha_registro=fecha_registro;
				this.fecha_modificacion=fecha_modificacion;
				this.usuario_registro=usuario_registro;
				this.usuario_modificacion=usuario_modificacion;

    }*/
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_etapa", unique = true, nullable = false)
	public Integer getId_etapa() {
		return id_etapa;
	}

	public void setId_etapa(Integer id_etapa) {
		this.id_etapa = id_etapa;
	}


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_animal",nullable = false)
	public Animal getId_animal() {
		return id_animal;
	}

	public void setId_animal(Animal id_animal) {
		this.id_animal = id_animal;
	}

	@Column(name = "descripcion", length = 40)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "molde",nullable = false)
	public Double getMolde() {
		return molde;
	}

	public void setMolde(Double molde) {
		this.molde = molde;
	}


	@Column(name = "tamanho",nullable = false)
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	@Column(name = "edad",nullable = false)
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
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

