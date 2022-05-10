package com.acme.basic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }

  String getName(String a){
    // if(a.equal("hello")) {
    //   return "name";
    // } else {
      return null;
    // }
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");

    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");

    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");

    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");

    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");

    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");

    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
    System.out.println("This method is not covered by unit tests");
  }

  boolean isNameEmpty() {
    return getName("world").length() == 0; // Noncompliant; the result of getName() could be null, but isn't null-checked
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String name = req.getParameter("name");
    PrintWriter out = resp.getWriter();
    out.write("Hello " + name); // Noncompliant
  }

}
