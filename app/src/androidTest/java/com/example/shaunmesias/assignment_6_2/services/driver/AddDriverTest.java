package com.example.shaunmesias.assignment_6_2.services.driver;

import android.test.AndroidTestCase;

import com.example.shaunmesias.assignment_6_2.conf.util.App;
import com.example.shaunmesias.assignment_6_2.domain.driver.Driver;
import com.example.shaunmesias.assignment_6_2.factories.driver.DriverFactory;
import com.example.shaunmesias.assignment_6_2.repository.driver.DriverRepository;
import com.example.shaunmesias.assignment_6_2.repository.driver.impl.DriverRepositoryImpl;
import com.example.shaunmesias.assignment_6_2.services.driver.impl.AddDriverServiceImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by Shaun Mesias on 2016/05/12.
 */
public class AddDriverTest extends AndroidTestCase {
    //DriverRepositoryImpl database;


    public void testDriverService() throws Exception {
        Driver driver = DriverFactory.getDriver("1234", "black", "Town", "sss.vom");
        AddDriverServiceImpl service = AddDriverServiceImpl.getInstance();
        DriverRepository database = new DriverRepositoryImpl(this.getContext());

        service.AddDriver(App.getAppContext(), driver);
        Thread.sleep(1000);

       //READ ALL
       /* Set<Driver> drivers = database.findAll();
        Assert.assertTrue(" READ ALL", drivers.size() > 0);*/
    }
}
