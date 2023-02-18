package day11.aggregation;

class Location{
    String cityName;
    String streetName;
    int houseNo;

    public Location(String cityName, String streetName, int houseNo) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNo = houseNo;
    }
}

class User {
    int id;
    String name;
    Location location; // Location location = new Location();

    public User(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    void show() {
        System.out.println("Id is =>" + " " + id);
        System.out.println("Name is =>" + " " + name);
        System.out.println("City Name is =>" + " " + location.cityName);
        System.out.println("Street Name is =>" + " " + location.streetName);
        System.out.println("House No is =>" + " " + location.houseNo);
    }
}


public class Account {
    public static void main(String[] args) {
        Location location = new Location("Yangon", "Than Thu Mar Street", 302);

        User user = new User(17, "Yan Linn Aung", location);
        user.show();
    }
}