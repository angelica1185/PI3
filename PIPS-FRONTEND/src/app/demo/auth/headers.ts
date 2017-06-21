import { Headers } from '@angular/http';

export const contentHeaders = new Headers();
contentHeaders.append('Content-Type', "application/x-www-form-urlencoded; charset=UTF-8;");
contentHeaders.append('Accept', "application/json");

export const clientId = 'security';
export const clientSecret = 's3cUr1ty';