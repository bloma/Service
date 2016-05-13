package com.example.shaunmesias.assignment_6_2.restapi.person;

import com.example.shaunmesias.assignment_6_2.conf.util.AppUtil;
import com.example.shaunmesias.assignment_6_2.domain.person.PersonContact;
import com.example.shaunmesias.assignment_6_2.restapi.PersonContactAPI;

import java.io.IOException;

/**
 * Created by Shaun Mesias on 2016/05/07.
 */
public class PersonContactAPIImpl implements PersonContactAPI{
    private static final String postUrl = AppUtil.getBaserURI() + "api/droid/person/contact/post";
    private static final String updateUrl = AppUtil.getBaserURI() + "api/droid/person/contact/update";

    @Override
    public PersonContact createPersonContact(PersonContact personContact) throws IOException {
        return null;
    }

    @Override
    public PersonContact updatePersonContact(PersonContact personContact) throws IOException {
        return null;
    }
}
