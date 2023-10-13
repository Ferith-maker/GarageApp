import { Component } from '@angular/core';
import {GarageService} from "./garage.service";
import {OnInit} from "@angular/core";
import {Car} from "./model/Car";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[GarageService]
})
export class AppComponent implements OnInit{
  title = 'GarageApp';
  cars:Car[]=[];
  constructor(private garageService: GarageService) {

  }

  ngOnInit() {
    console.log('On init....');
    this.garageService.getCars().subscribe(datas=>
      this.cars = datas
    );

  }

}
