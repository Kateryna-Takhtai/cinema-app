# CINEMA APP 🎥
With this lovely cinema app the user will indulge into the cinema world, where all CRUD operations are at his service:
* register or login as a user;
* create and find movies;
* create and find available movie sessions;
* create a shopping cart;
* add tickets to the shopping cart;
* complete an order;

## Project structure
Unified Modelling Language Diagrams (UML):
![](/Users/katerynatakhtai/Downloads/Cinema_scheme.png)

## The list of the endpoints
* POST: /movie-sessions (admin) - create a new movie session;
* POST: /orders/complete (user) - create a new order for current user;
* GET: /cinema-halls (user/admin) - get a list of all cinema halls;
* GET: /movies (user/admin) - get a list of all movies;
* GET: /movie-sessions/available (user/admin) - get available movie sessions for specific movie and date;
* GET: /orders (user) - get a list of orders for current user;
* GET: /shopping-carts/by-user (user) - get shopping cart of current user;
* GET: /users/by-email (admin) - get user by email;
* PUT: /movie-sessions/{id} (admin/root) - update movie session;
* PUT: /shopping-carts/movie-sessions (user) - creates a ticket and adds it to the shopping cart of current user;
* DELETE: /movie-sessions/{id} (admin/root) - delete movie session.

## Technologies
* JDK(version 17)
* Tomcat(version 10.1.11)
* Maven
* Spring Boot
* Spring Web MVC
* Spring Security
* Hibernate
* MySQL

## Set-up
* clone the repository; 
* open project in IDE;
* create your own database "cinema";
* replace YOUR_DRIVER, YOUR_URL, YOUR_USERNAME, YOUR_PASSWORD in db.properties on your own;
* configure Tomcat;
* run maven package command in terminal;
* click run button;
