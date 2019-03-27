import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';



@Component({
  selector: 'app-sendquery',
  templateUrl: './sendquery.component.html',
  styleUrls: ['./sendquery.component.css']
})
export class SendqueryComponent implements OnInit {
  public query: any = {};  

  constructor(private userService: UserService) { }

  ngOnInit() {
  }
  saveQuery(query:any,queryForm:any){ 
    query.answer="No answer";
    query.status=0;
    this.userService.savedQuery(query).subscribe((response)=>{
        if(response){
          console.log(response);
          queryForm.reset();
        }
    })
  }
}
