package pips.com.pe.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pips.com.pe.domain.Animal;
import pips.com.pe.library.DropDown;
import pips.com.pe.service.interfaces.IAnimalService;
import pips.com.pe.repository.IAnimalRepository;

import java.util.List;


@Service
public class AnimalService implements  IAnimalService{

	
	@Autowired 
	IAnimalRepository animalRepository;
	
	@Override
	public void create(Animal _animal) throws Exception {
		animalRepository.save(_animal);
		
	}

	@Override
	public List<Animal> readAll() throws Exception {
		// TODO Auto-generated method stub
		return animalRepository.findAll();
	}

	@Override
	public void update(Animal _animal) throws Exception {
		animalRepository.save(_animal);
		
	}

	@Override
	public void delete(int _animal) throws Exception {
		animalRepository.delete(_animal);
		
	}

	@Override
	public Animal getById(int _id) throws Exception {
		// TODO Auto-generated method stub
		return animalRepository.findOne(_id);
	}
	
	@Override
    public List<Animal> getDescriptionLike(String description) throws Exception {

        return animalRepository.findByDescriptionLike(description);
    }

	
    @Override
    public List<Animal> listOrderByIdDesc() throws Exception {
        return animalRepository.listOrderByIdDesc();
    }

	@Override
	public List<DropDown> fillDropDown() throws Exception {
		// TODO Auto-generated method stub
		 return animalRepository.fillDropDown();
	}
    


	   
}
