import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { UserModel } from 'src/model/user.model';
import { UserService } from 'src/service/user.service';

@Injectable({
  providedIn: 'root'
})
export class RoleGuardGuard implements CanActivate {

  user: UserModel;

  constructor(private userService: UserService,
    private router: Router) {

    }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      this.userService.getUserLoggedIn().subscribe(val => {
        this.user = val;
      })

      if(this.user.isUserLoggedIn) {
        const userRole = this.user.roleId;

        if(userRole === 1 && route.data['expectedRole'] === 1) {
          return true;
        } else if(userRole === 2 && route.data['expectedRole'] === 2) {
          return true;
        } else if((userRole === 1 || userRole === 2) && route.data['expected'] === 'Common') {
          return true;
        }
      }

      // if not authenticated or the role is not allowed, redirect to unauthorized page.
      this.router.navigate(['notAuthorized']);
      return false;
  }
  
}
