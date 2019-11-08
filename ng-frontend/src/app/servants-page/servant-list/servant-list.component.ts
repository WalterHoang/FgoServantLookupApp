import { Component, OnInit, OnDestroy} from '@angular/core';
import { Servant } from '../servant.model';
import { ServantsService } from 'src/app/shared/servants.service';

import { Router, ActivatedRoute } from '@angular/router';
import { ApiService } from 'src/app/shared/api.service';
import { Subscription } from 'rxjs';
import { NgForm } from '@angular/forms';
/**
 * This component displays a list of servants
 */
@Component({
  selector: 'app-servant-list',
  templateUrl: './servant-list.component.html',
  styleUrls: ['./servant-list.component.css']
})
export class ServantListComponent implements OnInit, OnDestroy {
  servants: Servant[];
  subscription: Subscription;
  constructor(private servantService: ServantsService,
    private apiService: ApiService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
    this.subscription = this.servantService.servantsChanged.subscribe(
      (servants: Servant[]) => {
        this.servants = servants;
      }
    )
  }
  onSubmit(form: NgForm){
    let capitalName = form.value.name;
    capitalName = capitalName.replace(/^./, capitalName[0].toUpperCase());
    this.apiService.fetchServantsByName(capitalName);
    this.router.navigate(['/servants']);
  }
  getAllServants(){
    this.apiService.fetchAllServants();
  }
  ngOnDestroy(){
    this.subscription.unsubscribe();
  }
}
