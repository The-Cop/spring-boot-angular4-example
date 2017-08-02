import {Component, OnInit} from "@angular/core";
import {DevService} from "./services/dev.service";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

    dto = {};
    title = 'app';

    constructor(private devService: DevService) {
    }

    ngOnInit(): void {
        this.devService.getDto().subscribe(data => this.dto = data);
    }
}
