package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return numberList.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return numberList.stream()
                .filter(number -> number >= 20)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        return titles.stream()
                .map(Book::new)
                .collect(Collectors.toList());
    }

    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return titles.stream()
                .filter(graTitle -> graTitle.startsWith("Gra"))
                .map(Book::new)
                .collect(Collectors.toList());
    }


}