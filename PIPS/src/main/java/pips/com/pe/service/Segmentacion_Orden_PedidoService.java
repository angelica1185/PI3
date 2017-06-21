package pips.com.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pips.com.pe.domain.Segmentacion_Orden_Pedido;
import pips.com.pe.service.interfaces.ISegmentacionOrdenPedidoService;
import pips.com.pe.repository.ISegmentacionRepository;

@Service
public class Segmentacion_Orden_PedidoService implements  ISegmentacionOrdenPedidoService{


	@Autowired 
	ISegmentacionRepository segmentacionRepository;
	
	@Override
	public void create(Segmentacion_Orden_Pedido _segmentacion) throws Exception {
		segmentacionRepository.save(_segmentacion);
		
	}

	@Override
	public List<Segmentacion_Orden_Pedido> readAll() throws Exception {
		// TODO Auto-generated method stub
		return (List<Segmentacion_Orden_Pedido>) segmentacionRepository.findAll();
	}

	@Override
	public void update(Segmentacion_Orden_Pedido _segmentacion) throws Exception {
		segmentacionRepository.save(_segmentacion);
		
	}

	@Override
	public void delete(Segmentacion_Orden_Pedido _segmentacion) throws Exception {
		segmentacionRepository.delete(_segmentacion);
		
	}

	@Override
	public Segmentacion_Orden_Pedido getById(int _id) throws Exception {
		// TODO Auto-generated method stub
		return segmentacionRepository.findOne(_id);
	}

	@Override
	public void segmentarPedidos() throws Exception {
		// TODO Auto-generated method stub
		segmentacionRepository.execSegmentarPedido();		
	}


	

	

}
