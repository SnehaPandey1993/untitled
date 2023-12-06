import { Component, OnInit } from '@angular/core';
import { UserRegistationService } from '../user-registation.service';
import { Bom } from '../bom';
@Component({
  selector: 'app-deploymentspec',
  templateUrl: './deploymentspec.component.html',
  styleUrls: ['./deploymentspec.component.css']
})
export class DeploymentspecComponent implements OnInit {
bom:Bom=new Bom('','','','');
message:any;


constructor(private service:UserRegistationService) { }

  ngOnInit() {
  }
  

  public registerNow(){
   let resp=this.service.doBom(this.bom);
   console.log("resp ...."+resp+":::data:::" + this.message);
   resp.subscribe((data)=>this.message=data);
  }
  public addRow(){
    const newRow = {
      Environment:'',
      AppId:'',
      ServiceFamily:'',
      ServiceName:''
    };
    this.bom = newRow;
  }
}
