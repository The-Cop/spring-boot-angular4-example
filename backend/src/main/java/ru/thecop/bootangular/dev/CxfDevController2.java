package ru.thecop.bootangular.dev;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/second")
@Service
public class CxfDevController2 {
    @GET
    public String hello(){
        return "Second Cxf hello world!";
    }
    @GET
    @Path("/1")
    public String hello1(){
        return "Second Cxf hello world! - 1";
    }

}
