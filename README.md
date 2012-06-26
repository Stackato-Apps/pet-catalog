Pet Catalog Sample
=============
This is a JEE6 full sample with JSF2.0, EJB3.1 and JPA2.0.

This example uses the JEE Stackato Framework.

Database configuration
------------------------

Stackato detects if your application is a JEE application if contains the file /src/main/resources/META-INF/persistence.xml.

The Stackato JEE Framework creates a resources for each service created. In this example, we create a mysql service.

To access to this service, create a persistence-unit in the persistence.xml file (with the name you want) and the binding will be automatic. 

It's that easy!

Building the Application
------------------------

To build the application, make sure you have [Maven](http://maven.apache.org/ "Maven") installed.
Then, *cd* into the root directory and execute:

	mvn clean package

That will create the *catalog.war* file within the 'target' directory.

Running the Application
-----------------------

To run the application, make sure you have the Stackato client installed and that you are logged in successfully for your desired target environment (e.g. http://api.stackato.local).

Then execute:

	mvn clean package
	stackato push -n 

Notice that it detected the app type as "Java EE Application".

Then go on your application url. (default is stackato-XXXX/catalog)

That's all. Have fun!
