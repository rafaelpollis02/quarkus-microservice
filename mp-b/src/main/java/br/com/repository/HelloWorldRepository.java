package br.com.repository;

import br.com.domain.HelloWorld;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldRepository implements PanacheRepository<HelloWorld> {
}
