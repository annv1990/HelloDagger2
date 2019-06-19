package com.ajs.hellodagger2;

import android.app.Application;
import android.content.Context;

import com.ajs.hellodagger2.di.component.ApplicationComponent;
import com.ajs.hellodagger2.di.component.DaggerApplicationComponent;
import com.ajs.hellodagger2.di.module.ApplicationModule;

import javax.inject.Inject;

public class HelloDagger2Application extends Application {

    ApplicationComponent mApplicationComponent;

    @Inject
    DataManager dataManager;

    public static HelloDagger2Application get(Context context) {
        return (HelloDagger2Application) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
