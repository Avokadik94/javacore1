package ru.geekbrains.lesson5.oop;


public class WorkerEmployee {
        String name;
        String position;
        String email;
        String telephone;
        int salary;
        int age;
    public static void main (String[] args){
        WorkerEmployee[] Person = new WorkerEmployee[5];
                 Person[0] = new WorkerEmployee("Ivanov Ivan", "Engineer", "ivan@mail.com", "89004006565", 40000, 56);
                 Person[1] = new WorkerEmployee("Petrov Maxim", "Manager", "petrov@mail.com", "89503506535", 35000, 65);
                 Person[2] = new WorkerEmployee("Sergeeva Svetlana", "Cashier", "sergeeva@mail.com", "89104508965", 29000, 39);
                 Person[3] = new WorkerEmployee("Andreev Roman", "Salesman", "andreev@mail.com", "89003009634", 41000, 41);
                 Person[4] = new WorkerEmployee("Nikolaev Nikolay", "Administrator", "nikolaev@mail.com", "890015689752", 50000, 38);
    for (WorkerEmployee WorkerEmployee : Person)
        if (WorkerEmployee.getAge() > 40) WorkerEmployee.printinfo();
}
    public WorkerEmployee(String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void printinfo(){
        System.out.printf("WorkerEmployee %s, position: %s, email: %s, telephone: %s, salary: %d, age: %d\n", this.name, this.position, this.email, this.telephone, this.salary, this.age);
    }
    public int getAge() {
        return this.age;
    }
}



