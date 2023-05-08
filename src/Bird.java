public class Bird implements HeadService, BodyService {
    private String name;

    public String getName() {
        return name;
    }

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void fly() {
    System.out.println(this.name + " летит");}
    @Override
    public void walk() {
        System.out.println(this.name + " идёт");
    }
    @Override
    public void eat() {
        System.out.println(this.name + " ест");
    }
    @Override
    public void voice() {
        System.out.println(this.name + " поёт");
    }
}
