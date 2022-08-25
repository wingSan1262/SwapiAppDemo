// Generated by Dagger (https://dagger.dev).
package com.example.testapplication.DI.Activity;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ContextFactory implements Factory<Context> {
  private final ActivityModule module;

  public ActivityModule_ContextFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return context(module);
  }

  public static ActivityModule_ContextFactory create(ActivityModule module) {
    return new ActivityModule_ContextFactory(module);
  }

  public static Context context(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.context());
  }
}
