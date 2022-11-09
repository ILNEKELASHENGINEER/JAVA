import java.util.*;
class Main{
    public static void main(String args[])
    {
        double a,b,c,d;
        Scanner ss=new Scanner(System.in);
        a=ss.nextDouble();
        c=ss.nextDouble();
        b=ss.nextDouble();
        d=ss.nextDouble();
       double rupee;
        rupee=a+b;
        double paisa;
        paisa=c+d;
        if(paisa>0)
        {
            paisa=paisa*0.01;
            rupee=rupee+(paisa);
        }
        System.out.println(rupee);
        
    }
}

/*
input :
50 85
42 65  
output :
93.50
*/
