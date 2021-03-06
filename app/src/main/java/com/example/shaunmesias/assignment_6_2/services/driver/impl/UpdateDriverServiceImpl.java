package com.example.shaunmesias.assignment_6_2.services.driver.impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.shaunmesias.assignment_6_2.conf.util.App;
import com.example.shaunmesias.assignment_6_2.domain.driver.Driver;
import com.example.shaunmesias.assignment_6_2.repository.driver.DriverRepository;
import com.example.shaunmesias.assignment_6_2.repository.driver.impl.DriverRepositoryImpl;
import com.example.shaunmesias.assignment_6_2.services.driver.UpdateDriverService;

/**
 * Created by Shaun Mesias on 2016/05/12.
 * This Intent service is used to update a driver in the repository
 * The user doesn't need to be notified when updating the repository was successful.
 */
public class UpdateDriverServiceImpl extends IntentService implements UpdateDriverService {
    public static final String ACTION_FOO = "com.example.shaunmesias.assignment_6_2.services.driver.impl.action.FOO";

    public static final String EXTRA_PARAM1 = "com.example.shaunmesias.assignment_6_2.services.driver.impl.extra.PARAM1";

    DriverRepository repository;

    public static final String TAG = "com.example.shaunmesias.assignment_6_2.services.driver.impl";

    private static UpdateDriverServiceImpl service = null;

    public UpdateDriverServiceImpl(){
        super("UpdateDriverServiceImpl");
        repository = new DriverRepositoryImpl(App.getAppContext());
    }

    public static UpdateDriverServiceImpl getInstance() {
        if (service == null)
            service = new UpdateDriverServiceImpl();
        return service;
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Driver driver = (Driver)intent.getSerializableExtra(EXTRA_PARAM1);
            Driver newDriver = new Driver.Builder()
                    .copy(driver)
                    .build();

            repository.update(newDriver);
        Log.i(TAG, "The service has started...........");
    }

    @Override
    public void updateDriver(Context context, Driver driver) {
        Log.i(TAG, "The updateDriver");
        Intent intent = new Intent(context, UpdateDriverServiceImpl.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, driver);
        context.startService(intent);
    }
}
