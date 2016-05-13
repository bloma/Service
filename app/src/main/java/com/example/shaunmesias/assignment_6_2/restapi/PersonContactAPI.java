package com.example.shaunmesias.assignment_6_2.restapi;

import com.example.shaunmesias.assignment_6_2.domain.person.PersonContact;

import java.io.IOException;

/**
 * Created by Shaun Mesias on 2016/05/07.
 */
public interface PersonContactAPI {
    PersonContact createPersonContact(PersonContact personContact) throws IOException;
    PersonContact updatePersonContact(PersonContact personContact) throws IOException;
}
