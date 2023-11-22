package org.example.creational.sigleton_design_pattern;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
        instance.showMessage();

    }
}
