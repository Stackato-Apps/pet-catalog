Pet Catalog Sample
=============

This is a full JEE6 sample with JSF2.0, EJB3.1 and JPA2.0.

This example uses the JavaEE framework from the Stackato legacy buildpack.

Database configuration
------------------------

Because we have indicated a `framework` tag in the manifest.yml file, Stackato will use the legacy buildpack with the indicated framework (In this case, `java_ee`).

We have also indicated that the app needs a mysql service, so Stackato will create one and associate it to the application.

To access this service, there is a persistence-unit tag in the persistence.xml file which binds automatically to your database. 

It's that easy!

Building the Application
------------------------

It is possible to build the application either with Ant or Maven.

### Ant

Make sure your have [Ant](http://ant.apache.org/ "Ant") installed.
Then, *cd* into the root directory and execute:

	ant clean package
	
That will create the *catalog.war* file within the 'target' directory.

### Maven

Make sure you have [Maven](http://maven.apache.org/ "Maven") installed.
Then, *cd* into the root directory and execute:

	mvn clean package

That will create the *catalog.war* file within the 'target' directory.

Running the Application
-----------------------

To run the application, make sure you have the Stackato client installed and that you are logged in successfully for your desired target environment (e.g. http://api.stackato.local).

Then execute:

	stackato push -n 

Notice that it detected the app type as "Java EE Application".

Then go on your application url.

That's all. Have fun!
