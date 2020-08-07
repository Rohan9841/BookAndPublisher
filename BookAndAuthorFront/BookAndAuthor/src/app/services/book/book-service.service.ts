import { Injectable } from '@angular/core';
import{ HttpClient } from '@angular/common/http'
import { Book } from 'src/app/components/books-list/books-list.component';
import {API_URL } from 'src/app/app.constants'
import { Publisher } from 'src/app/publishers-list/publishers-list.component';

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {
  
  constructor(private http: HttpClient) { }

  getAllBooks(){
    return this.http.get<Book[]>(`${API_URL}/books/getAll`)
  }

  saveBookToDb(book:Book){
    return this.http.post<Book>(`${API_URL}/books/save`,book)
  }
}