import {AfterViewInit, Component} from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})



export class LoginComponent implements AfterViewInit {
  constructor() {
  }
  ngAfterViewInit() {
    const inputElements = document.querySelectorAll('.form-control');

    inputElements.forEach(input => {
      input.setAttribute('spellcheck', 'false');
      input.setAttribute('autocomplete', 'off');
      input.setAttribute('autocapitalize', 'off');
    });
  }

}
