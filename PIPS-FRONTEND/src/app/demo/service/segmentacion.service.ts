

import {Injectable} from '@angular/core';
import {Http, Response,  RequestOptions, Request, Headers} from '@angular/http';
import {Segmentacion_Orden_Pedido} from '../domain/segmentacion';
import {Observable} from 'rxjs/Rx';
//import {Segmentado} from '../domain/segmentado';
import * as header from"../auth/headers";
import {Global} from "../helper/global";


@Injectable()
export class SegmentacionService{

    constructor(private http: Http) {
    }

    getAllSegmentacion():Observable<Segmentacion_Orden_Pedido[]>{
          return this.http.get('/api/segmentacion',
              new RequestOptions({ headers: header.contentHeaders }))
              .map(data => data.json())
              .catch(Global.prototype.handlerError);
      };

     getSegmentacionById(id:number):Observable<Segmentacion_Orden_Pedido>{
         return this.http.get('/api/segmentacion/' + id)
             .map(data => data.json())
            .catch(Global.prototype.observableError);


       };




}
