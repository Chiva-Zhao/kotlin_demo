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
### collections,constants,extension functions and properties
- Pairs and triples can be used to return more than one value from a function. For example:
```val twoLists = fish.partition { isFreshWater(it) }```
- Kotlin has many useful functions for `List`, such as `reversed()`, `contains()`, and `subList()`.
- A `HashMap` can be used to map keys to values. For example:
```val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")```
- Declare compile-time constants using the `const` keyword. You can put them at the top level, organize them in a singleton object, or put them in a companion object.
- A companion object is a singleton object within a class definition, defined with the `companion` keyword.
- Extension functions and properties can add functionality to a class. For example:
```fun String.hasSpaces() = find { it == ' ' } != null```
- A nullable receiver allows you to create extensions on a class which can be `null`. The `?.` operator can be paired with `apply` to check for `null` before executing code. For example:
```this?.apply { println("removing $this") }```
### generic classes, methods, and functions
- Create generic classes to make code more flexible.
- Add generic constraints to limit the types used with generics.
Use `in` and `out` types with generics to provide better type checking to restrict types being passed into or returned from classes.
- Create generic functions and methods to work with generic types. For example:
```fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) { ... }```
- Use generic extension functions to add non-core functionality to a class.
- Reified types are sometimes necessary because of type erasure. Reified types, unlike generic types, persist to runtime.
- Use the `check()` function to verify your code is running as expected. For example:
```check(!waterSupply.needsProcessing) { "water supply needs processing first" }```
### annotations, labeled breaks, higher-order functions, SAM
- Use annotations to specify things to the compiler. For example:
```@file:JvmName("Foo")```
- Use labeled breaks to let your code exit from inside nested loops. For example:
```if (i > 10) break@outerLoop // breaks to outerLoop label```
- Lambdas can be very powerful when coupled with higher-order functions.
- Lambdas are objects. To avoid creating the object, you can mark the function with `inline`, and the compiler will put the contents of the lambda in the code directly.
- Use `inline` carefully, but it can help reduce resource usage by your program.
- SAM, Single Abstract Method, is a common pattern, and made simpler with lambdas. The basic pattern is:
```Class.singleAbstractMethod { lamba_of_override }```
- The Kotlin Standard Library provides numerous useful functions, including several SAMs, so get to know what's in it.