import {Component, Input, OnInit} from '@angular/core';
import {RestService} from "../services/rest.service";

@Component({
  selector: 'app-input-frame',
  templateUrl: './input-frame.component.html',
  styleUrls: ['./input-frame.component.css']
})
export class InputFrameComponent {
  result: Object;
  @Input() firstNumber: number;
  @Input() secondNumber: number;

  constructor(private service: RestService) {
  }

  sum(): void {
    this.service.sum(this.firstNumber, this.secondNumber).subscribe(res => {
      this.result = res;
      console.log(res)
    });
  }
  subtraction(): void {
    this.service.subtraction(this.firstNumber, this.secondNumber).subscribe(res => {
      this.result = res;
      console.log(res)
    });
  }

}
