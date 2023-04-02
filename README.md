# loads-api
This is a Spring Boot project that allows you to manage load details using RESTful APIs. The project uses MySQL as the database to store the data.
# Get Started
Clone this repository

Set up a MySQL database and configure its properties in application.properties file located in src/main/resources.

Build and run the project.

You can then test the APIs using Postman or any other REST client.
# API endpoints
POST "/load" - Add load details.<br>
GET "/load" - Retrieve loads details by shipperId.<br>
GET "/load/{loadId}" - Retrieve load details by loadId.<br>
PUT "/load/{loadId}" - Update load details for the specified loadId.<br>
DELETE "/load/{loadId}" - Delete load details for the specified loadId.<br>
