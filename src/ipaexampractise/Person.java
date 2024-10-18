package ipaexampractise;

public class Person {

    private int Id;

    private String name;

    private int salary;

    Person(int Id , String name , int salary)
    {
        this.Id=Id;
        this.name=name;
        this.salary=salary;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
