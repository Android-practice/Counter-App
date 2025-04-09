# CounterApp

MVVM 
MVVM stands for Model - View - ViewModel
separate the task so make codes easier to understand & maintain & test

1. Model
   - data & business logic of the app
   - retrieving & storing data
   - process the data if it 

2. View
   - UI of the app (interact with user)

3. ViewModel
   - bridge between Model & View
      -> take data from the Model, applies UI logic and formats it for display in the view


MVVM : View Model
manager that handles the communication between app's data & UI
ALSO! respect(consider) the lifecycle of the app's activity or fragment while handling data

```kotlin
   class MyViewModel : ViewModel() { // extends ViewModel
       
       //
   }
```

```kotlin
   class MainActivity : AppCompatActivity() {
       private val myViewModel : MyViewModel by viewModels() // usually initialized in an activity or fragment
   }

```

why is viewModel important?
1. lifecycle awareness : ViewModel is designed to store and manage UI-related data in a lifecycle-conscious way
It allows data to survive configuration changes (ex. screen rotations)


**[bulb emoji]tips1** 
without ViewModel pattern, variables are automatically initialized when configuration changes
this is because Activity or Fragment in android recreated when that kind of changes happen
: screen rotations -> old instance(activity/fragment) are destroyed -> new instance created -> all variables that old instance has are gone and new variables are initiallized with initial value

then how can viewModel keep the data?
ViewModel last longer than Activity/Fragment 
because it is stored inside the "ViewModelStore"(which is an storage in the memory) like Application instance)
and returned by "ViewModelProvider"

2. separation of concerns : 
ViewModel helps to keep UI code simple and focused on presenting data (ex. formatting.. )


**[bulb emoji]tips2**
- ViewModel is not a replacement for "onSaveInstanceState"; it doesn't handle all types of configuration changes
- ViewModel should never contains refrences to Views, Activities, Fragment or any Context( can lead memory leaks)

why mvvm?
1. separation of concerns
    - clear separation between UI/business logic/data
    - ensures that each components has a distinct responsibility(organized & easy to maintain)
2. testability
    - can test each component independently(test ViewModel without UI/data)
3. reusability
    - decoupled, can reuse the same view model across different views or platforms


why repository?

various data sources(db, web..) - repository - app 
1)farm 2)market 3) ... - supplier - restaurant

if there is supplier between source and app
app doesn't need to care/know every time when sources it self/deliver method/etc are changed 