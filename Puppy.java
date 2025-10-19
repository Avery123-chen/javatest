public class Puppy {
    //variable
    private int age;
    private String name;
 
    // 构造器constrctor
    public Puppy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Puppy() {
        this.name = "AAA";
        this.age = 5;
    }
 
    //设置 age 的值
    public void setAge(int age) {
        this.age = age;
    }
 
    //获取 age 的值
    public int getAge() {
        return age;
    }
 
    //获取 name 的值
    public String getName() {
        return name;
    }
}