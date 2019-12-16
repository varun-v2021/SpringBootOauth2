# SpringBootOauth2

Reference:

https://dzone.com/articles/securing-rest-services-with-oauth2-in-springboot-1

https://github.com/chuchip/OAuthServer/blob/master/pom.xml

POSTMAN usage:

http://localhost:8080/oauth/token

To get access token - POST calls

For user

Basic Auth
Username- client
Password- password

Body
key - password   value - secret
key - username   value - user
key - grant_type value - password

For admin

Basic Auth
Username- client
Password- password

Body
key - password   value - secret
key - username   value - admin
key - grant_type value - password

Use the access token to hit private, admin having value for Authorization key as "bearer <access-token>", double quotes are not required

http://localhost:8080/public
http://localhost:8080/private
http://localhost:8080/admin
