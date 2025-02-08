public class Employee {
    private String nameLastname;
    private String number ;
    private int age;
    private String department;


    public String getNameLastname(){
        return nameLastname;
    }

    public int getAge() {
        return age;
    }

    public void setNameLastname(String nameLastname) {
        this.nameLastname = nameLastname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
