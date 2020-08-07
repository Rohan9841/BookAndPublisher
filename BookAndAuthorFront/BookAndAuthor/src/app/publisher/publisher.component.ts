import { Component, OnInit } from '@angular/core';
import { PublisherService } from '../services/publisher/publisher.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Publisher } from '../publishers-list/publishers-list.component';

@Component({
  selector: 'app-publisher',
  templateUrl: './publisher.component.html',
  styleUrls: ['./publisher.component.css']
})
export class PublisherComponent implements OnInit {

  publisher: Publisher
  id: number

  constructor(
    private publisherService: PublisherService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    this.publisher = new Publisher(this.id,"","","","",null);
  }

  savePublisher(){
    this.publisherService.savePublisherToDb(this.publisher).subscribe(
      response=>{
        console.log(response),
        this.router.navigate(["publishers"])
      },
      error=>{
        console.log(error)
      }
    )
  }
}
