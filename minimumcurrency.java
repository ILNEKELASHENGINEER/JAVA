import java.util.*;
import java.lang.*;

    class money{
    void countcurrency(int amount){
        int[] notes = new int[]{500,100,50,20,10,5,2,1};
        int[]notecounter = new int[8];
        
        for(int i=0;i<8;i++){
            if(amount >= notes[i]){
                notecounter[i]= amount/notes[i];
                amount = amount%notes[i];
            }
        }
        for(int i=0;i<8;i++){
            //if(notecounter[i]!=0){
                System.out.println(notes[i]+" = "+notecounter[i]);
            //}
        }
    }}
    class main{
    public static void main(String args[]){
        int amount;
        Scanner in =new Scanner(System.in);
        money p = new money();
        amount=in.nextInt();
        p.countcurrency(amount);
    }}