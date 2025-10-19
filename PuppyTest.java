public class PuppyTest {
    // 主方法
    public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("Tommy", 3);

        Puppy newPuppy = new Puppy();

        Puppy newNew = newPuppy;

        newNew.setAge(10);


        System.out.println(myPuppy.getName() + " 小狗的年龄为 : " + myPuppy.getAge());
        System.out.println(newPuppy.getName() + " 小狗的年龄为 : " + newPuppy.getAge());
    }
}