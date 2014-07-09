spring-boot-encoding-error
==========================

To run the example:

1. Run gradlew      
2. Open up http://localhost:8080/index.html
3. The text message have wrong encoding only for certain spring-boot versions. The text SHOULD show:  

Some text with some swedish öäå!  
Some text with some swedish ÖÅÄ!  

(See the text in messages.properties)

To reproduce the error, do 1-3 above with different spring-boot versions. You can change the bootVersion parameter in the build.gradle file)

1. When running with any of these versions the encoding gets wrong somehow. öäå and ÖÄÅ shows up "wrong" in the browser 
    * bootVersion = "1.1.3.RELEASE"
    * bootVersion = "1.1.4.RELEASE"
    * bootVersion = "1.1.5.BUILD-SNAPSHOT"

2. When running with this version the encoding is right
    * bootVersion = "1.0.2.RELEASE"
