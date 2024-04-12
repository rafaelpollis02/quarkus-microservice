package br.com.resource;

import br.com.domain.HelloWorld;
import br.com.service.HelloWorldService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("api/v1/helloworld")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @Inject
    HelloWorldService helloWorldService;

    @GET
    public List<HelloWorld> getAllHelloWorld(){
        return helloWorldService.getAllHelloWorld();
    }

    @POST
    @Transactional
    public HelloWorld postHelloWorld(HelloWorld helloWorld){
        helloWorldService.postHelloWorld(helloWorld);
        return helloWorld;
    }

}
