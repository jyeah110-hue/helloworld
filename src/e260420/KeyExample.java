package e260420;

import java.util.HashMap;
import java.util.Objects;

import e260420.dll.Key;

public class KeyExample {
    public static void main(String[] args) {
        //Key객체를 식별키로 사용해서 string값을 저장하는 객체
        HashMap<Key, String> hashmap = new HashMap<Key, String>();

        Key k1 = new Key(1, "홍길동");
        Key k2 = new Key(2, "임꺽정");

        hashmap.put(k1, k1.name);
        hashmap.put(k2, k2.name);

        System.out.println(hashmap.get(k1));
        System.out.println(hashmap.get(k2));

        System.out.println(k1.hashCode());
        System.out.println(Objects.hashCode(k2));
    }
}
