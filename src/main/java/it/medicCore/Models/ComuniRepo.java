package it.medicCore.Models;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComuniRepo implements PanacheRepository<Comuni> {

}
