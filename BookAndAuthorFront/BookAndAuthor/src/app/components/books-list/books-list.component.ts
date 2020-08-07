import { Component, OnInit } from '@angular/core';
import{ BookServiceService } from 'src/app/services/book/book-service.service'
import { ThrowStmt } from '@angular/compiler';
import { Router } from '@angular/router';
import { Publisher } from 'src/app/publishers-list/publishers-list.component';

export class Book{
  constructor(
    public id: number,
    public title: string,
    public isbn: string,
    public publisherDTO: Publisher
  ){}
}

@Component({
  selector: 'app-books-list',
  templateUrl: './books-list.component.html',
  styleUrls: ['./books-list.component.css']
})
export class BooksListComponent implements OnInit {

  books:Book[]

  constructor(
    private bookService: BookServiceService,
    private router: Router
    ) { }

  ngOnInit(): void {
    this.refreshBooks()
  }

  refreshBooks(){
    this.bookService.getAllBooks().subscribe(
      response=>{
        this.books = response
      }
    )
  }

  addBook(){
    this.router.navigate(["book",-1])
  }
}
