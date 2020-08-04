package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> people) {
        return people.stream()
                .filter(kid -> kid.getAge() < 18)
                .map(kid -> new Person(kid.getName(), kid.getAge()))
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

//    public List<User> convertPeopleToUsers(List<Person> people) {
//        return people.stream()
//                .map(user -> new User(user.getName(), user.getAge(), user.getNickname()))
//                .map(String::valueOf)
//                .collect(Collectors.toList());
//    }
}