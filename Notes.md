## Top level class Acess Modifire 
|Modifier | Scope/visibility|
|---------|-----------------|
|public   | Accessible across the project (pacakge)|
|default(none)|(private-package) Accessible only within the package|

```java
public class ParentClass {
    public class PublicNestedClass {
        // Accessible from anywhere
    }

    protected class ProtectedNestedClass {
        // Accessible within the package or subclasses
    }

    class DefaultNestedClass {
        // Accessible within the package
    }

    private class PrivateNestedClass {
        // Accessible only within ParentClass
    }
}
```

```Java Package: It is a directory that contains a lots of files ```