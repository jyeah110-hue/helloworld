package e260421;

import java.util.Arrays;

import e260421.dll.Course;

class HighStudent extends Student {
    public HighStudent(String name) {
        super(name);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }
}

class Worker extends Person {
    public Worker(String name) {
        super(name);
    }
}

public class WildCardExample {
    //모든 클래스
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    //하위클래스 제한
    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    //상위클래스 제한
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        //최상위 클래스니까 모두 가능
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        //<?> 이기때문에 모든 클래스 가능
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        //student 하위클래스 가능
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        //worker 상위클래스 가능
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
        System.out.println();
    }
}
