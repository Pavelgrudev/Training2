public class Insect implements BodyService,HeadService {
    private  String name;

    public Insect(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(this.name + " Машет крыльями");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " бегает");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " потребляет");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(this.name + " сверчит");
    }
    public void jump() {
        System.out.println(this.name + " Прыгает");
    }


}
