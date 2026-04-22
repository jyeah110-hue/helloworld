package e260421.dll;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        Object[] objs = new Object[capacity];
        this.students = (T[])objs;
    }

    public String getName() {
        return this.name;
    }

    public T[] getStudents() {
        return this.students;
    }

    public void add(T t) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = t;
                break;
            }
        }
    }
}
