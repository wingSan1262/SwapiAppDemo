// Generated by Dagger (https://dagger.dev).
package com.example.testapplication.DI.App;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import vanrrtech.app.ajaib_app_sample.data.SQDb.github.LocalDb;
import vanrrtech.app.ajaib_app_sample.data.SQDb.github.PeopleItemDao;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetUserListDataDBDaoFactory implements Factory<PeopleItemDao> {
  private final AppModule module;

  private final Provider<LocalDb> dbProvider;

  public AppModule_GetUserListDataDBDaoFactory(AppModule module, Provider<LocalDb> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public PeopleItemDao get() {
    return getUserListDataDBDao(module, dbProvider.get());
  }

  public static AppModule_GetUserListDataDBDaoFactory create(AppModule module,
      Provider<LocalDb> dbProvider) {
    return new AppModule_GetUserListDataDBDaoFactory(module, dbProvider);
  }

  public static PeopleItemDao getUserListDataDBDao(AppModule instance, LocalDb db) {
    return Preconditions.checkNotNullFromProvides(instance.getUserListDataDBDao(db));
  }
}
