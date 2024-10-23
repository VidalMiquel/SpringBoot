import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UppercaseService {
  private apiUrl = 'http://localhost:8080/api/words/uppercase';

  constructor(private http: HttpClient) { }

  toUpperCase(word: string): Observable<string> {
    return this.http.post<string>(this.apiUrl, word, { responseType: 'text' as 'json' });
  }
}
