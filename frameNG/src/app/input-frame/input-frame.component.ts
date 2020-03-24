import {Component, Input, OnInit} from '@angular/core';
import {RestService} from "../services/rest.service";
import {NgForm} from "@angular/forms";
import {Numbers} from "../model/numbers";

@Component({
  selector: 'app-input-frame',
  templateUrl: './input-frame.component.html',
  styleUrls: ['./input-frame.component.css']
})
export class InputFrameComponent {
  numbers = new Numbers();
  result: Object;

  constructor(private service: RestService) {
  }

  sum(): void {
      console.log(this.numbers);
    this.service.sum(this.numbers);
  }
  subtraction(): void {
    this.service.subtraction(this.numbers);
  }
}
