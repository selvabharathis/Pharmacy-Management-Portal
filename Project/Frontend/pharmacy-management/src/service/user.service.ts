import { Injectable } from '@angular/core';
import { ApiTemplateService } from './api-template.service';
import { environment } from 'src/environments/environment';
import { UserModel } from 'src/model/user.model';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  /*
  0 -> Invalid Role
  1 -> ADMIN
  2 -> PHARMACIST
  */
  private userDetails  = new BehaviorSubject<UserModel>(this.getDefaultUserModel());

  constructor(public apiTemplateService: ApiTemplateService) { }

  getUserLoggedIn(): Observable<UserModel> {
    return this.userDetails.asObservable();
  }

  updateLoggedInStatus(val: UserModel) {
    this.userDetails.next(val);
  }

  signUpUser(userData: UserModel) {
    let url = environment.userAPIUrl + '/signUp';
    return this.apiTemplateService.postData<number>(url, userData);
  }

  signInUser(userData: UserModel) {
    let url = environment.userAPIUrl + '/signIn';
    return this.apiTemplateService.postData<UserModel>(url, userData);
  }

  getDefaultUserModel(): UserModel {
    let user = new UserModel();
    user.isUserLoggedIn = false;
    user.roleId = 0;
    return user;

  }

}
