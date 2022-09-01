package testapp.data;


public class Test {

    private int id;
    private String test;
    private boolean thing;

    public Test() {
    }

    public Test(String test, boolean thing) {
        this.test = test;
        this.thing = thing;
    }

    public Test(int id, String test, boolean thing) {
        this.id = id;
        this.test = test;
        this.thing = thing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public boolean isThing() {
        return thing;
    }

    public void setThing(boolean thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", test='" + test + '\'' +
                ", thing=" + thing +
                '}';
    }
}
