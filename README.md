This is my playground to play around with the following technology:

* Grails
* Backbone + Backbone Marionette (Javascript)
* MongoDB

Basically I just copy paste and modify some code from Addy Osmani and Derick Bailey's repo.
Later I'll put the link to their repo.

# How to run this project

* I used IntelliJ IDEA 11. I think this should be easily imported to other IDE also.
* Setup your mongoDB ( I refer to this http://docs.mongodb.org/master/tutorial/install-mongodb-on-debian-or-ubuntu-linux/)
* Create database and user. Don't forget to update the <code>DataSource.groovy</code>
* If you don't like mongoDB, you can switch to other DB like mySQL. It's very easy in Grails.

# What's next to add

* Change domain model to more complex domain. I will create a form where each field itself is an object.
* Add feature to have real time comment on each field, using Vert.x
* ...
