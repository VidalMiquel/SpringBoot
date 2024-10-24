import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ConcatenateService {

  private apiUrl = 'http://localhost:8080/api/concatenate'; // Update this if needed

  constructor(private http: HttpClient) { }

  concatenate(left: string, right: string): Observable<string> {
    // Send request with query parameters
    return this.http.get(`${this.apiUrl}?left=${left}&right=${right}`,{responseType: 'text'});
  }
}
