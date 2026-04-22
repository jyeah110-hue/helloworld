package e260421;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCode {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("red");
        list.add("blue");
        list.add("purple");
        list.add("yellow");
        list.add("green");

        //인덱스가 있기때문에 for가능
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------");

        //반환형으로 <T>입력
        //Iterator는 싱글톤이라네..
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
