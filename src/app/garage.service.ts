import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Car} from "./model/Car";

@Injectable({
  providedIn: 'root'
})
export class GarageService {
  readonly API_URL = "http://localhost:8080"
  readonly ENDPOINT_CARS = "/cars"

  constructor(private httpClient: HttpClient) {

  }

  getCars():Observable<Car[]>{
    return this.httpClient.get<Car[]>(this.API_URL+this.ENDPOINT_CARS)
  }
}
