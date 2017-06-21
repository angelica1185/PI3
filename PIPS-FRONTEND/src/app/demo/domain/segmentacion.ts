import {Animal} from "./animal";
import {Tipo_Alimento} from "./tipo_alimento";
import {Etapa} from "./etapa";
export class Segmentacion_Orden_Pedido {

id: number;
descripcion: string;
animal : Animal;
tipo_alimento :Tipo_Alimento;
etapa : Etapa;
peso_total : number;
estado: string;
fecha_registro;
fecha_modificacion;
usuario_registro;
usuario_modificacion;

constructor() {
   // code...
 }


}
