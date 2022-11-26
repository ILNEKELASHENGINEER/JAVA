import java.util.*;
import java.lang.*;
    class Main{
        public static void main(String []args)
    {
        Queue <Integer> maha = new LinkedList<>();
        int a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        int neke[]= new int[a];
        for(int i=0;i<a;i++){
            neke[i]=in.nextInt();
            maha.add(neke[i]);
        }
        b=in.nextInt();
        System.out.println(maha);
        System.out.println("removed element:"+maha.remove()+"\n"+maha);
        System.out.println("head of the queue:"+maha.peek()+"\n"+"Size of the queue:"+maha.size());
        if(maha.contains(b)==true){
            System.out.println("The element is present.");
        }
        else{
            System.out.println("The element is not present.");
        }
    }
    }
/*
INPUT
5
1
2
3
4
5
4
output
[1,2,3,4,5]
removed element:1
[2,3,4,5]
head of the queue:2
Size of the queue:4
The element is present.

INPUT
5
120
240
360
480
864
218
output
[120,240,360,480,864]
removed element:120
[240,360,480,864]
head of the queue:240
Size of the queue:4
The element is not present.
*/
