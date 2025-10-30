public class PuppyTest {
    // 主方法
    public static void main(String[] args) {
       Puppy a = new Puppy("a",4);
       Puppy b = new Puppy();
       a.setName("bb");
       System.out.println(a.getName());
       System.out.println(b.doubleage());
    }
}