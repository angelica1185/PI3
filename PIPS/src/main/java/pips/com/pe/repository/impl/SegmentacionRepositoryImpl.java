package pips.com.pe.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import pips.com.pe.domain.Segmentacion_Orden_Pedido;
import pips.com.pe.repository.interfaces.SegmentacionRepositoryCustom;

public class SegmentacionRepositoryImpl implements SegmentacionRepositoryCustom <Segmentacion_Orden_Pedido, Integer>{
	

    @PersistenceContext
    private EntityManager entityManager;

	

}
