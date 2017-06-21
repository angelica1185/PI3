package pips.com.pe.domain;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Tiplo_Plan")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Tiplo_Plan implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private Integer id_plan;
	private String descripcion;
	
	public  Tiplo_Plan() {
	}
	
	
	public  Tiplo_Plan(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_plan", unique = true, nullable = false)
	public Integer getId_plan() {
		return id_plan;
	}
	public void setId_plan(Integer id_plan) {
		this.id_plan = id_plan;
	}
	
	@Column(name = "descripcion", length = 60)
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
