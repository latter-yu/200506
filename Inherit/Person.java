package Inherit;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    protected void age(int age) {
        System.out.println(this.name + "的年龄是" + age);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person person1 = new Dad("儿子");
        Person person = new Son("儿子");
        if(person instanceof Son) {
            Son son = (Son) person;
            son.age(18);
            son.subject("数学");
        }
    }

    public static void main2(String[] args) {
        //向上转型的不足
        Person person = new Son("儿子");
        person.age(18);
        //person.subject("数学");
    }
}

class Test {
    public static void main1(String[] args) {
        Person person = findPerson();
    }
    public static Person findPerson() {
        Dad dad = new Dad("父亲");
        return dad;
    }
}