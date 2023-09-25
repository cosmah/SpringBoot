package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //saved as a service
public class PersonService {

    private  final PersonDao personDao;

    //inject by auto wiring intothe interface(constructor)

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }


    public  int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
