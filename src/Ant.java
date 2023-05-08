public class Ant extends Insect {
    public Ant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " Наслаждается пищей");
    }
}
