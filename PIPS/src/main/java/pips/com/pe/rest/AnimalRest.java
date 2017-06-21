package pips.com.pe.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pips.com.pe.domain.Animal;
import pips.com.pe.library.DropDown;
import pips.com.pe.library.Logger;
import pips.com.pe.service.interfaces.IAnimalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalRest {

	@Autowired
	private MessageSource messageSource;
	@Autowired
	private IAnimalService animalService;
	
	 
	   @GetMapping
		public ResponseEntity<List<Animal>> listaAnimal() {
			System.out.println("----------------------");
			List<Animal> list = null;
			try {
				list = animalService.readAll();
			} catch (Exception e) {

				e.printStackTrace();
				return new ResponseEntity<List<Animal>>(new ArrayList<>(), HttpStatus.CONFLICT);
			}
			return new ResponseEntity<List<Animal>>(list, HttpStatus.OK);
		}
	   
	

	    @PostMapping
	    public ResponseEntity<String> create(@RequestBody String description) {
	        System.out.println("create :" + description);
	        try {
	            // CREATE processing

	        	Animal animal = new Animal();
	        	animal.setDescripcion(description);
	            animalService.create(animal);

	            return new ResponseEntity(HttpStatus.OK);

	        } catch (Exception e) {

	            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
	        }
	    }

	    @GetMapping("/listDescriptionLike/{description}")
	    public ResponseEntity<List<Animal>> listGetDescriptionLike(@PathVariable("description") String description) {

	        List<Animal> list = null;
	        try {
	            list = animalService.getDescriptionLike(description);
	        } catch (Exception e) {
//				Logger.info(e.getMessage());
	            e.printStackTrace();
	            return new ResponseEntity<List<Animal>>(new ArrayList<>(), HttpStatus.CONFLICT);
	        }
	        return new ResponseEntity<List<Animal>>(list, HttpStatus.OK);

	    }
	    
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Animal> delete(@PathVariable int id) {

	        try {
	            // DELETE processing

	        	animalService.delete(id);

	            return new ResponseEntity(HttpStatus.OK);
	        } catch (Exception e) {

	            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
	        }



	    }
	    
	    

	    @PutMapping("/{id}")
	    public ResponseEntity<Animal> update(@PathVariable("id") int id, @RequestBody Animal animal) {

	            System.out.println("===========UPDATEEE===================");
	        try {
	        	Animal animale = new Animal();
	        	animale = animalService.getById(id);

	            if (animale == null) {
	                return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
	            }


	            animale.setDescripcion(animal.getDescripcion());

	            animalService.update(animale);

	            return new ResponseEntity<Animal>(HttpStatus.OK);

	        }

	        catch (Exception e) {

	            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
	        }
	    }

	    

		@RequestMapping("/msg")
		public String msg(@RequestHeader("Accept-Language") Locale locale) {
			return messageSource.getMessage("security.expired",null, locale);
		}
		
		
	    @GetMapping("/dropdown")
	    public ResponseEntity<List<DropDown>> dropdownAnimal() {
	        List<DropDown> list = null;
	        try {
	            list = animalService.fillDropDown();
	            return new ResponseEntity<List<DropDown>>(list, HttpStatus.OK);
	        } catch (Exception e) {
	            Logger.info(e.getMessage());
	            return new ResponseEntity<List<DropDown>>(list, HttpStatus.EXPECTATION_FAILED);
	        }
	    }

	
	
	
	
	
}
