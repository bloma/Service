package com.example.shaunmesias.assignment_6_2;

import com.example.shaunmesias.assignment_6_2.domain.driver.Driver;
import com.example.shaunmesias.assignment_6_2.factories.driver.DriverFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shaun Mesias on 2016/05/07.
 */
public class DriverTest {
    @Test
    public void testCreate() throws Exception {
        Driver details = DriverFactory.getDriver("1234","Mark","Town","sme@h.com");
        Assert.assertEquals("1234", details.getServerId());
    }

    @Test
    public void testUpdate() throws Exception {
        Driver details= DriverFactory.getDriver("1234", "Mark", "Town", "sme@h.com");
        Driver update = new Driver.Builder()
                .copy(details)
                .name("Steven")
                .build();
        Assert.assertEquals("Steven", update.getName());
        Assert.assertEquals("sme@h.com", update.getEmail());
    }
}
