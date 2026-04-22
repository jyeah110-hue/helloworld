package e260421;

class Generic<T> {
    private T obj;
    
    public Generic(T obj) {
        this.obj = obj;
    }
    
    public T getObj() {
        return this.obj;
    }

    public void showType() {
        System.out.println("Type of T: " + this.obj.getClass().getName());
    }
}

//클래스가 여러개 있을때는 public클래스 명으로 파일을 만든다.
public class GenericCode {
    public static void main(String[] args) {
        Generic<Integer> data1 = new Generic<Integer>(100);
        System.out.println(data1.getObj());
        data1.showType();

        Generic<String> data2 = new Generic<String>("JAVA");
        System.out.println(data2.getObj());
        data2.showType();
    }
}

