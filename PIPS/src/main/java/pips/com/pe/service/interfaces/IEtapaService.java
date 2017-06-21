package pips.com.pe.service.interfaces;

import java.util.List;

import pips.com.pe.domain.Etapa;

public interface IEtapaService {

	public void create(Etapa _etapa) throws Exception;

	public List<Etapa> readAll() throws Exception;
	
	public void update(Etapa _etapa) throws Exception;
	
	public void delete(Etapa _etapa) throws Exception;
	
	public Etapa getById(int _id) throws Exception;
}
