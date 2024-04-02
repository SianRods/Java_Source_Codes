/*
String --> Collection of Chracters
It is very Important to note that string is not a Primitive Datatypes 
case in case for a primitive data types we use starting letter to be Small
in case of string we use --> Syntax 
    String name ;
It is a Class which consists of Different types of Methods to provide easy working Environment 
So as it belong to Class we first need to create an object so called string variable and then assign it a space on the stack memory 

Ex) 1-->
    String name = new String("string_name");
Ex) 2-->

    String name = "Sian";
Ex) 3 using String Concatenation

    String name ="Sian ";
    System.out.println("Rodrigues "+name);
    --> output-->   RodriguesSian
Remark --> All the method for a Given Can be accessed by using the format 
        --> object_name.method_name();
        --> It is very important to know the difference between a Method and a Function for a Given Class 
        Mostly the '()' --> is used when it is a function and Parameters can be passed through it 

Taking String as an input in java using Scanner Class 
Suppose sc is the object then ,

String name ;
name = sc.next();
Take Single Word Strings as an Input 

For Multi-Word Strings use the Rule 
name =sc.nextLine();

Namng Conventions in Java -->
Illustrations: 

Class: If you are naming any class then it should be a noun and so should be named as per the goal to be achieved in the program such as Add2Numbers, ReverseString, and so on not likely A1, Programming, etc. It should be specific pointing what exactly is there inside without glancing at the body of the class.
Interface: If you are naming an interface, it should look like an adjective such as consider the existing ones: Runnable, Serializable, etc. Try to use ‘able’ at the end, yes it is said to try as there are no hard and fast bound rules as if we do consider an inbuilt interface such as ‘Remote’, it is not having ble at the end. Consider if you are supposed to create an interface to make read operation then it is suggested as per naming conventions in java to name a similar likely ‘Readable’ interface.
Methods: Now if we do look closer a method is supposed to do something that it does contains in its body henceforth it should be a verb.
Constants: As the name suggests it should look like as we read it looks like it is fixed for examples PI, MAX_INT, MIN_INT, etc as follows.



        */



