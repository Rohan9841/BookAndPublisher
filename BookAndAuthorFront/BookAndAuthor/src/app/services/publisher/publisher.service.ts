import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Publisher } from 'src/app/publishers-list/publishers-list.component';
import { API_URL } from 'src/app/app.constants';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PublisherService {

  constructor(private http: HttpClient) { }

  getAllPublishers() {
    return this.http.get<Publisher[]>(`${API_URL}/publishers/getAll`).pipe(
      map(
        (data: Publisher[]) => {
          return data;
        }
      )
    );
  }

  savePublisherToDb(publisher: Publisher) {
    return this.http.post<Publisher>(`${API_URL}/publishers/save`, publisher)
  }

  getPublisherById(id: number) {
    return this.http.get<Publisher>(`${API_URL}/publishers/get/${id}`)
  }
}
