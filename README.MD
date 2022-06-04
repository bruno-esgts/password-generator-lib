# Password Generator Lib

Library for easy password generation


## Quick Start

- Add the maven repository to your `pom.xml`
```xml
<repository>
    <id>mvn-brunojesus</id>
    <name>Bruno Jesus MVN Repo</name>
    <url>https://mvn.brunojesus.pt/releases</url>
</repository>
```

- Add the dependency to your `pom.xml`
```xml
<dependency>
  <groupId>pt.brunojesus.esgts</groupId>
  <artifactId>password-generator-lib</artifactId>
  <version>1.0</version>
</dependency>
```

- Use the `PasswordGeneratorFacade`
```java
import pt.brunojesus.esgts.pgenlib.model.PasswordStrength;

public class Main {

    public static void main(String[] args) {
        final PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();

        String password = passwordGeneratorFacade.generatePassword(PasswordStrength.STRONG);

        System.out.println("Your new password is: " + password);
    }
}
```