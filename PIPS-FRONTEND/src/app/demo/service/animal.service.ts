import {Injectable} from '@angular/core';
import {Http, Response,  RequestOptions, Request, Headers} from '@angular/http';
import {Animal} from '../domain/animal';
import 'rxjs/add/operator/toPromise';
import {Observable} from 'rxjs/Rx';
import {Global} from "../helper/global";


@Injectable()
export class AnimalService{

 animal: Animal;

    constructor(private http: Http) {
    }

    getDropdownAnimal():Observable<any[]> {
        return this.http.get('/api/animal/dropdown')
            .map(data => data.json())
            .catch(Global.prototype.handlerError);
    }


    getAnimal():Promise<Animal[]>{
        return this.http.get('/api/animal/')
              .toPromise()
              .then(data => data.json())
              .catch(error => error);
    }

       getListAnimal() {
        return this.http.get('/api/animal')
              .toPromise()
              .then(res => <Animal[]> res.json())
              .then(data => { console.log('AnimalService');
                              console.log(data);
                              return data; }
               );
    }


  getListOrderByIdDesc(){

          return this.http.get('/api/animal/listOrder')
              .toPromise()
              .then(res => <Animal[]> res.json())
              .then(data => { console.log(data);
                              return data; }
               );
  }

     getListGetDescriptionLike(description){

          return this.http.get('/api/animal/listDescriptionLike/'+ description)
              .toPromise()
              .then(res => <Animal[]> res.json())
              .then(data => { console.log(data);
                              return data; }
               );
  }


    createAnimal(new_description) {
        let headers = new Headers({'Content-Type': 'application/json'});
        let options = new RequestOptions({headers: headers});
       let body = new_description;
        console.log(body);
        return this.http.post('/api/animal/', body, options);
    }



   deleteAnimal(id:number){
         return this.http.delete('/id/animal/' + id);
    }


   updateAnimal(Animal) {
      /*  let headers = new Headers({'Content-Type': 'application/json'});
        let options = new RequestOptions({headers: headers});
         this.animal = Animal;
        let body = JSON.stringify(this.animal);
        return this.http.put('/api/animal/' + this.animal.id_animal , body, options);*/
    }




}
