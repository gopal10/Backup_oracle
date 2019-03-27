import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {
  public user: any = {};  

  constructor(private userService: UserService) { }

  ngOnInit() {
  }
  saveUser(user:any,userForm:any){ 
    this.userService.saveUser(user).subscribe((response)=>{
        if(response){
          console.log(response);
          userForm.reset();
        }
    })
  }
}
