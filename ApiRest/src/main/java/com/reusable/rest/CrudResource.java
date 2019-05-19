package com.reusable.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public abstract class CrudResource<T> {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected JpaRepository<T, Long> repository;

    public CrudResource(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<T> getList() throws Exception {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    @RequestMapping(value="/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<T> getApplication(@PathVariable Long id)  {
        return repository.findById(id);
    }

    @PostMapping
    public ResponseEntity<T> insert(@RequestBody T application) {
        return new ResponseEntity<>(repository.save(application), HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<T> update(@RequestBody T application) {
        return new ResponseEntity<>(repository.save(application), HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity remove(@PathVariable Long id)  {
        repository.delete(repository.getOne(id));
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
