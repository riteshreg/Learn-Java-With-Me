package com.blogspot.learnjavawithme.ProgramActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.learnjavawithme.R;

public class LoopInJavaActivities extends AppCompatActivity {

    TextView textViewForText,textViewForProgram;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_in_java_activities);
        textViewForText = findViewById(R.id.showText);
        textViewForProgram = findViewById(R.id.textViewForProgram);

        textViewForText.setText(
                "Do while loop:\n" +
                "                          In most computer programming languages, a do while loop is a control flow statement that executes a block of code at least once, and then either repeatedly executes the block, or stops executing it, depending on a given boolean condition at the end of the block.\n" +
                "\n" +
                "For loop:    \n" +
                "                 In computer science, a for-loop is a control flow statement for specifying iteration, which allows code to be executed repeatedly.\n" +
                "\n" +
                "For loop:\n" +
                "                In computer science, a for-loop is a control flow statement for specifying iteration, which allows code to be executed repeatedly.\n" +
                "\n" +
                "\n" +
                "The program you see bellow is the mixture of all loop;");
        textViewForProgram.setText("package com.ritesh;\n" +
                "\n" +
                "import java.util.Scanner;\n" +
                "\n" +
                "public class loop {\n" +
                "    public static void main(String[] args) {            //main function\n" +
                "      while_loop();\n" +
                "       do_while_loop();\n" +
                "        for_loop();\n" +
                "\n" +
                "    }\n" +
                "    public  static  void while_loop()                        //      while loop\n" +
                "    {\n" +
                "        System.out.println(\"Enter How many time you want to print I am Student;\");\n" +
                "        Scanner sc=new Scanner( System.in);\n" +
                "        short name=sc.nextShort();\n" +
                "        String name2=\"I am a Student;\";\n" +
                "        int a = 1;\n" +
                "        while(a<=name)\n" +
                "        {\n" +
                "            System.out.println(a+\". \"+name2);\n" +
                "            a++;\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public  static  void do_while_loop()                        // do while loop\n" +
                "    {\n" +
                "        System.out.println(\"Enter how many time you want to print I am a boy\");\n" +
                "        Scanner sc=new Scanner(System.in);\n" +
                "        int size=sc.nextInt();\n" +
                "        int m=1;\n" +
                "        do{\n" +
                "            System.out.println(\"I am a boy\");\n" +
                "            m++;\n" +
                "        }\n" +
                "        while(m<=size);\n" +
                "    }\n" +
                "    public  static  void for_loop()                          //for loop\n" +
                "    {\n" +
                "        System.out.println(\"Enter how many time you want to print I am a good student\");\n" +
                "        Scanner sc=new Scanner(System.in);\n" +
                "        byte tot= sc.nextByte();\n" +
                "        String name=\"I am a good student\";\n" +
                "        for(int i=1;i<=tot;i=i+1)\n" +
                "        {\n" +
                "            System.out.println(name);\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }
}