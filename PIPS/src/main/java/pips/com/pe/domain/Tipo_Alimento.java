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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Tipo_Alimento")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Tipo_Alimento implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("id")
	private Integer      id_tipo_alimento;
    private Etapa        id_etapa;
    private Animal       id_animal;
    private String       descripcion;
	private Double	   peso_presentacion;
	private Double	   precio_unidad;
	private Integer    uni_en_existencia;
	private Integer    uni_en_pedido;
	private Date       fecha_registro;
	private Date       fecha_modificacion;
	private String     usuario_registro;
	private String     usuario_modificacion;
	
	
	
	
	public  Tipo_Alimento(){}
	

	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tipo_alimento", unique = true, nullable = false)
	public Integer getId_tipo_alimento() {
		return id_tipo_alimento;
	}
	public void setId_tipo_alimento(Integer id_tipo_alimento) {
		this.id_tipo_alimento = id_tipo_alimento;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_etapa",nullable = false)
	public Etapa getId_etapa() {
		return id_etapa;
	}
	public void setId_etapa(Etapa id_etapa) {
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPeso_presentacion() {
		return peso_presentacion;
	}
	public void setPeso_presentacion(Double peso_presentacion) {
		this.peso_presentacion = peso_presentacion;
	}
	public Double getPrecio_unidad() {
		return precio_unidad;
	}
	public void setPrecio_unidad(Double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}
	public Integer getUni_en_existencia() {
		return uni_en_existencia;
	}
	public void setUni_en_existencia(Integer uni_en_existencia) {
		this.uni_en_existencia = uni_en_existencia;
	}
	public Integer getUni_en_pedido() {
		return uni_en_pedido;
	}
	public void setUni_en_pedido(Integer uni_en_pedido) {
		this.uni_en_pedido = uni_en_pedido;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}
	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	public String getUsuario_registro() {
		return usuario_registro;
	}
	public void setUsuario_registro(String usuario_registro) {
		this.usuario_registro = usuario_registro;
	}
	public String getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(String usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
	
	
	

}
