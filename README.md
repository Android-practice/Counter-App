# CounterApp
A simple Counter app built using the MVVM pattern.
This project is for practicing MVVM to understand its structure and the use of repositories.

## ✨Features
- Increment
- Decrement

## 📱Previews
<p align="center">
  <img src="https://github.com/Android-practice/Counter-App/blob/master/images/decrement.png" width="200"/>
  <img src="https://github.com/Android-practice/Counter-App/blob/master/images/increment.png" width="200"/>
</p>
<p align="center">
<<<<<<< HEAD
  <img src="https://github.com/Android-practice/Counter-App/blob/master/images/rotate.png" height="200"/>
=======
  <img src="https://github.com/Android-practice/Counter-App/blob/master/images/rotate.png" width="200"/>
>>>>>>> counter-app/master
</p>

---

## Key Concept

### MVVM
MVVM stands for Model - View - ViewModel.
It separates responsibilities to make the code easier to understand, maintain, and test.

#### 1. Model
- Handles the data and business logic of the app.
- Retrieves and stores data.
- Processes the data if needed.

#### 2. View
- Represents the UI of the app.
- Handles user interactions.

#### 3. ViewModel
- Acts as a bridge between the Model and the View.
- Takes data from the Model, applies UI logic, and formats it for display in the View.

### MVVM: ViewModel
The ViewModel manages the communication between the app's data and its UI.
It also respects the lifecycle of the app's activity or fragment while handling data.

```kotlin
class MyViewModel : ViewModel() {
    // ViewModel logic here
}
```

```kotlin
class MainActivity : AppCompatActivity() {
    private val myViewModel: MyViewModel by viewModels() // Usually initialized in an activity or fragment
}
```

#### Why is ViewModel important?
1. **Lifecycle Awareness**
   - ViewModel is designed to store and manage UI-related data in a lifecycle-conscious way.
   - It allows data to survive configuration changes (e.g., screen rotations).

<<<<<<< HEAD
```
=======
>>>>>>> counter-app/master
💡 **Tip 1:**
Without using ViewModel, variables are re-initialized when configuration changes occur.
This is because Activities or Fragments are recreated during events like screen rotations.
-> Old instance (Activity/Fragment) is destroyed → New instance is created → All previous variables are lost.
<<<<<<< HEAD
```

### So how does ViewModel retain data?
=======

So how does ViewModel retain data?
>>>>>>> counter-app/master
- ViewModel lasts longer than Activity/Fragment.
- It is stored inside the **ViewModelStore** (a memory storage similar to the Application instance) and returned via the **ViewModelProvider**.

2. **Separation of Concerns**
   - ViewModel keeps UI code clean and focused on presenting data (e.g., formatting).

<<<<<<< HEAD
```
💡 **Tip 2:**
- ViewModel is not a replacement for `onSaveInstanceState`; it doesn't handle all types of configuration changes.
- ViewModel should never hold references to Views, Activities, Fragments, or Contexts (to avoid memory leaks).
```
=======
💡 **Tip 2:**
- ViewModel is not a replacement for `onSaveInstanceState`; it doesn't handle all types of configuration changes.
- ViewModel should never hold references to Views, Activities, Fragments, or Contexts (to avoid memory leaks).
>>>>>>> counter-app/master

### Why MVVM?
1. **Separation of Concerns**
   - Clear separation between UI, business logic, and data.
   - Each component has a distinct responsibility, making the code more organized and easier to maintain.

2. **Testability**
   - Each component can be tested independently (e.g., test ViewModel without UI or data).

3. **Reusability**
   - Since components are decoupled, the same ViewModel can be reused across different views or platforms.

---

## Repository
A Repository is a class that serves as a clean API for data access across the app—especially when following the MVVM pattern.
It abstracts the origin of data (e.g., local DB, network, web).

Think of it like:
- **Sources**: Farm, Market, etc.
- **Supplier**: Repository
- **App (ViewModel)**: Restaurant

With a supplier in place, the app doesn't need to worry about the source, delivery method, or any changes in how the data is fetched.

### Why use Repository?
1. **Decoupling**
   - The repository decouples data sources from the rest of the app.
   - ViewModel interacts only with the repository and doesn't care about where the data comes from.

2. **Data Aggregation**
   - Repository can manage and coordinate multiple data sources, providing a clean API.

3. **Offline Capability**
   - Repository can cache network data to enable offline functionality.

---

## Additional Info: APIs
APIs (Application Programming Interfaces) are sets of rules and protocols that allow one software component to interact with another.

APIs define methods and data formats that applications can use to communicate.

In simpler terms:
<<<<<<< HEAD
- API : Restaurant menu
- Request : Placing an order
- Response : Dish served to you
=======
- API = Restaurant menu
- Request = Placing an order
- Response = Dish served to you
>>>>>>> counter-app/master

