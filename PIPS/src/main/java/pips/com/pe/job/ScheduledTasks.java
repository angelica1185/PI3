package pips.com.pe.job;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import pips.com.pe.service.Segmentacion_Orden_PedidoService;


@Component
public class ScheduledTasks {
	
	@Autowired
	Segmentacion_Orden_PedidoService  segmentacionService;
	
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

   /* @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
    */
    @Scheduled(fixedRate = 5000)
    public void segmentarPedidos(){
    	
    	try {
			this.segmentacionService.segmentarPedidos();
			
			log.info("Proceso Segmentar Pedido {}", dateFormat.format(new Date()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

}
