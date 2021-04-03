package com.rohan.dp.proxy.problem.ex2;

/**
 * We’re going to build an O/RM (Object Relational Mapper). ORMs are tools
 * responsible for mapping data between a relational database and an objectoriented
 * model. There are many popular O/RMs out there such as Hibernate
 * and Entity Framework.
 * <p>
 * You can see a “super simplified” implementation of our imaginary ORM in the
 * proxy package.
 * <p>
 * We use the DbContext class to read or write data to our database. The
 * Demo class shows the typical workflow for using a DbContext
 * - Read an object from a database (dbContext.getProduct())
 * - Change the properties of the in-memory object (product.setName())
 * - Ask the dbContext to save the changes (dbContext.saveChanges())
 * <p>
 * If you run the code in the Demo class, you’ll only see a SELECT statement
 * printed on the terminal. This simulates reading a product record from a
 * database.
 * <p>
 * What is missing is the two UPDATE statements that should be generated
 * when we save the changes. The reason this is happening is that our
 * DbContext cannot keep track of the changed objects. So, when we call
 * saveChanges(), nothing happens.
 * <p>
 * We can solve this problem using the proxy pattern. A proxy object looks like
 * our target object (eg a Product object) but it adds some extra behavior to it.
 * For example, when we call the setName() method, the proxy notifies the
 * DbContext that it is changed. DbContext provides a method for this:
 * markAsChanged().
 */
public class Main {
    public static void main(String[] args) {

        var dbContext = new DbContext();

        // We read an object (eg a product) from a database.
        var product = dbContext.getProduct(1);

        // We modify the properties of the object in memory.
        product.setName("Updated Name");

        // DbContext should keep track of changed objects in memory.
        // When we call saveChanges(), it'll automatically generate
        // the right SQL statements to update our database.
        dbContext.saveChanges();

        // After saving the changes to the database, we can
        // change our in-memory object again and save the changes.
        product.setName("Another name");
        dbContext.saveChanges();
    }
}
