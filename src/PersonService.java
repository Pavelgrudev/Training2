public class PersonService {

    public void changeAge(Person per) {
        per.setAge(18);
        per.child=new Person("Vova", 42);

    }


}
