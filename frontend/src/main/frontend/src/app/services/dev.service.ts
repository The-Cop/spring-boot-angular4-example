import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class DevService {

    constructor(private http: HttpClient) {
    }

    getDto() {
        return this.http.get("/api/dto");
    }

}
