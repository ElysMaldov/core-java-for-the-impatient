package com.horstmann.hello;

/*
Compile the com.horstmann.greet module:

javac com.horstmann.greet/module-info.java \
    com.horstmann.greet/com/horstmann/greet/Greeter.java \
    com.horstmann.greet/com/horstmann/greet/internal/GreeterImpl.java 

Compile and run this program:

javac -p com.horstmann.greet ch12.sec05/module-info.java \
    ch12.sec05/com/horstmann/hello/HelloWorld.java

java -p ch12.sec05:com.horstmann.greet \
    -m ch12.sec05/com.horstmann.hello.HelloWorld

Or more concisely:

javac --module-source-path . -d . -m com.horstmann.greet
javac -p . --module-source-path . -d . -m ch12.sec05
java -p . -m ch12.sec05/com.horstmann.hello.HelloWorld

*/

import com.horstmann.greet.Greeter;

public class HelloWorld {
    public static void main(String[] args) {
       Greeter greeter = Greeter.newInstance();
       System.out.println(greeter.greet("Modular World"));
    }
}
