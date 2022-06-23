package co.moonlink.dependency_injection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;


    public MyComponent(){
        System.out.println("MyComponent constructor has been called...");
        myComponentName = "Jack Frost";
    }

    public String getMyComponentName( ){
        System.out.println("MyComponent.getMyComponentName() has been called...");
        return myComponentName;
    }
}
