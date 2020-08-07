import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { BooksListComponent } from './components/books-list/books-list.component';
import { HttpClientModule } from '@angular/common/http';
import { BookComponent } from './components/book/book.component';
import{ FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { PublisherComponent } from './publisher/publisher.component';
import { PublishersListComponent } from './publishers-list/publishers-list.component'

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    BooksListComponent,
    BookComponent,
    PublisherComponent,
    PublishersListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
