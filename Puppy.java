public class Puppy {
    //variable
    private int age;
    private String name;
    private static String origin = "puppy";
 
    // 构造器constrctor with parameter
    public Puppy(String name, int age1) {
        this.name = name;
        age = age1;
    }
    //none-argument constructor
    public Puppy() {
        name = "AAA";
        age = 5;
    }
 
    //设置 age 的值
    public void setAge(int age2) {
        age += age2;
    }

    public String setName(String name3) {
        name = name3;
        return name;
    }
 
    //获取 age 的值accessor
    public int getAge() {
        return age;
    }
 
    //获取 name 的值
    public String getName() {
        return name;
    }

    public static void status() {
        System.out.println("die");
    }

    public String test() {
        return origin;
    }
}