class Vehicle{  
void Maruti(){System.out.println("centralized system engine");}  
}  
class Carextends Vehicle{  
void model(){System.out.println("luxurious car with self driving feature");}  
}  
class Harleyextends model{  
void Bike (){System.out.println("Sports bike with good millage");}  
}  
class Test{  
public static void main(String args[]){  
Child1 d=new Child1();  
d.Maruti();  
d.Model();  
d.Bike();  
}}