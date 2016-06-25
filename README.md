
# Conmodo Test
## My implementation description 
I used Hashmap for data model. I used it because I need a unique key (shorted URL) to be able to back to the original URL.
In order to create a short URL I wrote a method which is called "createShortUrl" and get a string(long Url) as input.
Then it generates a random string with the length of five. Five charachter is able to subpport more than 1 milion users because generateRandomString creat a string based on "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890" which means 
36 ^4 = 1679616 users.
Inorder to back to original URL I wrote a method which is called "generateoriginal". This method takes uniqe URL and based on unique key in hash map return the original URL.
I used maven and restfull ApI technology in my code. 


## How to compile and run
Inorder to run this code you need to oppen command prompt and stand in the path of the project and then write this command

mvn clean install && java -jar target/rest-0.0.1-SNAPSHOT.jar
 
## How to Use

 curl -X POST 'http://localhost:8080/Url/Shortning' -d 'YOUR URL' -H 'Content-Type: text/plain'
 
 curl -X POST 'http://localhost:8080/Url/Original' -d 'A SHOETED WEBSITE ADREES' -H 'Content-Type: text/plain'

