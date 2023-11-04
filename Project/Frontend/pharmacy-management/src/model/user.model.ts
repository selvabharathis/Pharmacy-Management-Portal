export class UserModel {
    // variable used for api req, res
    userName: string;
    email: string;
    phone: number;
    password: string;
    roleId: number;

    // variable used for angular
    isUserLoggedIn: boolean = false;
}