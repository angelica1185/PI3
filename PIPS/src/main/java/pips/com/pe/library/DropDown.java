package pips.com.pe.library;

import java.io.Serializable;

public class DropDown implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer value;
	private String label;
	
	public DropDown(Integer value, String label) {
		super();
		this.value = value;
		this.label = label;
	}
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
