package entities;

import javax.inject.Singleton;

@Singleton
public class Foo {
    public String foo() {
        return " entities.Foo >> ";
    }
}