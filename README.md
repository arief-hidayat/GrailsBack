This is my playground to play around with the following technology:

* Grails
* Backbone + Backbone Marionette (Javascript)
* MongoDB

Basically I just copy paste and modify some code from Addy Osmani and Derick Bailey's repo.
Later I'll put the link to their repo.

# How to run this application

* I use IntelliJ IDEA 11. I think this should be easily imported into other IDE also.
* Setup your mongoDB ( I refer to this http://docs.mongodb.org/master/tutorial/install-mongodb-on-debian-or-ubuntu-linux/)
* Create database and user. Don't forget to update the <code>DataSource.groovy</code>
* If you don't like mongoDB, you can switch to other DB like mySQL. It's very easy in Grails.
* <code>grails run-app</code> as usual.

# What's next to add

* Change domain model to more complex domain. I will create a form where each field itself is an object.
* Add feature to have real time comment on each field, using Vert.x
* ...

#Current status

I leave master branch as is, containing simple <code>TO DO</code> apps. I'll comeback to complete the functionality later on.

I have created new branch (vert.x) to add vert.x into grails. Just to ensure the Vert.x setup is working before I move on to next step:

* integrating Backbone with SockJS
* let it talk with Vert.x.

Note that I upgrade to JDK 7 to make it work with Vert.x.
