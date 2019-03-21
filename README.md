# senior-java-test

### Task Definition

Write Java code that compiles to a self-contained (no shared libraries or external configuration required)  WAR archive.

A basic Maven project is already provided, with some core libraries included in the POM file:

* MySQL database driver
* Spring DI framework 
* Spring MVC web framework
* Jackson JSON libraries 
* Mockito for mocking test dependencies
* AssertJ for fluent JUnit assertions
* SLF4J and Logback for logging

If you would prefer to use alternative libraries please feel free to do so by amending the POM file as appropriate.

Some configuration is already provided in order to instantiate a data source to a cloud instance of MySQL 8.  This database will be running continuously.  Note that the user/password provided only grants SELECT privileges - this should be sufficient to complete the exercise.  Please study the database using a database client of your choice.

Build a web service endpoint that conforms to a standard REST URL pattern that does the following: 

* Retrieves all orders in JSON format for a supplied customer number.  Include details of the equipment, trim, engine and model for each vehicle.  The data should be structured appropriately.
* Returns an appropriate HTTP status for both standard and exceptional circumstances.

Code should be optimised for performance wherever possible.

If you have time, please feel free to add some unit and/or integration tests to cover your code.  A basic test harness for both unit and integration testing is already set up.  Again, please modify this to fit your needs if necessary.

When you have completed the task, please submit your code either as a ZIP archive or provide a link to the checked in source in your personal Github or similar.
