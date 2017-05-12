/**
 * Created by pavan on 5/7/2017.
 */
public class Test {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Test(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;




    }
}
