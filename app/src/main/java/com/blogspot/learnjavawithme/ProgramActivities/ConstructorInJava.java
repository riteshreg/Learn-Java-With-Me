package com.blogspot.learnjavawithme.ProgramActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.learnjavawithme.R;

public class ConstructorInJava extends AppCompatActivity {

    TextView textViewForText,textViewForProgram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor_in_java);
        textViewForProgram = findViewById(R.id.textViewForProgram);
        textViewForText = findViewById(R.id.showText);

        textViewForText.setText("A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:\n" +
                "\n" +
                "A constructor initializes an object when it is created. It has the same name as its class and is syntactically similar to a method. However, constructors have no explicit return type.\n" +
                "\n" +
                "Typically, you will use a constructor to give initial values to the instance variables defined by the class, or to perform any other start-up procedures required to create a fully formed object.\n" +
                "\n" +
                "All classes have constructors, whether you define one or not, because Java automatically provides a default constructor that initializes all member variables to zero. However, once you define your own constructor, the default constructor is no longer used.\n");


        textViewForProgram.setText("package com.ritesh;\n" +
                " class ts{\n" +
                " private  int n1;\n" +
                "  private  int n2;\n" +
                "\n" +
                "    public  int getN1(){\n" +
                "        return  n1;\n" +
                "    }\n" +
                "    public  void setN1(int set1){\n" +
                "        n1=set1;\n" +
                "    }\n" +
                "\n" +
                "    public  int getN2(){\n" +
                "        return  n2;\n" +
                "    }\n" +
                "    public  void setN2(int set2){\n" +
                "        n2=set2;\n" +
                "    }\n" +
                "\n" +
                "    }\n" +
                "    public class constructor {\n" +
                "    public static void main(String[] args) {\n" +
                "        ts key=new ts();\n" +
                "        key.setN1(3);\n" +
                "        key.setN2(4);\n" +
                "        System.out.println(key.getN1());\n" +
                "        System.out.println(key.getN2());\n" +
                "    }\n" +
                "\n" +
                " }\n\n\n\n");
    }
}