import java.util.Scanner;

public class PuppyTest {
    // 主方法
    public static void main(String[] args) {
        // 创建对象class name 
        Puppy myPuppy = new Puppy("Tommy", 3);

        Puppy newPuppy = new Puppy();//AAA 5

        Puppy newNew = newPuppy;

        newNew.setAge(10);

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入小狗的名字：");
        String newName = scan.nextLine();

        System.out.println("请输入小狗的年龄：");
        int newAge = scan.nextInt();

        myPuppy.setName(newName);

        myPuppy.setAge(newAge);

        System.out.println(myPuppy.getName() + " 小狗的年龄为 : " + myPuppy.getAge());
        System.out.println(newPuppy.getName() + " 小狗的年龄为 : " + newPuppy.getAge());
    }
}