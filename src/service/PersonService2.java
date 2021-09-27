package service;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService2 {


    public List<Person> filter (List<Person> list, Person person){
        List<Person> resultList = new ArrayList<>();
        for (Person e : list){
            if(isSearchConditionalQualified(e,person)){
                resultList.add(e);
            }
        }
        return resultList;
    }

    public boolean isSearchConditionalQualified(Person e, Person person){
        if(person.getId() == null&&person.getName()==null && person.getGroup()==null){
            return true;
            };
        if((!person.getId().isEmpty() && !person.getId().equalsIgnoreCase(e.getId()))
                ||(!person.getName().isEmpty() && !person.getName().equalsIgnoreCase(e.getName()))
                ||(!person.getName().isEmpty() && !person.getName().equalsIgnoreCase(e.getName()))

            ){
            return false;
            }else return true;

    }

    public  void  printList(List<Person>  list){
        for(Person e:  list){
            System.out.println( e.toString());
        }
    }
}
