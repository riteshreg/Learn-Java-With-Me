package com.blogspot.learnjavawithme.IntroductionActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.learnjavawithme.R;

public class BasicConcepOfOpps extends AppCompatActivity {

    TextView showText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concep_of_opps);
        showText = findViewById(R.id.showText);
        showText.setText("Definition of OOP Concepts in Java\n" +
                "OOP concepts in Java are the main ideas behind Java’s Object Oriented Programming. They are an abstraction, encapsulation, inheritance, and polymorphism. Grasping them is key to understanding how Java works. Basically, Java OOP concepts let us create working methods and variables, then re-use all or part of them without compromising security.\n" +
                "\n" +
                "List of OOP Concepts in Java\n" +
                "There are four main OOP concepts in Java. These are:\n" +
                "\n" +
                "Abstraction. Abstraction means using simple things to represent complexity. We all know how to turn the TV on, but we don’t need to know how it works in order to enjoy it. In Java, abstraction means simple things like objects, classes, and variables represent more complex underlying code and data. This is important because it lets avoid repeating the same work multiple times.\n" +
                "Encapsulation. This is the practice of keeping fields within a class private, then providing access to them via public methods. It’s a protective barrier that keeps the data and code safe within the class itself. This way, we can re-use objects like code components or variables without allowing open access to the data system-wide.\n" +
                "Inheritance. This is a special feature of Object Oriented Programming in Java. It lets programmers create new classes that share some of the attributes of existing classes. This lets us build on previous work without reinventing the wheel.\n" +
                "Polymorphism. This Java OOP concept lets programmers use the same word to mean different things in different contexts. One form of polymorphism in Java is method overloading. That’s when different meanings are implied by the code itself. The other form is method overriding. That’s when the different meanings are implied by the values of the supplied variables. See more on this below.\n" +
                "How OOP Concepts in Java Work\n" +
                "OOP, concepts in Java work by letting programmers create components that can be re-used in different ways, but still maintain security.\n" +
                "\n" +
                "How Abstraction Works\n" +
                "Abstraction as an OOP concept in Java works by letting programmers create useful, reusable tools. For example, a programmer can create several different types of objects. These can be variables, functions, or data structures. Programmers can also create different classes of objects. These are ways to define the objects.\n" +
                "\n" +
                "For instance, a class of variable might be an address. The class might specify that each address object shall have a name, street, city, and zip code. The objects, in this case, might be employee addresses, customer addresses, or supplier addresses.\n" +
                "\n" +
                "How Encapsulation Works\n" +
                "Encapsulation lets us re-use functionality without jeopardizing security. It’s a powerful OOP concept in Java because it helps us save a lot of time. For example, we may create a piece of code that calls specific data from a database. It may be useful to reuse that code with other databases or processes. Encapsulation lets us do that while keeping our original data private. It also lets us alter our original code without breaking it for others who have adopted it in the meantime.\n" +
                "\n" +
                "How Inheritance Works\n" +
                "Inheritance is another labor-saving Java OOP concept. It works by letting a new class adopt the properties of another. We call the inheriting class a subclass or a child class. The original class is often called the parent. We use the keyword extends to define a new class that inherits properties from an old class.\n" +
                "\n" +
                "How Polymorphism Works\n" +
                "Polymorphism in Java works by using a reference to a parent class to affect an object in the child class. We might create a class called “horse” by extending the “animal” class. That class might also implement the “professional racing” class. The “horse” class is “polymorphic,” since it inherits attributes of both the “animal” and “professional racing” class.\n" +
                "\n" +
                "Two more examples of polymorphism in Java are method overriding and method overloading.\n" +
                "\n" +
                "In method overriding, the child class can use the OOP polymorphism concept to override a method of its parent class. That allows a programmer to use one method in different ways depending on whether it’s invoked by an object of the parent class or an object of the child class.\n" +
                "\n" +
                "In method overloading, a single method may perform different functions depending on the context in which it’s called. That is, a single method name might work in different ways depending on what arguments are passed to it.\n\n         " +
                "sfbf");
    }
}