package br.com.victorgabrielfs.controllers;

import br.com.victorgabrielfs.models.Person;
import br.com.victorgabrielfs.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    public PersonServices service;

    //Create
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    //Read
    @GetMapping(value = "/{id}",
            produces= MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable(value="id") Long id) {
        return service.findById(id);
    }

    //Read All
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findAll() {
        return service.findAll();
    }

    //Update
    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    //Delete
    @DeleteMapping(value = "/{id}",
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable(value="id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
