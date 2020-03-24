import { Injectable } from '@angular/core';
import {Numbers} from "../model/numbers";

@Injectable({
  providedIn: 'root'
})
export class StateService {
  numbers = new Numbers();

  constructor() { }
}
