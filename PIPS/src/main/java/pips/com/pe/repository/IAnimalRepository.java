package pips.com.pe.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pips.com.pe.domain.Animal;
import pips.com.pe.library.DropDown;


@Repository
public interface IAnimalRepository extends JpaRepository<Animal, Integer>{
	
	   @Query("SELECT NEW pips.com.pe.library.DropDown(a.id_animal, a.descripcion) FROM Animal a")
       List<DropDown> fillDropDown();
	
	
	   @Query("SELECT k  FROM Animal k  ORDER BY k.id_animal DESC")
       List<Animal> listOrderByIdDesc();

       @Query("select k from Animal k where k.descripcion like %?1")
        List<Animal> findByDescriptionLike(String description);
       
 
       

}
