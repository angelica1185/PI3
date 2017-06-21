package pips.com.pe.service.interfaces;

import java.util.List;

import pips.com.pe.domain.Segmentacion_Orden_Pedido;

public interface ISegmentacionOrdenPedidoService {
	

	public void create(Segmentacion_Orden_Pedido _segmentacion) throws Exception;

	public List<Segmentacion_Orden_Pedido> readAll() throws Exception;
	
	public void update(Segmentacion_Orden_Pedido _segmentacion) throws Exception;
	
	public void delete(Segmentacion_Orden_Pedido _segmentacion) throws Exception;
	
	public Segmentacion_Orden_Pedido getById(int _id) throws Exception;

	public void segmentarPedidos() throws Exception;
	


}
