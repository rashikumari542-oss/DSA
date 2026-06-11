import java.util.*;
public class update{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list .add(4);
        list.add(3);
        list.add(1);
        for(int i:list){
            System.out.println(i);
        }

        System.out.println();
        list.set(2,6);
        for(int i:list){
            System.out.println(i);
        }

    }
}
