package com.lgy.lamdba;

import com.google.common.collect.Lists;
import com.lgy.lamdba.domain.Box;
import com.lgy.lamdba.domain.Person;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class LamdbaTest02 {

    public static void main(String[] args) {

        List<Person> people = Lists.newArrayList();

        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.setName(null);
            person.setAge(i + 10);
            person.setWork(i);

            Box box = new Box();
            box.setColor("red" + i);
            box.setTitle("red" + i);
            box.setBody("red" + i);
            person.setBox(box);

            people.add(person);
        }

        log.info(people);

        log.info(assemblyFailureMessage(people));
        log.info(test3(people));
        log.info(test4(people));

    }

    private static String assemblyFailureMessage(List<Person> people) {

        return people.stream()
                .filter(p -> p.getAge() > 12)
                .map(p -> String.format("name:%s,box:%s", p.getName(), p.getBox().getBody()))
                .collect(Collectors.joining(";"));
    }

    private static String test3(List<Person> people) {

        return people.stream()
                .map(Person::getName)
                .findFirst()
                .orElse("");
    }

    private static String test4(List<Person> people) {

        return people.stream()
                .map(Person::getName)
                .findFirst()
                .orElse("");
    }

}
