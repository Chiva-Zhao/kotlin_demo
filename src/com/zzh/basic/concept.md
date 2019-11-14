### visibility modifiers
There have been no visibility modifiers, such as `public` or `private`, in the code so far. That's because by default, everything in Kotlin is `public`, which means that everything can be accessed everywhere, including classes, methods, properties, and member variables.

In Kotlin, classes, objects, interfaces, constructors, functions, properties, and their setters can have _visibility modifiers_:

- `public` means visible outside the class. Everything is public by default, including variables and methods of the class.
- `internal` means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library or application.
- `private` means it will only be visible in that class (or source file if you are working with functions).
- `protected` is the same as private, but it will also be visible to any subclasses.

#### Member variables
Properties within a class, or member variables, are `public` by default. If you define them with `var`, they are mutable, that is, readable and writable. If you define them with `val`, they are read-only after initialization.

If you want a property that your code can read or write, but outside code can only read, you can leave the property and its getter as public and declare the setter private, as shown below.

````kotlin
var volume: Int
    get() = width * height * length / 1000
    private set(value) {
        height = (value * 1000) / (width * length)
    }
````