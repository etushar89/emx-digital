# EMX Digital Test  

Implements web service to handle requests from EMX Digital test client.  

#### Dev environment:
Make sure following are installed:
``` 
OpenJDK-8
Apache Maven
Apache Tomcat 10
```  

#### Code Formatting:  
This project uses `net.revelc.code.formatter` maven plugin to validate code formatting during build.  
Eclipse Java Google style is used, https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml.    

If the code has not been formatted, build will fail.  
##### If you use IntelliJ Idea IDE, there would be formatting differences from Eclipse style. Make sure you format code before making a commit.       

To format the code, run:  
```
mvn formatter:format
```

#### Build:  
This project uses maven, to build a war-file, simply package the project with maven:    
```
mvn clean package
```

#### Deploy:  
Build will produce a jar-file, `target/emx-digital.war`, that needs to be copied to the Apache Tomcat's `webapp` directory.
    
```
cp target/emx-digital.war $CATALINA_HOME/webapps/
```

You can access app @ http://127.0.0.1:8080/emx-digital/.  
API endpoint will be: http://127.0.0.1:8080/emx-digital/serve/.  
