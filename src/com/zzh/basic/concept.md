### visibility modifiers
There have been no visibility modifiers, such as `public` or `private`, in the code so far. That's because by default, everything in Kotlin is `public`, which means that everything can be accessed everywhere, including classes, methods, properties, and member variables.

In Kotlin, classes, objects, interfaces, constructors, functions, properties, and their setters can have _visibility modifiers_:

- `public` means visible outside the class. Everything is public by default, including variables and methods of the class.
- `internal` means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library or application.
- `private` means it will only be visible in that class (or source file if you are working with functions).
- `protected` is the same as private, but it will also be visible to any subclasses.

### Member variables
Properties within a class, or member variables, are `public` by default. If you define them with `var`, they are mutable, that is, readable and writable. If you define them with `val`, they are read-only after initialization.

If you want a property that your code can read or write, but outside code can only read, you can leave the property and its getter as public and declare the setter private, as shown below.

````kotlin
var volume: Int
    get() = width * height * length / 1000
    private set(value) {
        height = (value * 1000) / (width * length)
    }
````

### Classes and constructors
- Define a class in Kotlin using class.
- Kotlin automatically creates setters and getters for properties.
- Define the primary constructor directly in the class definition. For example:

    `class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40)`
- If a primary constructor needs additional code, write it in one or more `init` blocks.
A class can define one or more secondary constructors using `constructor`, but Kotlin style is to use a factory function instead.
### Visibility modifiers and subclasses
- All classes and functions in Kotlin are `public` by default, but you can use modifiers to change the visibility to `internal`, `private`, or `protected`.
- To make a subclass, the parent class must be marked `open`.
- To override methods and properties in a subclass, the methods and properties must be marked `open` in the parent class.
- A sealed class can be subclassed only in the same file where it is defined. Make a sealed class by prefixing the declaration with `sealed`.
### Data classes, singletons, and enums
- Make a data class by prefixing the declaration with `data`.
- Destructuring is a shorthand for assigning the properties of a data object to separate variables.
- Make a singleton class by using `object` instead of class.
- Define an enum using `enum class`.
### Abstract classes, interfaces, and delegation
- Abstract classes and interfaces are two ways to share common behavior between classes.
- An abstract class defines properties and behavior, but leaves the implementation to subclasses.
- An interface defines behavior, and may provide default implementations for some or all of the behavior.
- When you use interfaces to compose a class, the class's functionality is extended by way of the class instances that it contains.
- Interface delegation uses composition, but also delegates the implementation to the interface classes.
- Composition is a powerful way to add functionality to a class using interface delegation. In general composition is preferred, but inheritance from an abstract class is a better fit for some problems.