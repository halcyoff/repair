import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {
  private url = 'http://localhost:8080/weather';

  constructor(private httpClient: HttpClient) { }

  public getWeather(): void {
    this.httpClient.get(this.url).subscribe(
      (response: any) => {
        console.log(response);
      },
      err => {
        console.log('error');
      });
  }
}
