public class Dog extends Puppy {
    private boolean ifDie;

    public Dog() {
        super();
        ifDie = false;
    }

    public Dog(String dogName, int dogAge, boolean Die) {
        super(dogName, dogAge);
        ifDie = Die;
    }

    public boolean testDie(boolean Die) {
        ifDie = Die;
        return ifDie;
    }

    public void setAge(int age) {
        super.setAge(super.getAge() + 10);
    }
}
