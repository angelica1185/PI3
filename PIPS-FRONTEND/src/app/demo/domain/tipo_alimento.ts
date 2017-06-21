import {Etapa} from "./etapa";
import {Animal} from "./animal";

export class Tipo_Alimento {
   id : number;
    id_etapa:Etapa;
    id_animal:Animal;
    descripcion : string;
    peso_presentacion:number;
    precio_unidad : number;
    uni_en_existencia : number;
    uni_en_pedido : number;
    fecha_registro;
    fecha_modificacion;
    usuario_registro;
    usuario_modificacion;
}
