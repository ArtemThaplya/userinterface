import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

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

  sum(firstNumber: number, secondNumber: number) {
    const url = `${this.baseUrl}/${this.sumSuffix}/${firstNumber}/${secondNumber}`;
    return this.http.post(url, httpOptions);
  }

  subtraction(firstNumber: number, secondNumber: number) {
    const url = `${this.baseUrl}/${this.subtractionSuffix}/${firstNumber}/${secondNumber}`;
    return this.http.post(url, httpOptions);
  }
}
