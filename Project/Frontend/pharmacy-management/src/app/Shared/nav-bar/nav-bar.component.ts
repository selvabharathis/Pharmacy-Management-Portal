import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserModel } from 'src/model/user.model';
import { UserService } from 'src/service/user.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  userRole: number;
  isUserLoggedIn: boolean;
  user: UserModel;
  userType: string;
  userName: string;
  greetUser: string;

  constructor(private userService: UserService,
    private router: Router) { 
    // this.userRole = userService.userRole;
    // this.isUserLoggedIn = userService.isUserLoggedIn;
    this.userRole = 0;
    this.isUserLoggedIn = false;
  }

  ngOnInit(): void {
    this.userService.getUserLoggedIn().subscribe(val => {
      console.log("get user logged in")
      console.log(val);
      this.user = val;
      this.userRole = this.user.roleId;
      this.isUserLoggedIn = this.user.isUserLoggedIn;
      this.userType = this.userRole === 1 ? 'ADMIN' : 'PHARMACIST';
      this.userName = this.user.userName;
      this.greetUser = this.userType + ' - ' + this.userName;
    })
  }

  signOut() {
    this.isUserLoggedIn = false;
    this.user = null;
    this.userRole = 0;
    this.userType = '';
    this.userName = '';
    this.greetUser = '';

    this.userService
    .updateLoggedInStatus(this.userService.getDefaultUserModel());

    this.router.navigateByUrl('/signIn');
  }

}
