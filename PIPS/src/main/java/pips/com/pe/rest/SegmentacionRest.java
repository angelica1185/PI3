package pips.com.pe.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pips.com.pe.domain.Segmentacion_Orden_Pedido;
import pips.com.pe.service.interfaces.ISegmentacionOrdenPedidoService;

@RestController
@RequestMapping("/segmentacion")
public class SegmentacionRest {
	
	
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private ISegmentacionOrdenPedidoService segmentacionService;
	
	 
	   @GetMapping
		public ResponseEntity<List<Segmentacion_Orden_Pedido>> listaSegmentacion() {
			System.out.println("----------listaSegmentacion------------");
			List<Segmentacion_Orden_Pedido> list = null;
			try {
				list = segmentacionService.readAll();
				System.out.println("----------lista------------ " 
						+ list);
				
			} catch (Exception e) {

				e.printStackTrace();
				return new ResponseEntity<List<Segmentacion_Orden_Pedido>>(new ArrayList<>(), HttpStatus.CONFLICT);
			}
			return new ResponseEntity<List<Segmentacion_Orden_Pedido>>(list, HttpStatus.OK);
		}
	   

	   
	   
	   @GetMapping("/{id}")
	    public ResponseEntity<Segmentacion_Orden_Pedido> getById(@PathVariable int id) {

	    	System.out.println("------AAAAA----------------");
	        Segmentacion_Orden_Pedido seg = new Segmentacion_Orden_Pedido() ;
	        try {
	        	seg = segmentacionService.getById(id);
	        	System.out.println("------AAAAA----------------");
	        } catch (Exception e) {
//				Logger.info(e.getMessage());
	            e.printStackTrace();
	            
	            return new ResponseEntity(HttpStatus.CONFLICT);
	        }
	       // return new ResponseEntity(HttpStatus.OK);
	        return new ResponseEntity<Segmentacion_Orden_Pedido>(seg, HttpStatus.OK);

	    }

		@RequestMapping("/msg")
		public String msg(@RequestHeader("Accept-Language") Locale locale) {
			return messageSource.getMessage("security.expired",null, locale);
		}
	
	
	
	

}
