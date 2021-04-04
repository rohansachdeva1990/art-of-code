# SOLID Design Principles

Design principles encourage us to create more maintainable, understandable, and flexible software. Consequently, as our
applications grow in size, we can reduce their complexity and save ourselves a lot of headaches further down the road!

The following 5 concepts make up our SOLID principles:

- **S**ingle Responsibility
- **O**pen/Closed
- **L**iskov Substitution
- **I**nterface Segregation
- **D**ependency Inversion

## Single Responsibility Principle (SRP)

> _‘There should never be more than one reason for a class to change’_

- A class should have a just a single reason to change single class should have one primary responsibility instead of
  taking lots and lots of responsibilities.
- If we take lots of responsibilities, then we end up with a GOD Object (which is an ANTI-PATTERN)
- Sometimes, we tend to add stuff to a class, which feels good to have. But, the object is doing more than what is
  required. The responsibility can be delegated to some other object.
- Which will make the class more test-able
- So, if we try to add functions like saveToAFile, loadFromAFile, loadFromAUrl. Then we are just introducing new
  concerns. Ideally when are class is deviating from "primary" responsibility. We should think about separation of
  concern.

## Open/Close Principle (OCP)

> _‘A module should be open for extension but closed for modification’_

- Idea is not jump into the code which you have already written. Foreg
    - Filtering of products, Idea is to filter.
    - There could be endless combination of filter techniques depending on the product attributes.
    - So, why not give this filtering logic to the caller. The filtering logic is independent of the criteria that user
      wants.
- It should be Open for extension, but close for modification.
- So, modification of code that has already been written and tested is not great.
- It is ok to have separate logic which is closely defined to your model. But if the logic is influenced by lots of
  input. Then it is time to generalize the logic
- Idea is not to jump in the code which is written
- It can be solved using specification principle
- You are free to extend or implement it but close to modify the existing code.
- So, keep this in mind when designing a class which could have a modify request in future.
- Keep the variable business logic separate from fixed logic. In this way you don't need to change the code.

# Liskov Substitution Principle (LSP)

> _‘Subclasses should be substitutable for their base classes’_

- Idea is to substitute sub class for a base class
- If we have an API which takes a base class reference. It should be totally safe to pass sub class. (Without the things
  breaking)
- Can be achieved by Factory design pattern
    - Idea is to hide the construction logic of base and sub class.

## Interface Segregation Principle (ISP)

> _‘Many client specific interfaces are better than one general purpose interface’_

- Idea is to split interface to smaller interfaces
- You should not put something in your interface that is more than what client is expecting.
- Violation is forcing the API implementer to implement things that they don't support. User becomes puzzled if he/she
  is not sure about the api provided.

## Dependency Inversion Principle (DIP)

> _‘Depend upon abstractions. Do not depend upon concretions.’_

- High-level modules should not depend on low-level modules, and details should depend on abstractions.

## You Ain't Going to Need It (YAGNI)

- This principle supports the idea behind ISP
- If your class does not need to support an extra feature. Then don't do it. Because you ain't gonna need it. 😉
- Use Decorator Pattern to delegate responsibility to implemented interfaces.
So, Instead of sticking everything into single Class. Make it minimum possible. So, that end user at some point does not
face a dilemma of implementing work around of the things they cant support.
  
#### References

- https://reflectoring.io/categories/craft/
- https://rieckpil.de/category/other/craftsmanship/