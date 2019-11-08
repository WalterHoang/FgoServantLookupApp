import { Component, OnInit, OnDestroy } from '@angular/core';
import { Servant } from '../servant.model';
import { ServantsService } from 'src/app/shared/servants.service';
import { ActivatedRoute, Params } from '@angular/router';
import { ApiService } from 'src/app/shared/api.service';
import { ServantSkills } from '../servant-skils.model';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-servant-details',
  templateUrl: './servant-details.component.html',
  styleUrls: ['./servant-details.component.css']
})
export class ServantDetailsComponent implements OnInit, OnDestroy {
  servant: Servant;
  id: number;
  skills: ServantSkills[];
  showSkillDetails = false;
  showNpDetails = false;
  showNpUpgradeDetails = false;
  servantSub: Subscription;
  constructor(private servantService: ServantsService,
    private apiService: ApiService,
    private route: ActivatedRoute,
  ) { }

  ngOnInit() {
    this.route.params.subscribe(
      (params: Params) => {
        this.id = +params['id'];
        this.showSkillDetails = false;
        this.showNpDetails = false;
        this.showNpUpgradeDetails = false;
        this.servant = this.servantService.getServant(this.id);
        this.apiService.fetchSkillById(this.servant.skill1);
        this.apiService.fetchSkillById(this.servant.skill2);
        this.apiService.fetchSkillById(this.servant.skill3);
      }
    );
   this.servantSub = this.servantService.skillsChanged.subscribe(
      (skills: ServantSkills[]) => {
        this.skills = skills;
      }
    )
  }
  toggleSkillDetails() {
    this.showSkillDetails = !this.showSkillDetails;
  }
  toggleNpDetails() {
    this.showNpDetails = !this.showNpDetails;
  }
  toggleNpUpgradeDetails() {
    this.showNpUpgradeDetails = !this.showNpUpgradeDetails;
  }
  ngOnDestroy(){
    this.servantSub.unsubscribe();
  }
}
