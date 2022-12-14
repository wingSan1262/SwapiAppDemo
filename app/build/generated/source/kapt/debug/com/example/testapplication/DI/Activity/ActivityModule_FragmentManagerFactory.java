// Generated by Dagger (https://dagger.dev).
package com.example.testapplication.DI.Activity;

import androidx.fragment.app.FragmentManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_FragmentManagerFactory implements Factory<FragmentManager> {
  private final ActivityModule module;

  public ActivityModule_FragmentManagerFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public FragmentManager get() {
    return fragmentManager(module);
  }

  public static ActivityModule_FragmentManagerFactory create(ActivityModule module) {
    return new ActivityModule_FragmentManagerFactory(module);
  }

  public static FragmentManager fragmentManager(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.fragmentManager());
  }
}
