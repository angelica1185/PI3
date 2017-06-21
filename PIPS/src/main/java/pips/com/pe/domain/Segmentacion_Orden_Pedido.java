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
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "Segmentacion_Orden_Pedido")
@NamedStoredProcedureQueries({
	  @NamedStoredProcedureQuery(
	    name = "execSegmentarPedido", 
	    procedureName = "execSegmentarPedido") 
	})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Segmentacion_Orden_Pedido implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private Integer             id_segmentacion;
	private Animal	            animal;
	private Tipo_Alimento	    tipo_alimento;
	private Etapa        etapa;
	private Double      peso_total;
	private String   estado;
	private Date    fecha_registro;
	private Date    fecha_modificacion;
	private String  usuario_registro;
	private String  usuario_modificacion;
	
	public  Segmentacion_Orden_Pedido()
	{}


	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_segmentacion", unique = true, nullable = false)
	public Integer getId_segmentacion() {
		return this.id_segmentacion;
	}

	public void setId_segmentacion(Integer id_segmentacion) {
		this.id_segmentacion = id_segmentacion;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_animal")
	public Animal getAnimal() {
		return this.animal;
	}
	

	public void setAnimal(Animal id_animal) {
		this.animal = id_animal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_alimento")
	public Tipo_Alimento getTipo_alimento() {
		return this.tipo_alimento;
	}

	public void setTipo_alimento(Tipo_Alimento tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_etapa")
	public Etapa getEtapa() {
		return this.etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public Double getPeso_total() {
		return this.peso_total;
	}

	public void setPeso_total(Double peso_total) {
		this.peso_total = peso_total;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
