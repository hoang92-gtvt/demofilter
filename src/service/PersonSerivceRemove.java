package service;

import model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonSerivceRemove {



    public List<Person> filter (List<Person> list, Person person){
        Iterator<Person> resultList = list.iterator();

        while(resultList.hasNext()){
            if(isSearchConditionalQualified(resultList.next(), person)){
                resultList.remove();
            }
        }
        return list;
    }

    public boolean isSearchConditionalQualified(Person e, Person person){
        if(person.getId() == null&&person.getName()==null && person.getGroup()==null){
            return false;
        };
        if(!person.getId().isEmpty() && !person.getId().equalsIgnoreCase(e.getId()))return true;
        if(!person.getName().isEmpty() && !person.getName().equalsIgnoreCase(e.getName())) return true;
        if(!person.getName().isEmpty() && !person.getName().equalsIgnoreCase(e.getName())) return true;
        return false;

    }

    public  void  printList(List<Person> list){
        for(Person e:  list){
            System.out.println( e.toString());
        }
    }
}
