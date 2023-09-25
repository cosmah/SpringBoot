package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/person")
@RestController
public class personController {


    private  final PersonService personService;
    @Autowired
    public personController(PersonService personService) {

        this.personService = personService;
    }

    @PostMapping  //post
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

}
