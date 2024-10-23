import { Component } from '@angular/core';
import { UppercaseService } from '../../service/uppercase.service';

@Component({
  selector: 'app-word',
  templateUrl: './uppercase.component.html'
})
export class UppercaseComponent {
  word: string = '';
  result: string = '';

  constructor(private uppercaseService: UppercaseService) {}

  convertToUpperCase() {
    this.uppercaseService.toUpperCase(this.word).subscribe(response => {
      this.result = response;
      console.log("response: ",response);
    });
  }
}
