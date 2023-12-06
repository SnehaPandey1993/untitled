import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Bom } from './bom';

@Injectable({
  providedIn: 'root'
})
export class UserRegistationService {

  constructor(private http:HttpClient) { }


  public doRegistration(user: User){
    return this.http.post("http://192.168.1.26:9090/register",user,{responseType:'text' as 'json'});
  }
  public doBom(bom: Bom){
    return this.http.post("http://192.168.1.26:9090/register",bom,{responseType:'text' as 'json'});
  }
  public getUsers(){
    return this.http.get("http://192.168.1.26:9090/getAllUsers");
  }

  public getUserByEmail(email: string){
    return this.http.get("http://192.168.1.26:9090//findUser/"+email);
  }

  public deleteUser(id: string | number){
    return this.http.delete("http://192.168.1.26:9090/cancel/"+id);
  }
}
