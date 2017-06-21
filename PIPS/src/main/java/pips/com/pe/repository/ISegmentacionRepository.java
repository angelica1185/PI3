package pips.com.pe.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import pips.com.pe.domain.Segmentacion_Orden_Pedido;
import pips.com.pe.repository.interfaces.SegmentacionRepositoryCustom;



public interface ISegmentacionRepository extends CrudRepository<Segmentacion_Orden_Pedido, Integer>{
	

	@Procedure(name = "execSegmentarPedido")
	void execSegmentarPedido();
}
