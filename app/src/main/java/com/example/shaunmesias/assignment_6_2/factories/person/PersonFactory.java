package com.example.shaunmesias.assignment_6_2.factories.person;

import com.example.shaunmesias.assignment_6_2.domain.person.Person;

/**
 * Created by Shaun Mesias on 2016/05/07.
 */
public class PersonFactory {
    public static Person getPerson(String serverId, String name, String location, String email)
    {
        return new Person.Builder()
                .serverId(serverId)
                .name(name)
                .location(location)
                .email(email)
                .build();
    }
}
