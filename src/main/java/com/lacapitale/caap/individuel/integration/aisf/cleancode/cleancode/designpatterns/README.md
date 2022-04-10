The project contains different examples of Structural and Behavioral design patterns in java and can be used to get 
acquaint with or refresh knowledge of the design patterns that are listed below.

# Structural design pattern
Structural patterns provide different ways to create a class structure, 
for example using inheritance and composition to create a large object from small objects.

## Adapter
Adapter design pattern is used so that two unrelated interfaces can work together. 
The object that joins these unrelated interface is called an Adapter.
##### Examples
- example1 - Buildings
- example2 - Luxury cars
- example3 - Credit card
- example4 - Socket adapter


## Bridge
When we have interface hierarchies in both interfaces as well as implementations, then bridge design pattern is used 
to decouple the interfaces from implementation and hiding the implementation details from the client programs.
The implementation of bridge design pattern follows the notion to prefer Composition over inheritance. 
##### Examples
- example1 - Shapes
- example2 - Dogs 
- example3 - Questions


## Composite
The pattern allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects.
It is used when we need a way to treat a whole group of objects in a similar, or the same manner.
##### Examples
- example1 - Shapes
- example2 - Employees 
- example3 - Employees 


## Proxy
The Proxy pattern is used when it's needed to limit and\or change the capabilities and\or the functionality of a class, 
by using another class. By using the proxy class, the client uses the interface it defines, to access the original class. 
This ensures that the client can't do anything out of order with the original class since all of his requests 
pass through the proxy class.
Or the pattern can be used for considering a heavy Java object (like a JDBC connection or a SessionFactory) 
that requires some initial configuration. And when it's needed such objects to be initialized on demand, and once they are, 
and to reuse them for all calls.
##### Examples
- example1 - Command executor
- example2 - Media file 
- example3 - Internet access
- example4 - Expensive object implementation


## Flyweight
The Flyweight pattern is concerned with reducing the strain on the JVM and its memory.
The pattern is aimed to reuse already existing similar kind of objects by storing them and create new object when 
no matching object is found.
Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, 
flyweight design pattern can be applied to reduce the load on memory by sharing objects. 
String Pool implementation in java is one of the best example of Flyweight pattern implementation.
##### Examples
- example1 - Shapes drawing
- example2 - Attendees
- example3 - Shop keeper


## Facade
The Facade pattern provides a unified and top-level or simplified interface for the client and allows it to access the system, 
without knowing any of the system logic and inner-workings, so that it hides the complexities of the subsystem from the client.
##### Examples
- example1 - Databases and reports
- example2 - Animals feeding
- example3 - Shop keeper


## Decorator
The Decorator Pattern is also known as Wrapper.
Decorator design pattern is used to modify the functionality of an object at runtime 
or in other words to attach a flexible additional responsibilities to an object dynamically.
At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior. 
The pattern uses abstract classes or interface with composition to implement.
Inheritance or composition is used to extend the behavior of an object but this is done at compile time and it’s applicable 
to all the instances of the class. We can’t add any new functionality of remove any existing behavior at runtime – 
this is when Decorator pattern comes into picture.
##### Examples
- example1 - Cars
- example2 - Computers
- example3 - Food


# Behavioral design pattern
Behavioral patterns provide solution for the better interaction between objects and how to provide lose coupling 
and flexibility to extend easily.

## Template Method (Template Pattern)
The Template Method Pattern is also known as Template Pattern.
It boils down to defining an abstract class that provides predefined ways to run its methods. Sub-classes that inherit 
these methods must also follow the way defined in the abstract class. In some cases, the abstract class may already 
include a method implementation, not just instructions, if it's a functionality that will be shared amongst all 
or most of the sub-classes.
##### Examples
- example1 - House building
- example2 - Employees responsibilities


## Mediator
Mediator design pattern is used to provide a centralized communication medium between different objects in a system. 
It's is very helpful in an enterprise application where multiple objects are interacting with each other. 
In large-scale applications, direct communication means tight-coupling which makes it hard to test, maintain and scale. 
Mediator pattern focuses on provide a mediator between objects for communication and help in implementing lose-coupling 
between objects.
##### Examples
- example1 - User chat
- example2 - Chatroom application


## Chain of Responsibility
The pattern helps to avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request.
Chain of responsibility pattern is used to achieve lose coupling in software design where a request from client is passed 
to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request 
and whether the request is required to be sent to the next object in the chain or not.
##### Examples
- example1 - ATM dispenser
- example2 - Project work
- example3 - Logging


## Observer
The Observer pattern is used to monitor the state of a certain object, often in a group or one-to-many relationship.
Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever 
there is any change. In observer pattern, the object that watch on the state of another object are called Observer 
and the object that is being watched is called Subject.
##### Examples
- example1 - Topic subscribers
- example2 - Office


## Strategy (Policy Pattern)
Strategy pattern is used when there is multiple algorithm for a specific task and client decides the actual 
implementation to be used at runtime. Strategy pattern is also known as Policy Pattern. We defines multiple algorithms 
and let client application pass the algorithm to be used as a parameter. One of the best example of this pattern 
is Collections.sort() method that takes Comparator parameter.
##### Examples
- example1 - Payment method
- example2 - Build strategy


## Command
Decoupling design pattern, the Command pattern works by wrapping the request from the sender in an object called a command. 
This command is then passed to the invoker object, which proceeds to look for the appropriate way to process the request.
Once it finds the appropriate way to handle the request, it passes the command, where it will be executed.
##### Examples
- example1 - File System utility
- example2 - Application order
- example3 - Menu commands


## State
State design pattern is used when an Object change it’s behavior based on it’s internal state.
If it's needed to change the behavior of an object based on it’s state, state variable can be created in the Object 
and if-else condition block to perform different actions based on the state. 
State pattern is used to provide a systematic and lose-coupled way to achieve this through Context and State implementations.
State Pattern Context is the class that has a State reference to one of the concrete implementations of the State. 
Context forwards the request to the state object for processing.
##### Examples
- example1 - TV Remote
- example2 - Application status


## Visitor
Visitor pattern is used when it's needed to perform an operation on a group of similar kind of Objects. 
With the help of visitor pattern it's possible to move the operational logic from the objects to another class.
This makes it easy to add new functionality without changing visited classes.
That being said, the objects don't have to be the same and can be unrelated, implementing different interfaces etc.
##### Examples
- example1 - Shopping cart
- example2 - Exporting shapes into XML


## Interpreter
The Interpreter pattern is used anytime when it's needed to evaluate any kind of language grammar or expressions. 
A good example of this pattern would be Google Translate, which interprets the input, and shows the output in another language.
Another example would be the Java compiler. The compiler interprets Java code and translates it into byte code that 
the JVM uses to perform operations on the device it runs on.
This pattern also represents a great way to write simple programs that understand human-like syntax.
##### Examples
- example1 - Number interpreter
- example2 - Math operations 


## Iterator
The Iterator pattern is used as the core pattern of Java's Collection Framework. 
It's used to access the members of collections all the while hiding the underlying implementation.
Iterator pattern is not only about traversing through a collection, different kind of iterators can be provided based 
on some specific requirements.
##### Examples
- example1 - Channel iterator
- example2 - Map iterator


## Memento
Memento design pattern is used when it's needed to save the state of an object so that later on it can be restored. 
Memento pattern is aimed to implement this in such a way that the saved state data of the object is not accessible 
outside of the object, this protects the integrity of saved state data.
Memento pattern is implemented with two objects – Originator and Caretaker. 
Originator is the object whose state needs to be saved and restored and it uses a Memento class to save the state of object. 
Memento class can be private, so that it's not possible to accessed it from other objects.

##### Examples
- example1 - File writer util
- example2 - List of stored objects


# Resources
https://www.journaldev.com/1827/java-design-patterns-example-tutorial

https://stackabuse.com/structural-design-patterns-in-java/
https://stackabuse.com/behavioral-design-patterns-in-java/

https://www.javatpoint.com/design-patterns-in-java
https://www.baeldung.com/java-structural-design-patterns 


