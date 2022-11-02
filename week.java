import java.util.*;
import java.util.*;
class main{
    public static void main(String []args){
       Scanner in = new Scanner(System.in);
       int b;
       b=in.nextInt();
       //if(a>7){System.out.println("Invalid");}
       hello v = new hello(b);
        
    }
}
class hello{
    int b;
    hello(int b){
        //if(a>)
        switch(b){
        case 0:
            System.out.println("Weekend");
            break;
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Invalid");
        }
    }
}
