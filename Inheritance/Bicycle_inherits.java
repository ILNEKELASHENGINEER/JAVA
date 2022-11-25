import java.util.*;
class Bicycle{
    void display(int gr,int bc,int hei){
        System.out.println("No of gears are"+gr+"\n speed of bicycle is "+bc);
        System.out.println("seat height is "+hei);
    }
}
class MountainBike extends Bicycle{
      int gr,bc,hei;
     void bike(int gr,int bc,int hei){
      this.gr=gr;
      this.bc=bc;
      this.hei=hei;
      System.out.println("No of gears are "+gr+"\nspeed of bicycle is "+bc+"\nseat height is "+hei);
      }
      public String toString(){
          return "No of gears are "+gr+"speed of bicycle is "+bc+"seat height is"+hei;
      }
      //display(gr,bc,hei);
}
class main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        MountainBike m = new MountainBike();
       // System.out.println(m);
       m.bike(a,b,c);
    }
}
/*
INPUT
50
125
45
OUTPUT
No of gears are 50
speed of bicycle is 125
seat height is 45
*/
