import {Routes,RouterModule} from '@angular/router';
import {ModuleWithProviders} from '@angular/core';

import {PedidoSegmentacion} from './demo/view/segmentacion/pedido_segmentado';
import {Bienvenida} from './demo/view/bienvenida';
import {RegistroOrdenProduccion} from './demo/view/orden_produccion/registroOrden';
import {Animales} from './demo/view/animales';
import {Operario} from './demo/view/operario';

export const routes: Routes = [
    {path: '', component: Bienvenida},
    {path: 'pedidos_segmentados', component: PedidoSegmentacion},
    {path: 'registroOrden/:id', component: RegistroOrdenProduccion },

    {path: 'animal', component: Animales},
 {path: 'operario', component: Operario}


];

export const AppRoutes: ModuleWithProviders = RouterModule.forRoot(routes);
