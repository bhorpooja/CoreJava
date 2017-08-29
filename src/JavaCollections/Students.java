package JavaCollections;

/**
 * Created by pooja on 29/8/17.
 */
public class Students {
    int roll_no;

    @Override
    public String toString() {
        return "Students{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    String name;
    String city;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
