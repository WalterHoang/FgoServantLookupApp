import { Component, OnInit, OnDestroy } from '@angular/core';
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
  collapsed = false;
  subscription: Subscription;
  constructor(private servantService: ServantsService,
    private apiService: ApiService, private router: Router) { }
/**
 * This lifecycle phase sets up a watcher for the list of servants
 * when the list is initialized
 */
  ngOnInit() {
    this.collapsed = false;
    this.subscription = this.servantService.servantsChanged.subscribe(
      (servants: Servant[]) => {
        this.servants = servants;
      }
    )
  }
  /**
   * This function checks to see if there is a name in the box
   * before making the http request
   * @param form The input box to search for a servant by name
   */
  onSubmit(form: NgForm) {
    if (form.value.name === '') {
      alert('Please Enter a name.');
    }
    else {
      let capitalName = form.value.name;
      capitalName = capitalName.replace(/^./, capitalName[0].toUpperCase());
      this.apiService.fetchServantsByName(capitalName);
      this.router.navigate(['/servants']);
    }
  }
  getAllServants() {
    this.apiService.fetchAllServants();
    this.router.navigate(['/servants']);
  }
  /**
   * This lifecycle phase cleans up the watcher
   * in case of a memory leak
   */
  ngOnDestroy() {
    this.subscription.unsubscribe();
  }
}