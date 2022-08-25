// Generated by Dagger (https://dagger.dev).
package com.example.testapplication.DI.App;

import android.app.Application;
import com.example.testapplication.DI.Activity.ActivityComponent;
import com.example.testapplication.DI.Activity.ActivityModule;
import com.example.testapplication.DI.Activity.ActivityModule_ActivityFactory;
import com.example.testapplication.DI.Activity.ActivityModule_SearchViewModelFactory;
import com.example.testapplication.DI.Activity.ViewBinderFactory.ViewBinderFactory;
import com.example.testapplication.DI.Activity.ViewModelProducer.VmFactory;
import com.example.testapplication.base_component.base_classes.BaseActivity_MembersInjector;
import com.example.testapplication.data.remote_repository.SwapiApiInterface;
import com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase;
import com.example.testapplication.domain.usecases.FetchPeopleUseCase;
import com.example.testapplication.domain.usecases.SearchPeopleUseCase;
import com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase;
import com.example.testapplication.feature.MainActivity;
import com.example.testapplication.feature.MainActivity_MembersInjector;
import com.example.testapplication.feature.SearchViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import vanrrtech.app.ajaib_app_sample.data.SQDb.github.LocalDb;
import vanrrtech.app.ajaib_app_sample.data.SQDb.github.PeopleItemDao;
import vanrrtech.app.ajaib_app_sample.data.remote_repository.RemoteApiRetrofitClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<ViewBinderFactory> getViewBinderFactoryProvider;

  private Provider<Application> applicationProvider;

  private Provider<HttpLoggingInterceptor> getClientLoggerProvider;

  private Provider<OkHttpClient.Builder> getOkHttpClientBuilderProvider;

  private Provider<Retrofit> getRetrofitClientProvider;

  private Provider<RemoteApiRetrofitClient> getClientProvider;

  private Provider<LocalDb> getUserListDataDBProvider;

  private Provider<PeopleItemDao> getUserListDataDBDaoProvider;

  private Provider<SwapiApiInterface> getSwapiApiProvider;

  private Provider<FetchPeopleUseCase> getPeopleListProvider;

  private Provider<SearchPeopleUseCase> searchPeopleListProvider;

  private Provider<FetchOfflinePeopleListUseCase> getCachePeopleListProvider;

  private Provider<UpdateOfflinePeopleListUseCase> updateCachePeopleListProvider;

  private Provider<VmFactory> getVmFactoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, UseCasesModules useCasesModulesParam) {

    initialize(appModuleParam, useCasesModulesParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam,
      final UseCasesModules useCasesModulesParam) {
    this.getViewBinderFactoryProvider = DoubleCheck.provider(AppModule_GetViewBinderFactoryFactory.create(appModuleParam));
    this.applicationProvider = AppModule_ApplicationFactory.create(appModuleParam);
    this.getClientLoggerProvider = DoubleCheck.provider(AppModule_GetClientLoggerFactory.create(appModuleParam));
    this.getOkHttpClientBuilderProvider = DoubleCheck.provider(AppModule_GetOkHttpClientBuilderFactory.create(appModuleParam, getClientLoggerProvider));
    this.getRetrofitClientProvider = DoubleCheck.provider(AppModule_GetRetrofitClientFactory.create(appModuleParam, getOkHttpClientBuilderProvider));
    this.getClientProvider = DoubleCheck.provider(AppModule_GetClientFactory.create(appModuleParam, getRetrofitClientProvider));
    this.getUserListDataDBProvider = DoubleCheck.provider(AppModule_GetUserListDataDBFactory.create(appModuleParam, applicationProvider));
    this.getUserListDataDBDaoProvider = DoubleCheck.provider(AppModule_GetUserListDataDBDaoFactory.create(appModuleParam, getUserListDataDBProvider));
    this.getSwapiApiProvider = DoubleCheck.provider(AppModule_GetSwapiApiFactory.create(appModuleParam, getClientProvider, getUserListDataDBDaoProvider));
    this.getPeopleListProvider = DoubleCheck.provider(UseCasesModules_GetPeopleListFactory.create(useCasesModulesParam, getSwapiApiProvider));
    this.searchPeopleListProvider = DoubleCheck.provider(UseCasesModules_SearchPeopleListFactory.create(useCasesModulesParam, getSwapiApiProvider));
    this.getCachePeopleListProvider = DoubleCheck.provider(UseCasesModules_GetCachePeopleListFactory.create(useCasesModulesParam, getSwapiApiProvider));
    this.updateCachePeopleListProvider = DoubleCheck.provider(UseCasesModules_UpdateCachePeopleListFactory.create(useCasesModulesParam, getSwapiApiProvider));
    this.getVmFactoryProvider = DoubleCheck.provider(AppModule_GetVmFactoryFactory.create(appModuleParam, applicationProvider, getPeopleListProvider, searchPeopleListProvider, getCachePeopleListProvider, updateCachePeopleListProvider));
  }

  @Override
  public ActivityComponent newActivityComponent(ActivityModule activityModule) {
    Preconditions.checkNotNull(activityModule);
    return new ActivityComponentImpl(appComponent, activityModule);
  }

  public static final class Builder {
    private AppModule appModule;

    private UseCasesModules useCasesModules;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder useCasesModules(UseCasesModules useCasesModules) {
      this.useCasesModules = Preconditions.checkNotNull(useCasesModules);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      if (useCasesModules == null) {
        this.useCasesModules = new UseCasesModules();
      }
      return new DaggerAppComponent(appModule, useCasesModules);
    }
  }

  private static final class ActivityComponentImpl implements ActivityComponent {
    private final ActivityModule activityModule;

    private final DaggerAppComponent appComponent;

    private final ActivityComponentImpl activityComponentImpl = this;

    private ActivityComponentImpl(DaggerAppComponent appComponent,
        ActivityModule activityModuleParam) {
      this.appComponent = appComponent;
      this.activityModule = activityModuleParam;

    }

    private SearchViewModel searchViewModel() {
      return ActivityModule_SearchViewModelFactory.searchViewModel(activityModule, ActivityModule_ActivityFactory.activity(activityModule), appComponent.getVmFactoryProvider.get());
    }

    @Override
    public void inject(MainActivity context) {
      injectMainActivity(context);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      BaseActivity_MembersInjector.injectViewBinderFactory(instance, appComponent.getViewBinderFactoryProvider.get());
      MainActivity_MembersInjector.injectSearchViewModel(instance, searchViewModel());
      return instance;
    }
  }
}
