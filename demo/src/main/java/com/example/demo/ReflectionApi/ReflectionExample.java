package com.example.demo.ReflectionApi;
import java.lang.reflect.*;

 class Person {
	   private String name;
	   private int age;

	   public Person(String name, int age) {
	      this.name = name;
	      this.age = age;
	   }

	   public void sayHello() {
	      System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	   }

	   private void sayGoodbye() {
	      System.out.println("Goodbye!");
	   }
	}


public class ReflectionExample {
   public static void main(String[] args) throws Exception {
      // get a Class object representing the Person class
      Class<Person> personClass = Person.class;

      // get the name of the class
      String className = personClass.getName();
      System.out.println("Class name: " + className);

      // get the fields of the class
      Field[] fields = personClass.getDeclaredFields();
      for (Field field : fields) {
         System.out.println("Field name: " + field.getName());
         System.out.println("Field type: " + field.getType());
      }

      // create an instance of the class
      Person person = personClass.getConstructor(String.class, int.class).newInstance("Alice", 30);

      // call the sayHello() method using reflection
      Method sayHelloMethod = personClass.getMethod("sayHello");
      sayHelloMethod.invoke(person);

      // call the private sayGoodbye() method using reflection
      Method sayGoodbyeMethod = personClass.getDeclaredMethod("sayGoodbye");
      sayGoodbyeMethod.setAccessible(true);
      sayGoodbyeMethod.invoke(person);
   }
}
