// Generated by Dagger (https://dagger.dev).
package com.example.testapplication.DI.App;

import android.app.Application;
import com.example.testapplication.data.local_db.LocalDb;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetUserListDataDBFactory implements Factory<LocalDb> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_GetUserListDataDBFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocalDb get() {
    return getUserListDataDB(module, applicationProvider.get());
  }

  public static AppModule_GetUserListDataDBFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_GetUserListDataDBFactory(module, applicationProvider);
  }

  public static LocalDb getUserListDataDB(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.getUserListDataDB(application));
  }
}
