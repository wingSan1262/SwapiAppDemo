# SwapiAppDemo
this is a github user search app with Clean-ish Architecture (if you may) and other modern App stack
Use SuspendRetrofit, UseCase pattern, MVVM, Dagger with scoping, LiveData along with Event, Navigation Graph,
Single Activity (yet), Coroutine, Mockk tsting, Espresso Testing

this api basically show the searching feature for Starwars Character
from Swapi.dev

## Common Setting
SDK 22 until 32 
Native Android Kotlin

## a bit clean arch
basically this App use 3 layer as whole
data, domain, ui
data : where you put your API and other data fetcher thing
Domain : is where the usecases, the data needs to be processed for app side, data mapper etc
UI : Basically cover all other package except the Data and Domain layer, as it's name main function to accomodate the DATA and DOMAIN to show it to USER

## Dagger Construction
the Dagger actually follow the Hilt convention for scoping component to 3 type
Application, Activity and Fragment
Which Component that you decide should stay from the app start and terminated, you go for the AplicationScoped Module
same if the object stay during activity or fragment use the corresponding scope

## Live Data Pattern
the Usecase was basically wrapping between API and converting it to live data
Basically the pattern was this
Data (API, DB API interface) -> UseCase (call api and post it live data) -> ViewModel (instantiate UseCase and obtain the live data) -> View (subscribe livedata, and invoke api through view model)

## Testing
the testing used was Unit Test and UI test
the UnitTest coverage aroung 40% class and 30% line please check here
[Unit Test Result](https://github.com/wingSan1262/SwapiAppDemo/blob/main/Unit%20Test.png) and 
[Coverage Result](https://github.com/wingSan1262/SwapiAppDemo/blob/main/Coverage.png)

The Ui test cover all screen in the app, please check here for the result
[UI Test Result](https://github.com/wingSan1262/SwapiAppDemo/blob/main/UI%20Test.png)


## TODO
The api implemented only for the people searching, have 4 other good searching api for searching type
please check on swapi.dev
Viewmodel instciate still not using the bind feature from the dagger


