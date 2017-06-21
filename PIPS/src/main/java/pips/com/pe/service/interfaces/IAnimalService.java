package pips.com.pe.service.interfaces;

import java.util.List;

import pips.com.pe.domain.Animal;
import pips.com.pe.library.DropDown;

public interface IAnimalService {
	

	public void create(Animal _animal) throws Exception;

	public List<Animal> readAll() throws Exception;
	
	public void update(Animal _animal) throws Exception;
	
	public void delete(int _animal) throws Exception;
	
	public Animal getById(int _id) throws Exception;
	
	public List<Animal> listOrderByIdDesc() throws Exception ;

	public List<Animal> getDescriptionLike(String description) throws Exception ;
	
	public List<DropDown> fillDropDown()  throws Exception ;

}
