#This application explains multiple DI configurations.


####constructor-based
####setter-based
####property-based

1. pom.xml contains the dependency for spring.
2. MyApplication class contains the code to load the spring context, get the bean required and display the content of the bean.
3. Address class contains the address.
4. Employee class contains the employee id and address. Employee class has 2 constructors, one with parameter, and another is the default constructor. Parameterized constructor is loaded when using constructor-based injection. Default constructor is loaded when using setter-based injection. Setter method for address is used when setting Address by setter-based injection.
4. application-beans.xml contains the bean configurations. One for constructor-based, and another for seetter-based injection.