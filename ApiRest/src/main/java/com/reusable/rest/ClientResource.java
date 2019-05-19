package com.reusable.rest;

import com.reusable.domain.entities.Client;
import com.reusable.domain.exceptions.DomainException;
import com.reusable.domain.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = "*",
        methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS},
        allowedHeaders = {"token", "Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers"})
@RestController()
//@Transactional(rollbackFor = DomainException.class)
@RequestMapping("/client")
public class ClientResource extends CrudResource<Client>{

    @Autowired
    public ClientResource(ClientRepository repository) {
        super(repository);
    }

}
