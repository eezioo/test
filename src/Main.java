/**
 * Created by cybx_live on 3/2/17.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
        Person p1=new Person();
        p1.setName("Saman");
        System.out.println(main.savePerson(p1));
    }
    public Person savePerson(Person p1){
        if (p1==null){
            throw new  IllegalArgumentException();

        }
        else{
            p1.setId("p100");
            return p1;
        }
    }

}
