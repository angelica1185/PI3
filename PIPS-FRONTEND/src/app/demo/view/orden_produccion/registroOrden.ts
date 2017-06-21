
import {Component,OnInit} from '@angular/core';
import {Message} from 'primeng/primeng';
import {SelectItem,MenuItem,TreeNode} from 'primeng/primeng';
import { Router, ActivatedRoute, Params } from '@angular/router';

import {SegmentacionService} from '../../service/segmentacion.service';
//import {Segmentado} from '../domain/segmentado';
import {Animal} from '../../domain/animal';
import {Segmentacion_Orden_Pedido} from '../../domain/segmentacion';
import 'rxjs/add/operator/switchMap';

@Component({
    templateUrl: './registroOrden.html'
})
export class RegistroOrdenProduccion implements OnInit {


       private id: number;
      msgs: Message[] = [];
      new_codSegmentado:string = '';
       segmentado : Segmentacion_Orden_Pedido;

    showInfo() {
        this.msgs = [];
        this.msgs.push({severity:'success', summary:'Mensaje', detail:'Orden de Produccion a estado Iniciado'});
    }

    maskValue: string;

    constructor(
      private activeRouter: ActivatedRoute,
        private router: Router ,
         private  segmentacionService: SegmentacionService ) { }

    ngOnInit() {

      this.segmentado = new Segmentacion_Orden_Pedido();
      this.activeRouter.params.subscribe(params => { this.id = params['id']; });
       console.log(this.id);
        this.loadAlimento(this.id);

  /*  .switchMap((params: Params) => this.segmentacionService.getSegmentacionById(+params['id']))
    .subscribe((segmentado: Segmentacion_Orden_Pedido) => this.segmentado = segmentado);
  console.log(this.segmentado.peso_total);*/

   }

   loadAlimento(idSegmentado){
     this.segmentacionService.getSegmentacionById(idSegmentado)
    .subscribe(segmentado => {this.segmentado = segmentado; console.log(this.segmentado);},
      error => { console.log(error);});
   }

   calcularBase(){

   }

   formula(){

   }




}
