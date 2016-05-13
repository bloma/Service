package com.example.shaunmesias.assignment_6_2;

import com.example.shaunmesias.assignment_6_2.domain.person.Person;
import com.example.shaunmesias.assignment_6_2.factories.person.PersonFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shaun Mesias on 2016/05/07.
 */
public class PersonTest {
    @Test
    public void testCreate() throws Exception {
        Person details = PersonFactory.getPerson("1234", "messi", "CapeTown", "se@r.com");
        Assert.assertEquals("messi", details.getName());
    }

    @Test
    public void testUpdate() throws Exception {
        Person details= PersonFactory.getPerson("1234", "messi", "CapeTown", "se@r.com");
        Person update = new Person.Builder()
                .copy(details)
                .location("Durban")
                .build();
        Assert.assertEquals("Durban", update.getLocation());
        Assert.assertEquals("messi", update.getName());
    }
}
