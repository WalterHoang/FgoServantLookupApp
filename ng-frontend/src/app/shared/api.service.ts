import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { ServantsService } from './servants.service';
import { Servant } from '../servants-page/servant.model';
import { ServantSkills } from '../servants-page/servant-skils.model';
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private servantApiLink:string = "http://localhost:8080";
  constructor(private http: HttpClient,
    private servantService: ServantsService) { }

  fetchAllServants(){
    this.http.get<Servant[]>(this.servantApiLink + "/servants")
    .subscribe(servants => {
      this.servantService.setAllServants(servants);
    })
  }
  fetchServantsByName(name: string){
    this.http.get<Servant[]>(this.servantApiLink + "/servants/servantname?",{params:{servantname: name}})
    .subscribe(servants => {
      this.servantService.setSearchedServants(servants);
    })
  }
  fetchSkillById(id: number){
    this.http.get<ServantSkills>(this.servantApiLink + "/skills/" + id)
    .subscribe(skill => {
      this.servantService.setSkill(skill);
    })
  }
}
