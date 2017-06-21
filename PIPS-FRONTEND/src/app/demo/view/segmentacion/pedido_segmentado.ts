import {Component,OnInit} from '@angular/core';

import {AnimalService} from '../../service/animal.service';
import {SegmentacionService} from '../../service/segmentacion.service';
import {SelectItem,MenuItem,TreeNode} from 'primeng/primeng';

import {Animal} from '../../domain/animal';
import {Segmentacion_Orden_Pedido} from '../../domain/segmentacion';
import { Router } from "@angular/router";

@Component({
    templateUrl: './pedido_segmentado.html'
})
export class PedidoSegmentacion implements OnInit {


//  animal: Animal[];
  selectedAnimal: Animal;
  animal : Animal
  filteredAnimal : SelectItem[];
  idAnimal = 0;
  segmentado : Segmentacion_Orden_Pedido;
  segmentadoToFilter : Segmentacion_Orden_Pedido;
  segmentados: Segmentacion_Orden_Pedido[];

    constructor(
        private router: Router,
        private animalService: AnimalService,
        private  segmentacionService: SegmentacionService ) { }

    ngOnInit() {

        //mostrar combo Animal
      //   this.animal = new Animal();
         this.filteredAnimal = [];
           this.segmentadoToFilter = new Segmentacion_Orden_Pedido();
          this.segmentadoToFilter.animal = new Animal();
         this.getLoadAnimal();

   }


   getLoadAnimal(){
     this.animalService.getDropdownAnimal()
      .subscribe(campaignState => {

              this.filteredAnimal = [];
              this.filteredAnimal = campaignState;
              this.filteredAnimal.splice(0,0,{label: '--Todos Animal--', value: 0});
          },error => {
              this.filteredAnimal = [];
              this.filteredAnimal.push({label: '--Todos Animal--', value: 0});
            //  this.msgs.push({severity:'error', summary:'', detail:'Exite un inconveniente con el proceso'});
          });
  }



    buscar(){

      console.log("estoy aqui");
        console.log(this.idAnimal);
      if (this.idAnimal ==0){
      console.log("xxxx");
         this.getAllSegmentacion();

      }

      else {
      console.log("yyyy");
         this.getAllSegmentacion();

      }




    }


 getAllSegmentacion(){
     this.segmentacionService.getAllSegmentacion().subscribe(segmentados => {this.segmentados = segmentados; },
                                                            error => { this.segmentados = []; });
   }


  onAnimalSelect(event){
    this.idAnimal = event.value;
  }
     onRowSelect(row:any) {
         //console.log('qqqq');
      //  console.log(row.data);

     let codSegmentado = row.data.CodigoSegmentado;
         let codTipoAlimento = row.data.CodigoTipoAlimento;
       let nombre = row.data.Nombre;
         let  cantidad = row.data.Cantidad;
         let  estado = row.data.Estado;

         this.segmentado = row.data;

     // console.log(this.segmentado.Cantidad);

      //     console.log(row);
       // alert("selected row:"+ row.data.CodigoSegmentado +" "+row.data.CodigoTipoAlimento+" "+row.data.Nombre);



     }






  seleccionar(){
 this.router.navigate(['/registroOrden', this.segmentado.id]);
//  this.router.navigate(["registroOrden/:id", { id: this.segmentado.id }]);
  }






}
