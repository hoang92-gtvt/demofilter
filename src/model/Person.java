package model;


public class Person {
    private String id;
    private String name;
    private int Age;
    private String group;
    private double mathPoint;
    private boolean status;

    public Person() {
    }

    public Person(String  id, String name, int age, String group, double mathPoint, boolean status) {
        this.id = id;
        this.name = name;
        Age = age;
        this.group = group;
        this.mathPoint = mathPoint;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Person(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", group='" + group + '\'' +
                ", mathPoint=" + mathPoint +
                ", status=" + status +
                '}';
    }
}


