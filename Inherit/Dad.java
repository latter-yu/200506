package Inherit;

class Dad1 {
    protected String name;

    public Dad1(String name) {
        this.name = name;
    }

    protected void age(int age) {
        System.out.println(age);
    }

    public static void main1(String[] args) {
        Dad dad = new Dad("父亲");
        Person dad1 = new Dad("父亲");
    }
}
class Dad extends Person {
    public Dad(String name) {
        super(name);
    }

    public void age(int age) {
        System.out.println(this.name + "的年龄是" + age);
        System.out.println(age);
    }

    public static void main1(String[] args) {
        Person person1 = new Person("父亲");
        person1.age(36);
        Person person2 = new Dad("爹");
        person2.age(42);
    }

    public static void main2(String[] args) {
        Dad dad = new Dad("父亲");
        Person dad1 = new Dad("父亲");
    }
}


