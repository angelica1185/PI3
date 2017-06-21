import {Http, RequestOptions, RequestOptionsArgs, Request, ConnectionBackend, Response} from "@angular/http";
import {Observable} from "rxjs/Rx";
import {Injectable} from "@angular/core";
import * as header from"../auth/headers";

@Injectable()
export class CustomHttp extends Http {

    constructor(public backend: ConnectionBackend,
                public defaultOptions: RequestOptions) {
        super(backend, defaultOptions);
    };

    request(url: string | Request, options?: RequestOptionsArgs): Observable<Response> {
        //request Start;
        //this.httpSubjectService.addSpinner();
        return super.request(url, options)
            .map(res => {
                //this.httpSubjectService.addNotification(res.json());
                return res;
            }).catch((err) => {
                //this.httpSubjectService.removeSpinner();
                //this.httpSubjectService.removeOverlay();
                if (err.status === 400 || err.status === 422) {
                    //this.httpSubjectService.addHttp403(err);
                    return Observable.throw(err);
                } else if (err.status === 500) {
                    //this.httpSubjectService.addHttp500(err);
                    return Observable.throw(err);
                } else {
                    return Observable.empty();
                }
            }).finally(() => {
                //this.refresh();
                //this.httpSubjectService.removeSpinner();
            });
    }

    /*get(url: string, options?: RequestOptionsArgs): Observable<Response> {
        console.log('get...');
        return super.get(url, options)
            .map(res => {
            // do something
            }).catch((err) => {
                //Error Response.
                //this.httpSubjectService.removeSpinner();
                //this.httpSubjectService.removeOverlay();
                if (err.status === 400 || err.status === 422) {
                    //this.httpSubjectService.addHttp403(err);
                    return Observable.throw(err);
                } else if (err.status === 500) {
                    //this.httpSubjectService.addHttp500(err);
                    return Observable.throw(err);
                } else {
                    return Observable.empty();
                }
            }).finally(() => {
                    //After the request;
                    //this.httpSubjectService.removeSpinner();
            });
    };*/

}