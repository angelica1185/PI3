import {Component,OnInit} from '@angular/core';
import {Animal} from '../domain/animal';
import { Router } from "@angular/router";
import {AnimalService} from '../service/animal.service';
import {Observable} from 'rxjs/Rx';
import {Message} from 'primeng/primeng';


@Component({
    templateUrl: './animales.html'
})
export class Animales implements OnInit {

    messageModal= "";
    kinships: Animal[];
    selectedKinshipType: Animal;
    kinshipType : Animal;
    new_kinship:string = '';
    edit_kinship:string = '';
    new_description:string = '';
    msgs: Message[] = [];
    msgsError: Message[] = [];
    responseModal = 0;

    //display for delete
    displayDelete: boolean = false;
    //display for create
    displayAdd: boolean = false;
    //display for edit
    displayEdit: boolean = false;



    constructor(
        private router: Router,
        private animalService :AnimalService ) { }

    ngOnInit() {

       // show list
       this.getList();

      }

 getListDescriptionLike() {

     this.animalService.getListGetDescriptionLike(this.new_description).then(kinships => this.kinships = kinships);


  }


 getListOrderByIdDesc(){

    this.animalService.getListOrderByIdDesc().then(kinships => this.kinships = kinships);

  }

  getList(){

     this.animalService.getListAnimal().then(kinships => this.kinships = kinships);

  }



  add(new_description) {
        this.msgs = [];
        this.msgsError = [];

          console.log(new_description);
         //clear input text new_kinship
         this.new_kinship = null;

         //get value inputs text form
         // let new_kinship = {descripcion: node.descripcion};


         if (new_description != null) {
             this.animalService.createAnimal(new_description).subscribe(
             data => {
                    // refresh the list
                    this.getListOrderByIdDesc();
                    // close modal
                    this.displayAdd=false;
                    // show message
                    this.msgs.push({severity:'success', summary:'Mensaje', detail:'Registro exitoso!'});

                    return true;

                 },
              error => {
                     console.error("Error saving kinshipType!");
                      // close modal
                     this.displayAdd=false;
                     // show message
                    this.msgsError.push({severity:'error', summary:'Mensaje', detail:'Error de sistema'});

                    return Observable.throw(error);
                 }
            );

        }
        else{

             this.msgsError.push({severity:'error', summary:'Message de Error', detail:'Debe ingresar datos al formulario'});
        }
  }




  update(node) {
       //open modal
       this.displayEdit = true;
       this.kinshipType = node;
       //get value input text
       this.edit_kinship = this.kinshipType.descripcion;

  }


  editSave(){

        this.msgs = [];
        this.msgsError = [];



  }

    cancel() {
        //close modal
       this.displayAdd = false;
       this.displayEdit = false;
    }


     onRowSelect(event) {
         //console.log('qqqq');
        console.log(event.data);


     }



}
