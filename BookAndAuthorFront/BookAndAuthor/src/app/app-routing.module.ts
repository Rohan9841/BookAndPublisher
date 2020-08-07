import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BooksListComponent } from './components/books-list/books-list.component';
import { BookComponent } from './components/book/book.component';
import { PublisherComponent } from './publisher/publisher.component';
import { PublishersListComponent } from './publishers-list/publishers-list.component';


const routes: Routes = [
  {path:"books",component:BooksListComponent},
  {path:"book/:id",component:BookComponent},
  {path:"publishers",component:PublishersListComponent},
  {path:"publisher/:id",component:PublisherComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
