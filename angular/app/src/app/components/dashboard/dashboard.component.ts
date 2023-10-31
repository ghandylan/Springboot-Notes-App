import { Component } from '@angular/core';
import {faSignOutAlt} from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
    faSignOutAlt = faSignOutAlt;
}
