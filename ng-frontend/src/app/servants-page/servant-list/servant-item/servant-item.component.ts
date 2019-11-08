import { Component, OnInit, Input } from '@angular/core';
import { Servant } from '../../servant.model';
/**
 * This component renders a single servant item
 * in the list of servants and provides the user
 * a way to view additional details
 */
@Component({
  selector: 'app-servant-item',
  templateUrl: './servant-item.component.html',
  styleUrls: ['./servant-item.component.css']
})
export class ServantItemComponent implements OnInit {
  @Input() servant: Servant;
  @Input() index: number;
  constructor() { }

  ngOnInit() {
  }

}
