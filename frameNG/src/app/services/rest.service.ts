import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {Numbers} from "../model/numbers";

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*'
  })
};

@Injectable({
  providedIn: 'root'
})
export class RestService {
  private baseUrl = 'http://localhost:4200';
  private sumSuffix = 'sum';
  private subtractionSuffix = 'subtraction';

  constructor(private http: HttpClient) {
  }

  sum(numbers: Numbers) {
    const url = `${this.baseUrl}/${this.sumSuffix}`;
    return this.http.post(url, numbers, httpOptions);
  }

  subtraction(numbers: Numbers) {
    const url = `${this.baseUrl}/${this.subtractionSuffix}`;
    return this.http.post(url, numbers, httpOptions);
  }
}
