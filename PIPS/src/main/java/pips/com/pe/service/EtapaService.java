package pips.com.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pips.com.pe.domain.Etapa;
import pips.com.pe.service.interfaces.IEtapaService;
import pips.com.pe.repository.IEtapaRepository;

@Service
public class EtapaService  implements IEtapaService {

	@Autowired 
	IEtapaRepository etapaRepository;
	
	@Override
	public void create(Etapa _etapa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Etapa> readAll() throws Exception {
		// TODO Auto-generated method stub
		return etapaRepository.findAll();
	}

	@Override
	public void update(Etapa _etapa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Etapa _etapa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Etapa getById(int _id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
