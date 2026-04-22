package e260420.dll;

import java.util.Objects;

public class Key {
    public int sno;
    public String name;

    public Key(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Key) {
            Key comparKey = (Key) obj;
            if (this.sno == comparKey.sno &&
                this.name.equals(comparKey.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        //이 의미는 sno + name 값이 같으면 -> hashCode도 같게 만든다
        //규칙: equals가 true면 hashCode는 반드시 같아야한다.
        return Objects.hash(sno, name);
    }
}
