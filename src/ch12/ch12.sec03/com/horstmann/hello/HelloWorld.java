package com.horstmann.hello;

/*
 
javac ch12.sec03/module-info.java ch12.sec03/com/horstmann/hello/HelloWorld.java
java -p ch12.sec03 -m ch12.sec03/com.horstmann.hello.HelloWorld

Or more concisely:

javac --module-source-path . -d . -m ch12.sec03
java -p . -m ch12.sec03/com.horstmann.hello.HelloWorld

*/

public class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello, Modular World!");
    }
}
