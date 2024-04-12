package br.com.services;

import br.com.domain.HelloWorldPojo;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8093/api/v1/stock")
//@RegisterRestClient(baseUri = "http://localhost:8080/api/v1/helloworld")
public interface HelloWorldService {

    @POST
    Response callHelloWorld(HelloWorldPojo payLoadToSend);
}
