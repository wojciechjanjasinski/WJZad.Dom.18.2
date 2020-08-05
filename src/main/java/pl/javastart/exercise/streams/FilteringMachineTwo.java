package pl.javastart.exercise.streams;

import org.graalvm.compiler.core.common.PermanentBailoutException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> people) {
        return people.stream()
                .filter(kid -> kid.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        return people.stream()
                .map((Person t) -> User.getName(t))
                .map(User::getAge)
                .map(User::getNickname)
                .collect(Collectors.toList());
    }
}