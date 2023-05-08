public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Vorona");
        bird1.fly();
        Bird bird2 = new Bird("Soroka");
        Insect insect1 = new Insect("mosquito");
        insect1.fly();
        insect1.eat();
        HeadService insect2 = new Insect("Cricket");
        insect1.jump();
        String ab = "ffffffffffffffffffffffff";
        print(ab);
        byte a = 8;
        print(a);
        insect1.setName("TAPAKAH");
        insect1.fly();
        insect1.eat();
        Ant ant1 = new Ant("Flik");
        ant1.eat();
        Insect ant2=new Ant("Flok");
        ant2.eat();
        ant1.jump();
        ant1.walk();
    ant2.voice();
      bird2.walk();
    bird2.voice();
    Person ivan = new Person("Ivan",23);
    Person john = new Person("John",13);
    ivan.child=john;
    ivan.child.changeAge(ivan.child);
    System.out.println(ivan.child.getAge());
        System.out.println(john.getName()+john.getAge());
        System.out.println("person.child.getName() = " + ivan.child.getName()+" "+ivan.child.getAge());
    }


    public static void print(String abc) {
        System.out.println(abc);
    }
    public static void print(byte a) {
        System.out.println(a);
    }

}




















