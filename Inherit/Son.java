package Inherit;

class Son1 {
    protected String name;

    public Son1(String name) {
        this.name = name;
    }

    public static void age(int age) {
        System.out.println(age);
    }

    public void subject(String subject) {
        System.out.println(subject);
    }
}

class Son extends Person {
    public Son(String name) {
        super(name);
    }

    protected void age(int age) {
        System.out.println(this.name + "的年龄是" + age);
        System.out.println(age);
    }

    public void subject(String subject) {
        System.out.println(subject);
    }
}