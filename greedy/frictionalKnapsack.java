package greedy;

import java.util.*;

class Item{
    int value;
    int weight;

    public Item(int x,int y){
        this.value=x;
        this.weight=y;
    }
}

class itemComp implements Comparator<Item>{
    public int compare(Item a,Item b){
        double r1= (double)(a.value)/(double)(a.weight);
        double r2=(double)(b.value)/(double)(b.weight);

        if(r1<r2){
            return 1;
        }
        else if(r1 > r2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class frictionalKnapsack {
    
}
