import { Component } from '@angular/core';
import { ConcatenateService } from '../../service/concatenateService';

@Component({
  selector: 'app-concatenate',
  templateUrl: './concatenate.component.html',
})
export class ConcatenateComponent {
  leftWord: string = '';
  rightWord: string = '';
  result: string = '';

  constructor(private concatenateService: ConcatenateService) {}

  concatenateWords() {
    this.concatenateService.concatenate(this.leftWord, this.rightWord).subscribe(
      (response) => {
        // Check if the response is empty
        if (response.trim() === '') {
          this.result = "no word to concatenate"; // Set message for empty response
        } else {
          this.result = response; // Set the result to the response
        }
        console.log(response);
      },
      (error) => {
        console.error('Error concatenating words', error);
        this.result = "there is an error"; // Set message for error
      }
    );
  }

}
