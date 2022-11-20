//RUN TIME POLYMORPHISM
class Shape{  
void draw(){System.out.println("drawing...");}  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
}  
class TestPolymorphism2{  
public static void main(String args[]){  
Shape s;  
s=new Rectangle();  
s.draw();  
s=new Circle();  
s.draw();  
s=new Triangle();  
s.draw();  
}  
}  
/*
OUTPUT
SBI Rate of Interest: 8.4
ICICI Rate of Interest: 7.3
AXIS Rate of Interest: 9.7
*/
