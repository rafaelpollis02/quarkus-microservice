package br.com.service;

import br.com.domain.HelloWorld;
import br.com.repository.HelloWorldRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class HelloWorldService {

    @Inject
    HelloWorldRepository helloWorldRepository;

    public List<HelloWorld> getAllHelloWorld(){
        return helloWorldRepository.listAll();
    }

    public HelloWorld postHelloWorld(HelloWorld helloWorld){
        helloWorldRepository.persist(helloWorld);
        System.out.println("Aeeeeeeeeeeee gravou porra !");
        return helloWorld;
    }

}
