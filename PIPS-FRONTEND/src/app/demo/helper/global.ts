import {Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';

export abstract class Global {

    public clientId: string = 'security';
    public clientSecret: string = 's3cUr1ty';

    constructor() {

    }

    public handlerError(error:Response | any) {
        // In a real world app, we might use a remote logging infrastructure
        let errMsg:string;
        if (error instanceof Response) {
            const body = error.json() || '';
            const err = body.error || JSON.stringify(body);
            errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
        } else {
            errMsg = error.message ? error.message : error.toString();
        }
        return Promise.reject(errMsg);
    };

    public observableError(error:any) {
        // In a real world app, we might use a remote logging infrastructure
        // We'd also dig deeper into the error to get a better message
        console.dir(error);
        /*let errMsg = (error.message) ? error.message :
         error.status ? `${error.status} - ${error.statusText}` : 'Server error';*/
        return Observable.throw(error);
    };

}