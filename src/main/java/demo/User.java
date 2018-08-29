package demo;

class User {
    String name;
    String email;
    String address;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{name='" + name + '\'' + ", email='" + email + '\'' + ", address='" + address + '\'' + '}';
    }
}