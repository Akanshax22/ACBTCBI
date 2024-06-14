package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    public static List<Question> getQuestions(String language, String difficulty) {
        List<Question> questions = new ArrayList<>();

        if (language.equals("C") && difficulty.equals("Easy")) {
            questions.add(new Question("What is the size of int in C?",
                    new String[]{"16 bits", "32 bits", "64 bits", "128 bits"}, 1, 30));
            questions.add(new Question("Which is used to terminate a C statement?",
                    new String[]{";", ":", ".", ","}, 0, 30));
            questions.add(new Question("Which of the following is a valid keyword in C?",
                    new String[]{"int", "number", "integer", "float"}, 0, 30));
            questions.add(new Question("Which function is used to print something in C?",
                    new String[]{"printf()", "print()", "printline()", "println()"}, 0, 30));
            questions.add(new Question("Which of the following is used to read formatted input in C?",
                    new String[]{"scanf()", "input()", "get()", "gets()"}, 0, 30));
            questions.add(new Question("What is the default value of an uninitialized int variable in C?",
                    new String[]{"0", "1", "garbage value", "null"}, 2, 30));
            questions.add(new Question("Which operator is used to assign a value to a variable?",
                    new String[]{"=", "==", "===", "<-"}, 0, 30));
            questions.add(new Question("Which of the following is not a valid variable type in C?",
                    new String[]{"int", "float", "boolean", "char"}, 2, 30));
            questions.add(new Question("What is the correct syntax to declare a pointer in C?",
                    new String[]{"int *ptr;", "int ptr;", "*int ptr;", "int ptr*;"}, 0, 30));
            questions.add(new Question("Which keyword is used to create a constant in C?",
                    new String[]{"const", "constant", "final", "define"}, 0, 30));
            questions.add(new Question("Which of the following is not a loop construct in C?",
                    new String[]{"for", "while", "do-while", "repeat"}, 3, 30));
            questions.add(new Question("What is the correct syntax to include a standard library in C?",
                    new String[]{"#include <library.h>", "include <library>", "#include \"library.h\"", "import library"}, 0, 30));
            questions.add(new Question("Which of these is the correct format specifier for printing a character?",
                    new String[]{"%d", "%c", "%f", "%s"}, 1, 30));
            questions.add(new Question("Which operator is used to access the value at an address?",
                    new String[]{"*", "&", "->", "."}, 0, 30));
            questions.add(new Question("What does the 'void' keyword signify in C?",
                    new String[]{"A null value", "No value", "Undefined value", "Zero value"}, 1, 30));
        } else if (language.equals("C") && difficulty.equals("Medium")) {
            questions.add(new Question("Which of the following is a correct format specifier for printing hexadecimal numbers?",
                    new String[]{"%d", "%o", "%x", "%f"}, 2, 30));
            questions.add(new Question("What is the output of the expression 5 + 2 * 3?",
                    new String[]{"21", "11", "10", "15"}, 1, 30));
            questions.add(new Question("Which of the following function declarations is correct in C?",
                    new String[]{"int func(int x, int y);", "int func(x, y);", "func(int x, int y);", "int func(x int, y int);"}, 0, 30));
            questions.add(new Question("Which of the following is used to allocate a block of memory in C?",
                    new String[]{"malloc()", "memalloc()", "alloc()", "calloc()"}, 3, 30));
            questions.add(new Question("What will be the output of the following code: printf(\"%d\", sizeof(float));?",
                    new String[]{"2", "4", "8", "16"}, 1, 30));
            questions.add(new Question("Which of the following statements is true about arrays in C?",
                    new String[]{"Arrays can have elements of different data types.", "Array elements are stored in contiguous memory locations.", "Array size cannot be changed after declaration.", "Both b and c."}, 3, 30));
            questions.add(new Question("Which of the following keywords is used to prevent any changes to a variable within a C program?",
                    new String[]{"constant", "immutable", "final", "const"}, 3, 30));
            questions.add(new Question("What does the following declaration mean: int (*ptr)[10];?",
                    new String[]{"ptr is a pointer to an array of 10 integers", "ptr is an array of 10 pointers to integers", "ptr is a pointer to a function which returns an integer", "ptr is an array of integers"}, 0, 30));
            questions.add(new Question("Which of the following is the correct way to define a symbolic constant in C?",
                    new String[]{"#define PI = 3.14", "define PI 3.14", "#define PI 3.14", "const float PI = 3.14"}, 2, 30));
            questions.add(new Question("Which of the following statements is correct about the void pointer in C?",
                    new String[]{"A void pointer can point to any data type.", "A void pointer can only point to void functions.", "Void pointers are not allowed in C.", "Void pointer is equivalent to null pointer."}, 0, 30));
            questions.add(new Question("Which of the following function is used to find the first occurrence of a character in a string in C?",
                    new String[]{"strchr()", "strrchr()", "strstr()", "strnset()"}, 0, 30));
            questions.add(new Question("Which operator is used to get the value at an address stored in a pointer variable in C?",
                    new String[]{"*", "&", "&&", "->"}, 0, 30));
            questions.add(new Question("Which of the following is the correct format to read a string with spaces using scanf()?",
                    new String[]{"scanf(\"%s\", str);", "scanf(\"%[^\n]s\", str);", "scanf(\"%[]s\", str);", "scanf(\"%*s\", str);"}, 1, 30));
            questions.add(new Question("Which of the following is used to free the memory allocated by malloc()?",
                    new String[]{"free()", "dealloc()", "release()", "delete()"}, 0, 30));
            questions.add(new Question("Which of the following is not a storage class specifier in C?",
                    new String[]{"auto", "register", "static", "volatile"}, 3, 30));
        } else if (language.equals("C") && difficulty.equals("Hard")) {
            questions.add(new Question("What will be the output of the following code: int a = 5; printf(\"%d\", a++ + ++a);?",
                    new String[]{"10", "11", "12", "undefined"}, 3, 30));
            questions.add(new Question("Which of the following is true about static variables in C?",
                    new String[]{"They are initialized only once.", "They are automatically initialized to zero.", "They persist even after the block in which they are declared terminates.", "All of the above."}, 3, 30));
            questions.add(new Question("Which of the following is used to signal an error condition in C?",
                    new String[]{"exit()", "abort()", "raise()", "All of the above."}, 3, 30));
            questions.add(new Question("What is the output of the following code: int a = 0; for(int i = 0; i < 5; i++) { a += i; } printf(\"%d\", a);?",
                    new String[]{"10", "15", "20", "25"}, 0, 30));
            questions.add(new Question("Which of the following statements is true for a volatile variable?",
                    new String[]{"The value can be changed by the code.", "The value can be changed by the hardware.", "Both a and b.", "None of the above."}, 2, 30));
            questions.add(new Question("What will be the output of the following code: printf(\"%d\", sizeof(NULL));?",
                    new String[]{"1", "2", "4", "8"}, 2, 30));
            questions.add(new Question("Which of the following is not a valid format specifier in C?",
                    new String[]{"%d", "%u", "%y", "%f"}, 2, 30));
            questions.add(new Question("What is the output of the following code: int a = 10, b = 20; printf(\"%d\", a++ + ++b);?",
                    new String[]{"30", "31", "32", "33"}, 1, 30));
            questions.add(new Question("What is the purpose of the #pragma directive in C?",
                    new String[]{"To provide additional information to the compiler.", "To define macros.", "To include header files.", "To optimize the code."}, 0, 30));
            questions.add(new Question("What will be the output of the following code: int a = 1; switch(a) { case 1: printf(\"One\"); case 2: printf(\"Two\"); }?",
                    new String[]{"One", "Two", "OneTwo", "None of the above."}, 2, 30));
            questions.add(new Question("Which of the following is true about the const keyword in C?",
                    new String[]{"It can be used to define a constant value.", "It can be used to prevent a variable from being modified.", "It can be used with pointers to prevent the pointer from being modified.", "All of the above."}, 3, 30));
            questions.add(new Question("What will be the output of the following code: int a = 5, b = 10; printf(\"%d\", (a>b) ? a : b);?",
                    new String[]{"5", "10", "15", "None of the above."}, 1, 30));
            questions.add(new Question("Which of the following functions can be used to move the file pointer to a specific location in a file?",
                    new String[]{"fseek()", "ftell()", "fgetpos()", "freopen()"}, 0, 30));
            questions.add(new Question("Which of the following operators can be overloaded in C?",
                    new String[]{"+", "-", "++", "None of the above."}, 3, 30));
            questions.add(new Question("Which of the following is true about the inline keyword in C?",
                    new String[]{"It suggests to the compiler to insert the complete body of the function in every place that the function is called.", "It must be used with static functions.", "It cannot be used with recursive functions.", "All of the above."}, 0, 30));
        } else if (language.equals("C++") && difficulty.equals("Easy")) {
            questions.add(new Question("Which of the following is the correct comment in C++?",
                    new String[]{"// Comment", "/* Comment */", "Both a and b", "None of the above"}, 2, 30));
            questions.add(new Question("Which of the following is the boolean operator for logical-and?",
                    new String[]{"&", "&&", "||", "and"}, 1, 30));
            questions.add(new Question("Which of the following is not a valid C++ keyword?",
                    new String[]{"private", "protected", "public", "guard"}, 3, 30));
            questions.add(new Question("Which of the following correctly declares an array in C++?",
                    new String[]{"array{10};", "int array;", "int array[10];", "array[10];"}, 2, 30));
            questions.add(new Question("Which of the following is used to end a C++ statement?",
                    new String[]{";", ":", ".", "#"}, 0, 30));
            questions.add(new Question("Which of the following is the address operator?",
                    new String[]{"@", "#", "&", "%"}, 2, 30));
            questions.add(new Question("Which of the following is not a valid scope operator in C++?",
                    new String[]{"::", ":", ".", "->"}, 1, 30));
            questions.add(new Question("Which of the following is the correct syntax for including a user-defined header file in C++?",
                    new String[]{"#include <file.h>", "#include “file”", "#include ‘file’", "#include “file.h”"}, 1, 30));
            questions.add(new Question("Which data type is used to represent the absence of parameters in C++?",
                    new String[]{"void", "int", "float", "double"}, 0, 30));
            questions.add(new Question("What is the default return type if it is not specified in a function declaration?",
                    new String[]{"int", "void", "float", "double"}, 0, 30));
            questions.add(new Question("Which of the following is used for comments in C++?",
                    new String[]{"// Comment", "/* Comment */", "Both a and b", "None of the above"}, 2, 30));
            questions.add(new Question("What is the output of the following code: cout << \"Hello World!\";",
                    new String[]{"Hello World!", "Hello World", "Error", "None of the above"}, 0, 30));
            questions.add(new Question("Which of the following is not a basic data type in C++?",
                    new String[]{"int", "float", "boolean", "char"}, 2, 30));
            questions.add(new Question("Which operator is used to access members of a class in C++?",
                    new String[]{".", "->", "::", "#"}, 0, 30));
            questions.add(new Question("Which of the following correctly declares a constant in C++?",
                    new String[]{"int const x = 10;", "const int x = 10;", "Both a and b", "None of the above"}, 2, 30));
        } else if (language.equals("C++") && difficulty.equals("Medium")) {
            questions.add(new Question("Which of the following is the correct syntax to create a reference variable in C++?",
                    new String[]{"int &a = b;", "int a = &b;", "int &a = &b;", "int a = b;"}, 0, 30));
            questions.add(new Question("Which of the following is the correct way to overload the operator ‘+’ in C++?",
                    new String[]{"operator +();", "void operator+();", "int operator+();", "None of the above"}, 3, 30));
            questions.add(new Question("Which of the following type casts in C++ is used for conversion between incompatible types?",
                    new String[]{"static_cast", "dynamic_cast", "const_cast", "reinterpret_cast"}, 3, 30));
            questions.add(new Question("Which of the following cannot be used with the keyword 'virtual'?",
                    new String[]{"Constructor", "Destructor", "Member function", "Class"}, 0, 30));
            questions.add(new Question("Which of the following is the correct syntax to inherit a class in C++?",
                    new String[]{"class A : public B {}", "class A inherits B {}", "class A extends B {}", "class A inherits from B {}"}, 0, 30));
            questions.add(new Question("Which of the following is used to exit a loop in C++?",
                    new String[]{"exit()", "break", "continue", "return"}, 1, 30));
            questions.add(new Question("What will be the output of the following code: int a = 5; a += 5; cout << a;",
                    new String[]{"5", "10", "15", "20"}, 1, 30));
            questions.add(new Question("Which of the following is true about friend functions in C++?",
                    new String[]{"They can access private members of a class.", "They cannot access private members of a class.", "They are members of the class.", "They are defined inside the class."}, 0, 30));
            questions.add(new Question("Which of the following is correct about a member function of a class?",
                    new String[]{"It cannot access private members of the class.", "It can access private members of the class.", "It can access protected members of the class.", "Both b and c."}, 3, 30));
            questions.add(new Question("Which of the following is the correct way to declare a pure virtual function in C++?",
                    new String[]{"virtual void display() = 0;", "virtual void display() = 1;", "virtual void display() = pure;", "virtual void display();"}, 0, 30));
            questions.add(new Question("Which of the following is used to define an inline function in C++?",
                    new String[]{"inline", "static", "extern", "None of the above"}, 0, 30));
            questions.add(new Question("Which of the following is correct about multiple inheritance in C++?",
                    new String[]{"A derived class with multiple base classes.", "A base class with multiple derived classes.", "A class with multiple functions.", "A class with multiple objects."}, 0, 30));
            questions.add(new Question("What is the size of a double in C++?",
                    new String[]{"2 bytes", "4 bytes", "8 bytes", "10 bytes"}, 2, 30));
            questions.add(new Question("Which of the following correctly declares a pointer in C++?",
                    new String[]{"int *ptr;", "int ptr;", "ptr int;", "None of the above"}, 0, 30));
            questions.add(new Question("What is the output of the following code: int a = 5, b = 10; cout << (a > b ? a : b);",
                    new String[]{"5", "10", "15", "None of the above"}, 1, 30));
        } else if (language.equals("C++") && difficulty.equals("Hard")) {
            questions.add(new Question("What is the output of the following code: int x = 5; cout << ++x * ++x;",
                    new String[]{"25", "36", "30", "42"}, 1, 30));
            questions.add(new Question("Which of the following is not a valid C++11 feature?",
                    new String[]{"Lambda Expressions", "Auto Type Declarations", "Nullptr", "Gosub Statement"}, 3, 30));
            questions.add(new Question("Which of the following C++ feature supports the concept of polymorphism?",
                    new String[]{"Function Overloading", "Operator Overloading", "Templates", "All of the above"}, 3, 30));
            questions.add(new Question("Which of the following correctly declares a pure virtual function?",
                    new String[]{"virtual void function() {}", "virtual void function() = 0;", "void virtual function() = 0;", "virtual void = 0;"}, 1, 30));
            questions.add(new Question("Which of the following is correct about the way C++11 handles defaulted and deleted functions?",
                    new String[]{"default allows a function to be explicitly specified as default", "delete allows a function to be removed from the class", "Both a and b", "None of the above"}, 2, 30));
            questions.add(new Question("Which of the following concepts means determining at runtime what method to invoke?",
                    new String[]{"Data hiding", "Dynamic Typing", "Dynamic binding", "Dynamic loading"}, 2, 30));
            questions.add(new Question("What is the size of a pointer to a char in a 32-bit system?",
                    new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, 2, 30));
            questions.add(new Question("What does the term RTTI stand for?",
                    new String[]{"Runtime Type Identification", "Right Time Type Identification", "Right Time Type Interface", "Runtime Type Interface"}, 0, 30));
            questions.add(new Question("What will be the output of the following code: int a = 10; cout << a << ++a;",
                    new String[]{"1011", "1110", "1010", "Compiler error"}, 1, 30));
            questions.add(new Question("Which of the following type of inheritance is not supported by C++?",
                    new String[]{"Single inheritance", "Multiple inheritance", "Multilevel inheritance", "Hybrid inheritance"}, 3, 30));
            questions.add(new Question("Which of the following operator can be used to free the allocated memory?",
                    new String[]{"free", "delete", "both a and b", "None of the above"}, 1, 30));
            questions.add(new Question("Which of the following is not a standard exception built in C++?",
                    new String[]{"std::bad_alloc", "std::bad_cast", "std::bad_typeid", "std::bad_string"}, 3, 30));
            questions.add(new Question("Which of the following is a complete object-oriented language?",
                    new String[]{"C", "C++", "Java", "None of the above"}, 2, 30));
            questions.add(new Question("What does STL stand for?",
                    new String[]{"Standard Type Library", "System Template Library", "Standard Template Library", "System Type Library"}, 2, 30));
            questions.add(new Question("Which of the following keywords are used to control access to a class member?",
                    new String[]{"default", "protected", "internal", "None of the above"}, 1, 30));
        } else if (language.equals("Java") && difficulty.equals("Easy")) {
            questions.add(new Question("What is the size of int in Java?",
                    new String[]{"16 bits", "32 bits", "64 bits", "128 bits"}, 1, 30));
            questions.add(new Question("What is the default value of boolean in Java?",
                    new String[]{"true", "false", "null", "0"}, 1, 30));
            questions.add(new Question("Which keyword is used to define a class in Java?",
                    new String[]{"class", "interface", "define", "package"}, 0, 30));
            questions.add(new Question("What is the default value of a String variable?",
                    new String[]{"\"\"", "null", "undefined", "\"null\""}, 1, 30));
            questions.add(new Question("Which of the following is a valid keyword in Java?",
                    new String[]{"interface", "string", "Float", "unsigned"}, 0, 30));
            questions.add(new Question("Which operator is used to compare two values?",
                    new String[]{"=", "==", "===", "!=", "<>"}, 1, 30));
            questions.add(new Question("Which method is the entry point of a Java application?",
                    new String[]{"start()", "main()", "init()", "run()"}, 1, 30));
            questions.add(new Question("Which of the following is not a Java feature?",
                    new String[]{"Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible"}, 1, 30));
            questions.add(new Question("What is the extension of compiled Java classes?",
                    new String[]{".js", ".txt", ".class", ".java"}, 2, 30));
            questions.add(new Question("Which of the following is not a valid data type in Java?",
                    new String[]{"int", "float", "boolean", "real"}, 3, 30));
            questions.add(new Question("Which of these is not a bitwise operator?",
                    new String[]{"&", "|", "&&", "^"}, 2, 30));
            questions.add(new Question("What is the range of short data type in Java?",
                    new String[]{"-128 to 127", "-32768 to 32767", "-2147483648 to 2147483647", "None of the mentioned"}, 1, 30));
            questions.add(new Question("Which of these is not a loop construct in Java?",
                    new String[]{"for", "while", "do-while", "repeat"}, 3, 30));
            questions.add(new Question("Which of these are selection statements in Java?",
                    new String[]{"break", "continue", "for()", "if()"}, 3, 30));
            questions.add(new Question("Which package contains the Random class?",
                    new String[]{"java.util package", "java.lang package", "java.awt package", "java.io package"}, 0, 30));
        } else if (language.equals("Java") && difficulty.equals("Medium")) {
            questions.add(new Question("Which of the following is used to find and fix bugs in the Java programs?",
                    new String[]{"JVM", "JRE", "JDK", "JDB"}, 3, 30));
            questions.add(new Question("What is the return type of the hashCode() method in the Object class?",
                    new String[]{"int", "Object", "long", "void"}, 0, 30));
            questions.add(new Question("Which of the following is a marker interface?",
                    new String[]{"Runnable", "Remote", "Readable", "Result"}, 1, 30));
            questions.add(new Question("Which package contains the Random class?",
                    new String[]{"java.util package", "java.lang package", "java.awt package", "java.io package"}, 0, 30));
            questions.add(new Question("An interface with no fields or methods is known as a ______.",
                    new String[]{"Runnable Interface", "Marker Interface", "Abstract Interface", "CharSequence Interface"}, 1, 30));
            questions.add(new Question("In which memory a String is stored, when we create a string using new operator?",
                    new String[]{"Stack", "String memory", "Heap memory", "Random storage space"}, 2, 30));
            questions.add(new Question("Which of the following is a reserved keyword in Java?",
                    new String[]{"object", "strictfp", "main", "system"}, 1, 30));
            questions.add(new Question("What is the default value of the local variables?",
                    new String[]{"null", "0", "Depends on the data type", "No default value for local variables"}, 3, 30));
            questions.add(new Question("Which of the following is a superclass of every class in Java?",
                    new String[]{"ArrayList", "Abstract class", "Object class", "String"}, 2, 30));
            questions.add(new Question("Which of these keywords is used to define interfaces in Java?",
                    new String[]{"interface", "Interface", "intf", "Intf"}, 0, 30));
            questions.add(new Question("Which of these cannot be used for a variable name in Java?",
                    new String[]{"identifier & keyword", "identifier", "keyword", "none of the mentioned"}, 2, 30));
            questions.add(new Question("Which environment variable is used to set the java path?",
                    new String[]{"MAVEN_Path", "JavaPATH", "JAVA", "JAVA_HOME"}, 3, 30));
            questions.add(new Question("Which of the following is not an OOPS concept in Java?",
                    new String[]{"Polymorphism", "Inheritance", "Compilation", "Encapsulation"}, 2, 30));
            questions.add(new Question("Which of the following is a valid long literal?",
                    new String[]{"ABH8097", "L990023", "904423", "0xnf029L"}, 3, 30));
            questions.add(new Question("What does the expression float a = 35 / 0 return?",
                    new String[]{"Infinity", "0", "Not a Number", "Run time exception"}, 0, 30));
        } else if (language.equals("Java") && difficulty.equals("Hard")) {
            questions.add(new Question("Which method is used to perform cleanup operations before an object is garbage collected?",
                    new String[]{"finalize()", "clean()", "gc()", "delete()"}, 0, 30));
            questions.add(new Question("Which keyword is used to prevent a method from being overridden?",
                    new String[]{"static", "final", "abstract", "synchronized"}, 1, 30));
            questions.add(new Question("Which of the following is a thread-safe collection class?",
                    new String[]{"ArrayList", "LinkedList", "Vector", "HashSet"}, 3, 30));
            questions.add(new Question("Which of the following is not a feature of the Spring framework?",
                    new String[]{"Inversion of Control", "Aspect-Oriented Programming", "Dependency Injection", "Object Relational Mapping"}, 3, 30));
            questions.add(new Question("Which of the following is not a valid Java annotation?",
                    new String[]{"@Override", "@Entity", "@Table", "@Object"}, 3, 30));
            questions.add(new Question("What will be the output of the following code: int a = 5, b = 10; System.out.println(a > b ? a : b);",
                    new String[]{"5", "10", "15", "None of the above"}, 1, 30));
            questions.add(new Question("Which of the following is true about the Serializable interface?",
                    new String[]{"It does not have any method.", "It has one method.", "It has two methods.", "It has three methods."}, 0, 30));
            questions.add(new Question("Which of the following statements is true about Java arrays?",
                    new String[]{"Arrays are immutable.", "Arrays are of fixed size.", "Arrays are dynamic.", "Array elements are stored in non-contiguous memory locations."}, 1, 30));
            questions.add(new Question("What is the use of the hashCode() method in Java?",
                    new String[]{"To compare two objects", "To store objects in a HashMap", "To sort objects", "None of the above"}, 1, 30));
            questions.add(new Question("Which of the following is not a valid state of a thread in Java?",
                    new String[]{"New", "Runnable", "Blocked", "Running"}, 3, 30));
            questions.add(new Question("Which method must be implemented by all threads?",
                    new String[]{"start()", "stop()", "run()", "main()"}, 2, 30));
            questions.add(new Question("Which of the following is not a valid way to create an object in Java?",
                    new String[]{"new keyword", "Class.forName()", "Object.clone()", "Object.newInstance()"}, 3, 30));
            questions.add(new Question("Which of the following is a valid constructor for the MyClass class?",
                    new String[]{"MyClass()", "void MyClass()", "int MyClass()", "float MyClass()"}, 0, 30));
            questions.add(new Question("Which of the following is not a valid use of the 'this' keyword?",
                    new String[]{"To refer to the current object instance", "To call another constructor in the same class", "To refer to the current class", "To pass the current object as a parameter"}, 2, 30));
            questions.add(new Question("Which of the following is not a feature of Java?",
                    new String[]{"Object-oriented", "Platform independent", "Secured", "Pointers"}, 3, 30));
        } else if (language.equals("Python") && difficulty.equals("Easy")) {
            questions.add(new Question("What is the output of print(2 ** 3)?",
                    new String[]{"5", "6", "8", "9"}, 2, 30));
            questions.add(new Question("Which of the following is used to define a block of code in Python?",
                    new String[]{"Brackets", "Indentation", "Key", "None of the above"}, 1, 30));
            questions.add(new Question("Which of the following is not a core data type in Python?",
                    new String[]{"List", "Dictionary", "Tuples", "Class"}, 3, 30));
            questions.add(new Question("What is the output of print(type([]))?",
                    new String[]{"<class 'list'>", "<class 'tuple'>", "<class 'dictionary'>", "<class 'array'>"}, 0, 30));
            questions.add(new Question("Which of the following statements is used to create an empty set in Python?",
                    new String[]{"{}", "[]", "set()", "set([])"}, 2, 30));
            questions.add(new Question("What is the maximum possible length of an identifier in Python?",
                    new String[]{"16", "32", "64", "None of the above"}, 3, 30));
            questions.add(new Question("What is the output of print(0.1 + 0.2 == 0.3)?",
                    new String[]{"True", "False", "Machine dependent", "Error"}, 1, 30));
            questions.add(new Question("Which of the following function is used to get the ASCII value of a character?",
                    new String[]{"chr(x)", "ord(x)", "hex(x)", "ascii(x)"}, 1, 30));
            questions.add(new Question("Which of the following is the correct extension of the Python file?",
                    new String[]{".python", ".pl", ".py", ".p"}, 2, 30));
            questions.add(new Question("Which keyword is used for function in Python language?",
                    new String[]{"Function", "Def", "Fun", "Define"}, 1, 30));
            questions.add(new Question("What is the output of print(str[0]) if str = 'Hello World!'?",
                    new String[]{"H", "h", "Hello", "World"}, 0, 30));
            questions.add(new Question("Which of the following is used to terminate a loop in Python?",
                    new String[]{"exit", "return", "break", "stop"}, 2, 30));
            questions.add(new Question("Which of the following is not a keyword in Python?",
                    new String[]{"pass", "eval", "assert", "nonlocal"}, 1, 30));
            questions.add(new Question("What is the output of the following code: print(type(5 / 2))?",
                    new String[]{"<class 'int'>", "<class 'float'>", "<class 'complex'>", "<class 'long'>"}, 1, 30));
            questions.add(new Question("Which of the following is not a valid variable name in Python?",
                    new String[]{"_var", "var_1", "2var", "var"}, 2, 30));
        } else if (language.equals("Python") && difficulty.equals("Medium")) {
            questions.add(new Question("Which of the following is the correct extension of the Python file?",
                    new String[]{".python", ".pl", ".py", ".p"}, 2, 30));
            questions.add(new Question("What is the output of the following code: print(2 ** 3 ** 2)?",
                    new String[]{"64", "512", "256", "128"}, 1, 30));
            questions.add(new Question("Which of the following functions is a built-in function in Python?",
                    new String[]{"factorial()", "print()", "seed()", "sqrt()"}, 1, 30));
            questions.add(new Question("What will be the output of the following code: print('abc. DEF'.capitalize())?",
                    new String[]{"Abc. def", "abc. DEF", "ABC. DEF", "Abc. Def"}, 0, 30));
            questions.add(new Question("Which of the following is the correct way to write a function in Python?",
                    new String[]{"def func[]:", "def func():", "function func():", "func():"}, 1, 30));
            questions.add(new Question("Which of the following statements is true about Python?",
                    new String[]{"Python is a high-level programming language.", "Python is an interpreted language.", "Python is a scripting language.", "All of the above."}, 3, 30));
            questions.add(new Question("What is the output of the following code: print(bool('False'))?",
                    new String[]{"True", "False", "none", "Invalid"}, 0, 30));
            questions.add(new Question("Which of the following data types does not allow duplicate values?",
                    new String[]{"list", "set", "tuple", "dictionary"}, 1, 30));
            questions.add(new Question("What is the output of the following code: print(len(['hello', 2, 4, 6]))?",
                    new String[]{"6", "4", "5", "TypeError"}, 1, 30));
            questions.add(new Question("What is the output of the following code: print('abcd'.upper())?",
                    new String[]{"ABCD", "abcd", "Abcd", "None of the above"}, 0, 30));
            questions.add(new Question("What is the output of the following code: print(9 // 2)?",
                    new String[]{"4", "4.5", "5", "4.0"}, 0, 30));
            questions.add(new Question("Which of the following methods can be used to add an element to a list?",
                    new String[]{"add()", "append()", "insert()", "extend()"}, 1, 30));
            questions.add(new Question("What is the output of the following code: print(0.1 + 0.2 == 0.3)?",
                    new String[]{"True", "False", "Error", "None of the above"}, 1, 30));
            questions.add(new Question("Which of the following is not a valid dictionary operation?",
                    new String[]{"del d[key]", "d.keys()", "d.clear()", "d.add()"}, 3, 30));
            questions.add(new Question("Which of the following is used to create an object in Python?",
                    new String[]{"Classname()", "class Classname()", "Classname[]", "class Classname[]"}, 0, 30));
        } else if (language.equals("Python") && difficulty.equals("Hard")) {
            questions.add(new Question("Which of the following will create a dictionary in Python?",
                    new String[]{"{1, 2, 3}", "{'name': 'John', 'age': 30}", "[1, 2, 3]", "None of the above"}, 1, 30));
            questions.add(new Question("What will be the output of the following code: print([i for i in range(3)])?",
                    new String[]{"[0, 1, 2]", "[1, 2, 3]", "[0, 1, 2, 3]", "[1, 2, 3, 4]"}, 0, 30));
            questions.add(new Question("Which of the following statements are true for the Python code: x = 5; y = 10; x, y = y, x?",
                    new String[]{"The values of x and y are swapped.", "The values of x and y are unchanged.", "The code will cause a syntax error.", "None of the above"}, 0, 30));
            questions.add(new Question("What will be the output of the following code: print('Hello'[::-1])?",
                    new String[]{"olleH", "Hello", "Error", "None of the above"}, 0, 30));
            questions.add(new Question("What is the output of the following code: print(list(map(lambda x: x * 2, [1, 2, 3, 4])))?",
                    new String[]{"[2, 4, 6, 8]", "[1, 2, 3, 4]", "[2, 3, 4, 5]", "[1, 4, 9, 16]"}, 0, 30));
            questions.add(new Question("Which of the following is true about the 'with' statement in Python?",
                    new String[]{"It is used to simplify exception handling.", "It is used to handle file operations.", "It is used to simplify memory management.", "Both a and b."}, 3, 30));
            questions.add(new Question("Which of the following decorators is used to define a static method in Python?",
                    new String[]{"@staticmethod", "@classmethod", "@property", "@staticmethodmethod"}, 0, 30));
            questions.add(new Question("What will be the output of the following code: print(type(lambda x: x + 1))?",
                    new String[]{"<class 'function'>", "<class 'lambda'>", "<class 'method'>", "<class 'object'>"}, 0, 30));
            questions.add(new Question("What is the output of the following code: print([i**2 for i in range(4)])?",
                    new String[]{"[0, 1, 4, 9]", "[1, 4, 9, 16]", "[1, 2, 3, 4]", "[0, 1, 2, 3]"}, 0, 30));
            questions.add(new Question("Which of the following is not a built-in data type in Python?",
                    new String[]{"set", "frozenset", "list", "queue"}, 3, 30));
            questions.add(new Question("What will be the output of the following code: print('Hello %s' % 'World')?",
                    new String[]{"Hello World", "Hello %s", "Hello", "Error"}, 0, 30));
            questions.add(new Question("Which of the following is the correct syntax for defining a generator in Python?",
                    new String[]{"def func(): yield x", "def func(): return x", "def func(): yield return x", "def func() -> x"}, 0, 30));
            questions.add(new Question("What is the output of the following code: print(bool('False'))?",
                    new String[]{"True", "False", "Error", "None of the above"}, 0, 30));
            questions.add(new Question("Which of the following is used to handle exceptions in Python?",
                    new String[]{"try", "except", "finally", "All of the above"}, 3, 30));
            questions.add(new Question("Which of the following is not a keyword in Python?",
                    new String[]{"pass", "eval", "assert", "nonlocal"}, 1, 30));
        }

        return questions;
    }
}
