package br.com.victorgabrielfs.controllers;

import br.com.victorgabrielfs.models.Person;
import br.com.victorgabrielfs.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    public PersonServices service;

    //Create
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    //Read
    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable(value="id") String id) {
        return service.findById(id);
    }

    //Read All
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findAll() {
        return service.findAll();
    }

    //Update
    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    //Delete
    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable(value="id") String id) {
        service.delete(id);
    }


}
