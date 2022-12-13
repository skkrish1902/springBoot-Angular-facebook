import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  /*validateForm:void {
    let x = document.forms["myform"]["myname"].value;
    if (x == "") {
      alert("Name must be filled out");
      return false;
    }
  } */

}
