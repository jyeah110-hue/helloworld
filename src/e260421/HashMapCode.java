package e260421;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCode {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("david", "qwer123");
        map.put("cindy", "9abcd9");
        map.put("alice", "abc000");
        map.put("paul", "abc000");
        map.put("mary", "good!@?");

        // Map은 Set(key), Set(value) 2개의 Set으로 이루어진 엔트리집합
        // 따라서 key, value를 따로 Set으로 생성할 수 있다.
        // key는 중복X(Set이라서 중복 안되는게 아니라 key로 사용되기 때문), value는 중복O
        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        System.out.println(keys);
        System.out.println("----------------------------");
        //C# Dictionary.KeyValuePair 역할 -> 모든 엔트리 반환
        for (Map.Entry<String,String> e : map.entrySet()) {
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " : " + value);
        }

        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println("key: " + key + " : " + "value: " + value);
        }

        System.out.println("----------------------------");
        String val = "";
        if (keys.contains("alice")) {
            val = map.get("alice");
        }
        System.out.println("Value for eky alice is: " + val);
    }
}
