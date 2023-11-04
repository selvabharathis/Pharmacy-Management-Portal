import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserModel } from 'src/model/user.model';
import { UserService } from 'src/service/user.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  signInForm: FormGroup;
  submitted = false;

  constructor(private formbuilder: FormBuilder,
    private userService: UserService,
    private router: Router,) { 
    this.signInForm = this.formbuilder.group({
    email: ["",Validators.required],
    password: ["",Validators.required],
  })}

  ngOnInit(): void {
    
  }


  onSubmit() {
    this.submitted = true;
    if (this.signInForm.invalid) {
      return;
    }

    // console.table(this.signInForm.value);
    // console.table(this.signInForm);

    let user: UserModel = new UserModel();
    user.email = this.signInForm.controls['email'].value;
    user.password = this.signInForm.controls['password'].value;

    this.userService.signInUser(user).subscribe(val => {
      if(val) {
          //this.toastr.success('Successfully logged in', 'Success');
          let loggedInUser = new UserModel();
          loggedInUser.roleId = val.roleId;
          loggedInUser.email = val.email;
          loggedInUser.userName = val.userName;
          loggedInUser.isUserLoggedIn = true;
          this.userService.updateLoggedInStatus(loggedInUser);
          this.router.navigateByUrl('/medicine');
      }
      this.signInForm.reset();
    }, errMessage => {
      console.log(errMessage);
      //this.toastr.error('Failed to log in', 'Failure');
    })
  
  }

  onReset() {
    this.submitted = false;
    this.signInForm.reset();
  }

}
