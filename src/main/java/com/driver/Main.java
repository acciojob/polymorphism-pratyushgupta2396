package com.driver; 

public class Main {
  // Task 1: Create a class product inside Main class !!!
  static class Product{
    public int product(int x, int y){
      return x*y;
    }
    public int product(int x, int y, int z){
      return x*y*z;
    }
    public double product(double x, double y){
      return x*y;
    }
}

public static void main(String [] args){
  // Task 2: Create an object of Product in Main function !!!
  Product p = new Product();

  // Task 3: Call the method product with two integers parameters !!!
  System.out.println("Product of 4 and 5 (int): " + p.product(4, 5));   

  // Task 4: Call the overloaded method product with twhree integers parameters !!!
  System.out.println("Product of 2, 3 and 4 (int): " + p.product(2, 3, 4));

  // Task 5: Call the overloaded method product with two double parameters !!!
  System.out.println("Product of 3.5 and 2.0 (double): " + p.product(3.5, 2.0));
}
}
