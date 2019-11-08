import { Injectable } from '@angular/core';
import { Servant } from '../servants-page/servant.model';
import { ServantSkills } from '../servants-page/servant-skils.model';
import { Subject } from 'rxjs';
import { ServantNp } from '../servants-page/servant-np.model';

@Injectable({
  providedIn: 'root'
})
export class ServantsService {
  servantsChanged = new Subject<Servant[]>();
  skillsChanged = new Subject<ServantSkills[]>();
  private skills: ServantSkills[] = [];
  private servants: Servant[] = []
  constructor() { }
  /**
   * This method gets the list of servants and
   * returns a copy of that list to the component
   */
  getServants() {
    return this.servants.slice();
  }
  getServant(id: number) {
    return this.servants[id];
  }
  /**
   * This method gets a list of servants from
   * an api and assigns it to the list we have here
   * @param servants List of servants
   */
  setAllServants(servants: Servant[]) {
    this.servants = servants;
    this.servantsChanged.next(this.servants.slice());
  }
  setSearchedServants(servants: Servant[]) {
    this.servants = servants;
    this.servantsChanged.next(this.servants.slice());
  }
  setSkill(skill:ServantSkills){
    if(this.skills.length === 3){
      this.skills = [];
    }
    this.skills.push(skill);
    this.skillsChanged.next(this.skills.slice());
  }
}
