package br.com.resource;

import br.com.domain.HelloWorldPojo;
import br.com.services.HelloWorldService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
@Path("/request")
public class ServiceWhichCallsYourOtherAPI {

    @Inject
    @RestClient
    HelloWorldService helloWorldService;

    @POST
    public HelloWorldPojo MethodA(HelloWorldPojo payloadToSend){
              helloWorldService.callHelloWorld(payloadToSend);
              return payloadToSend;
    }
}
