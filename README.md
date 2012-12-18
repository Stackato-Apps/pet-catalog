Pet Catalog Sample
==================

This is a full JEE6 sample with JSF2.0, EJB3.1 and JPA2.0.

This example uses the JEE Stackato Framework.

Running the Application
-----------------------

To run the application, make sure you have the Stackato client installed and 
that you are logged in successfully for your desired target environment 
(e.g. http://api.stackato.local).

Then execute:

	stackato push -n 

Notice that it detected the app type as "Java EE Application".

Then go on your application url.

That's all. Have fun!

Using New Relic
---------------

Before you deploy your application, modify newrelic.yml inside catalog.war/newrelic_agent.zip/newrelic/ and insert your New Relic license key.
