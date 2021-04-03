# Design Patterns Essentials

## <a name='toc'>Table of Contents</a>
1. Classes
2. Interfaces
3. Encapsulation
4. Abstraction
5. Inheritance
6. Polymorphism
7. UML

## Classes
- Blueprint of a real world object that we want to bring into life by using new. 
- What is coupling?
    - Determines how much a class is coupled or dependent on another class
    - Eg. "Main" class is dependent on "User" class
    - Even if we don't have a breaking change, the dependent classes needs to recompiled.
        - This can lead to cascading changes if there is a large code base

## Interfaces
- Interface is a contract that specifies the capabilities that a class should provide
- In our application we should always try to work with interfaces because it is easier to change implementation details
 without affecting consumer of the interface.
- Any change to implementation wont impact the consumer because we have programmed it work with the interface

## Encapsulation
- Encapsulation is about bundling the data and methods that operate on the data within one unit and hiding the value and 
state of the object inside the class.
- Other class should not be able to update the state of an object directly using member variables
- Member variables should be hidden using private modifiers

## Abstraction
- Reduces the complexity by hiding unnecessary details in our classes
- Eg. While using a remote control we don't care about the internal complexities of how a "Turn On" button works.
 We just care about that using that button the TV will switch on. 

## Inheritance
- It is a mechanism for reusing code across our classes
- Common behavior is moved to parent class
- It represents an IS-A relation

## Polymorphism
- Means Many forms, basically it is an ability of an object to take many forms
- Object can take many forms at the run time.

## UML
- Unified Modelling Language
- Types of relations
    - "extends" is a arrow with an empty triangle ----|>
    ```java
      public class Rectangle extends Shape {}
    ```
    - "composition" is represented with a diamond (owning side)  <> ---->
    ```java
          public class Shape {
              private Size size;
           }
    ``` 
    - "dependency" is dotted arrow ---->
    ```java
      public class Shape {
          // Here document is a dependency of Shape
          public void render(Document document){}    
      }
    ```