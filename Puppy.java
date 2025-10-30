public class Puppy {
    //variable
    private int age;
    private String name;
 
    // 构造器constrctor with parameter
    public Puppy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //none-argument constructor
    public Puppy() {
        name = "AAA";
        age = 5;
    }
 
    public void setAge(int age) {
        this.age += age;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public String getName() {
        return name;
    }
    public int doubleage() {

        return age+=2;
    }

}