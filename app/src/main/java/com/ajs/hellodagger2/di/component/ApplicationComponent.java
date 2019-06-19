package com.ajs.hellodagger2.di.component;

import android.app.Application;
import android.content.Context;

import com.ajs.hellodagger2.DataManager;
import com.ajs.hellodagger2.DbHelper;
import com.ajs.hellodagger2.HelloDagger2Application;
import com.ajs.hellodagger2.SharedPrefsHelper;
import com.ajs.hellodagger2.di.module.ApplicationModule;
import com.ajs.hellodagger2.qualifier.ApplicationContext;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(HelloDagger2Application demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
