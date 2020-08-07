import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/services/book/book-service.service';
import { Router } from '@angular/router';
import { Publisher } from 'src/app/publishers-list/publishers-list.component';
import { PublisherService } from 'src/app/services/publisher/publisher.service';
import { Book } from '../books-list/books-list.component';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  book: Book
  publishers: Publisher[];

  constructor(
    private bookService:BookServiceService,
    private router:Router,
    private publisherService: PublisherService
    ) { }

  ngOnInit(): void {
    this.book = new Book(null,"","",new Publisher(null,"","","","",null));

    this.publisherService.getAllPublishers().subscribe(
      response=>{
        this.publishers = response;
        console.log(this.publishers);
      },
      error=>{
        console.log(error);
      }
    )
  }

  saveBook(){
    // console.log(this.book);
    // console.log(this.book.publisher);
    this.bookService.saveBookToDb(this.book).subscribe(
      response=>{
        console.log(response)
      },
      error=>{
        console.log(error)
      }
    )
    this.router.navigate(["books"])
  }

  
}
