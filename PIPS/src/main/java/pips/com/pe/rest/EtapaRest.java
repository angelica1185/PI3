package pips.com.pe.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pips.com.pe.domain.Etapa;
import pips.com.pe.service.interfaces.IEtapaService;
import pips.com.pe.service.interfaces.ISegmentacionOrdenPedidoService;

@RestController
@RequestMapping("/etapa")
public class EtapaRest {
	
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private IEtapaService etapaService;
	
	 @GetMapping
		public ResponseEntity<List<Etapa>> listaEtapa() {
			System.out.println("----------------------");
			List<Etapa> list = null;
			try {
				list = etapaService.readAll();
			} catch (Exception e) {

				e.printStackTrace();
				return new ResponseEntity<List<Etapa>>(new ArrayList<>(), HttpStatus.CONFLICT);
			}
			return new ResponseEntity<List<Etapa>>(list, HttpStatus.OK);
		}

		@RequestMapping("/msg")
		public String msg(@RequestHeader("Accept-Language") Locale locale) {
			return messageSource.getMessage("security.expired",null, locale);
		}
	
	

}
