# Advanced Java Programming

[Original Course on LinkedIn Learning](https://www.linkedin.com/learning/advanced-java-programming-2/learn-advanced-java-programming?resume=false)

## Requirements

- Java IDE
- Preferred SDK - Java 11

## Content - `src` folder

### Generics

- `GenericDatatypes.java`
    - Adds type-safety.
- `GenericMethods.java`
    - Allows to use a generic data type in the methods' scope.
- `VarArgs.java`
    - Accepts one or more elements, or array of elements as argument(s) to method.
- `WildCard/*`
    - When given variable is a child or parent of another class X. We write it as `? extends X` or `? super X`.

### Advanced Data Structures

- Choosing the right option
    - Ordering: Is the order important?
    - Duplicates: Do we need duplicate entries?
    - Speed: Operation Time
    - Memory

- Hierarchy:
    - Iterable
        - Collection
            - Set: Duplicates Not Allowed, Unordered.
            - List: Duplicates Allowed, Ordered.
            - Queue: FIFO Operations.
    - Map (Not usually considered as a part of collections because of the key-value pair structure).

- `LinkedListExample.java`
    - Quick for inserting and removing elements in the middle.

- `QueueUsingLinkedList/*`
    - Customers in Store Example.

### Functional Programming in Java

- `FunctionalProgramming/FunctionalInterfaceExample`
    - Contains only one abstract method.
    - Requires the annotation @FunctionalProgramming.

- `FunctionalProgramming/Lambdas`
    - Same as Functional Interface.
    - No need to create the object and override the method.
    - Lesser code.

- `MethodReference/*`
    - Same as Functional Interface and Lambdas.
    - Used to refer to another method of the object passed as the argument.
    - Lesser code.

- `StreamExample.java`
    - Easy to write parallel iterations. `parallelStream()`
    - Requires lesser code.
    - Easy to read.
    - Doesn't hold any data.

### Multithreading in Java

- `Multithreading/ThreadClass`
    - Extends thread class.

- `Multithreading/Runnable*`
    - Used when we want to extend from another class as well.

- `Synchronization/*`
    - When multiple resources access the same resource at the same time and may end up getting the unintended values.
    - `synchronized` makes sure that they access the resource one by one.

- Deadlocks
    - When two threads are waiting for resources already in use by the other thread.
        - Thread A has R1 (Given)
        - Thread B has R2 (Given)
        - Thread A requires R2 (Waiting)
        - Thread B requires R1 (Waiting)
        - Waiting for each other's resources create deadlock.

### I/O StreamExample in Java

- Each Stream has one-way flow.

- `ScannerExample.java`
    - Taking user input from console.

- `BufferedReaderExample.java`
    - Used for reading files.
    - It's Synchronized.
    
- `TryWithResources.java`
    - Another way to write try-catch-finally.
    - Avoids resource leakage.
    
- `DirectoriesExample.java`
    - Lists the content of directory and filter the files containing a period in the file name.
    
- `FileCreator.java`
    - Creates a new file
    
- `PathExample.java`
    - Introduction to `Path` object.
    - Allows you to do all the common operations with a file/directory.
        - Getting File Info
        - Copying Files
        - ...
    