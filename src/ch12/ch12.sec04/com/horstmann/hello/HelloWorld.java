package com.horstmann.hello;

/*

javac ch12.sec04/module-info.java ch12.sec04/com/horstmann/hello/HelloWorld.java
java -p ch12.sec04 -m ch12.sec04/com.horstmann.hello.HelloWorld

Or more concisely:

javac --module-source-path . -d . -m ch12.sec04
java -p . -m ch12.sec04/com.horstmann.hello.HelloWorld

*/


import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, Modular World!");
    }
}
