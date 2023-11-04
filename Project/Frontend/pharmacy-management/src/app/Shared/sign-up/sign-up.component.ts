import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserModel } from 'src/model/user.model';
import { UserService } from 'src/service/user.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  signUpForm: FormGroup;
  submitted = false;

  constructor(private formbuilder: FormBuilder,
    private userService: UserService,
    private router: Router,) { 
    this.signUpForm = this.formbuilder.group({
    username: ["",Validators.required],
    email: ["",Validators.required],
    phonenumber: ["",Validators.required],
    password: ["",Validators.required],
    userrole: ["",Validators.required]
  })}

  ngOnInit(): void {
    
  }


  onSubmit() {
    this.submitted = true;
    if (this.signUpForm.invalid) {
      return;
    }

    let user: UserModel = new UserModel();
    user.email = this.signUpForm.controls['email'].value;
    user.password = this.signUpForm.controls['password'].value;
    user.phone = this.signUpForm.controls['phonenumber'].value;
    user.roleId = this.signUpForm.controls['userrole'].value;
    user.userName = this.signUpForm.controls['username'].value;

    this.userService.signUpUser(user).subscribe(successMessage => {
      //this.toastr.success('Successfully signed up', 'Success');
      console.log(successMessage);
      this.router.navigateByUrl('/signIn');
      this.signUpForm.reset();
    }, errMessage => {
      console.log(errMessage);
      //this.toastr.error('Failed to sign up', 'Failure');
    })
  
  }

  onReset() {
    this.submitted = false;
    this.signUpForm.reset();
  }

}