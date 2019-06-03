package com.testsecurity.rest;

import com.testsecurity.domain.entities.Client;
import com.testsecurity.domain.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
