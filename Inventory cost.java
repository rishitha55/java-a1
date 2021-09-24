import java.util.*;
class Investor{
void Products(){
System.out.println("Products with good quality");
}
}
class Sellerextends Investor{
void Dress(){
System.out.println("less cost with good quality");
}
}
class Buyer extends seller{
void mobile(){
System.out.println("cheapeast with all high features");
}
}
class main{
public static void main(String[] args){
buyer d= new buyer();
d.dress();
d.mobile();
d.products();


 

}
}