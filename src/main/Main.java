package main;

import model.Person;
import service.PersonSerivceRemove;
import service.PersonService;
import service.PersonService2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Person>  list = new ArrayList<>();


    public static void main(String[] args) {
        list.add(new Person("1A","hs1", 18,"9A" ,9.5 , true  ));
        list.add(new Person("2A","hs2", 18,"10A" ,9.5 , true  ));
        list.add(new Person("3A","hs3", 18,"11A" ,9.5 , true  ));
        list.add(new Person("4A","hs4", 18,"9A" ,9.5 , true  ));
        list.add(new Person("2A","hs5", 17,"8A" ,9.5 , true  ));
        list.add(new Person("6A","hs2", 18,"9A" ,9.5 , true  ));

//        PersonService service = new PersonService();
//        List<Person> resultList = service.filter1(list,new Person());
//        List<Person> resultList = service.filter1(list,new Person("2A","hs2",""));
//        List<Person> resultList = service.filter1(list,new Person("","hs2",""));

//        PersonService2 service = new PersonService2();
//        List<Person> resultList = service.filter(list,new Person());
////      List<Person> resultList = service.filter(list,new Person("2A","hs2",""));
////      List<Person> resultList = service.filter(list,new Person("","hs2",""));
//        service.printList(resultList);

        PersonSerivceRemove service = new PersonSerivceRemove();
//        List<Person> resultList = service.filter(list,new Person());
        List<Person> resultList = service.filter(list,new Person("2A","hs2",""));
//        List<Person> resultList = service.filter(list,new Person("","hs2",""));
        service.printList(resultList);

    }


}
