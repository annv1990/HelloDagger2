package com.ajs.hellodagger2.di.component;


import com.ajs.hellodagger2.MainActivity;
import com.ajs.hellodagger2.di.module.ActivityModule;
import com.ajs.hellodagger2.qualifier.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
