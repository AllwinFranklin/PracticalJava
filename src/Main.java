import concurrency.Concurrency;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
//        GenericHolder<User> genericHolder = new GenericHolder<User>();
//        genericHolder.printer(new User("Allwin Anto Franklin", "allwinanto360@gmail.com"));

//        GenericHolder<Integer> intGenericHolder = new GenericHolder<>();
//        intGenericHolder.printer(1);
//
//        GenericHolder<Float> floatGenericHolder = new GenericHolder<>();
//        floatGenericHolder.printer(1.324F);
//
//        User employee1 = new User("Allwin", "allwin@gmail.com");
//        User employee2 = new User("Franklin", "franklin@gmail.com");
//        if (employee1.compareTo(employee2) < 0)
//            System.out.println(employee1);
//        else
//            System.out.println(employee2);

        Concurrency.run();
    }
}

class GenericHolder<T extends Number> {
    void printer(T Obj) {
        System.out.println(Obj);
    }
}

class User implements Comparable<User> {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User other) {
        return name.compareTo(other.name);
    }
}