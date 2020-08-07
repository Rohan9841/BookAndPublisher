import { Component, OnInit } from '@angular/core';
import { PublisherService } from 'src/app/services/publisher/publisher.service'
import { Router } from '@angular/router';

export class Publisher{
  constructor(
    public  id: number,
    public name: string,
    public addressLine: string,
    public city: string,
    public state: string,
    public zip: number
  ){}
}
@Component({
  selector: 'app-publishers-list',
  templateUrl: './publishers-list.component.html',
  styleUrls: ['./publishers-list.component.css']
})
export class PublishersListComponent implements OnInit {

  publishers: Publisher[];

  constructor(
    private publisherService: PublisherService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.refreshPublishers()
  }

  refreshPublishers(){
    this.publisherService.getAllPublishers().subscribe(
      response => {
        this.publishers = response
      }
    )
  }

  addPublisher(){
    this.router.navigate(["publisher",-1])
  }
}
