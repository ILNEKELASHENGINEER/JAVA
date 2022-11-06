class Main{
  public static void main(String []args){
    int a,b,c;
    a=10;
    b=0;
    try{
      c=a/b;
      System.out.println("This is insane if it happens");
    }
    catch(ArithmeticException e){  //you can give just Exception which will drive all the class frome the package and search according to the Exception
      b=b+1;
      c=a/b;
      System.out.println("Now we have different output");
      System.out.println(c);}
    System.out.println("This also works");
    for(int i=0;i<3;i++){
      System.out.println((i+1)+" Nekelash");
    }
  }} 

/*
OUTPUT
Now we have different output
10
This also work
1 Nekelash
2 Nekelash
3 Nekelash
*/
