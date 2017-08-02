package ru.thecop.bootangular.dev;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import ru.thecop.bootangular.dev.dto.SomeDto;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

@Path("/")
@Service
@Produces(MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CxfDevController {

    private ObjectMapper objectMapper;

    @Inject
    public CxfDevController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GET
    public String hello(){
        return "Cxf hello world!";
    }

    @GET
    @Path("/1")
    public String hello1(){
        return "Cxf hello world! - 1";
    }

    @GET
    @Path("/dto")
    public SomeDto dto(){
        return new SomeDto(new Date(),"hello dto!", 667);
    }

}
