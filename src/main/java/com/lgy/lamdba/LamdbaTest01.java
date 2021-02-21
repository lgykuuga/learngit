package com.lgy.lamdba;

import com.google.common.collect.Lists;
import com.lgy.lamdba.domain.Person;
import com.lgy.lamdba.domain.Worker;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
public class LamdbaTest01 {

    public static void main(String[] args) {

        List<Person> people = Lists.newArrayList();

        people.add(new Person("AA",12, 1, new BigDecimal(5000)));
        people.add(new Person("BB",15, 2, new BigDecimal(10000)));
        people.add(new Person("CC",20, 5, null));

        List<Person> collect = people.stream()
                .filter(person -> person.getAge() > 10)
                .sorted(Comparator.comparing(Person::getWork).reversed())
                .collect(Collectors.toList());

        log.info(collect);

        List<Worker> workers = people.stream().map(person -> {
            Worker worker = new Worker();
            worker.setName(person.getName());
            worker.setAge(person.getAge());
            worker.setWork(person.getWork());
            worker.setTitle("123");
            return worker;
        }).collect(Collectors.toList());

        log.info(workers);

        BigDecimal temp = BigDecimal.ZERO;

        BigDecimal reduce = people.stream()
                .filter(person -> person.getAge() > 19)
                .map(p -> p.getSalary().multiply(new BigDecimal(p.getWork())))
                .reduce(temp, BigDecimal::add);

        System.out.println(reduce);


    }

}
