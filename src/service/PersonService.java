package service;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> filter1 (List<Person> list, Person person){
        List<Person> resultList = new ArrayList<>();
        for (Person e : list){
            if(checkId(e, person)){
                if(checkName(e, person)){
                    if(checkGroup(e, person)){
                        resultList.add(e);
                    }
                }else continue;
            }else continue;
        }
    return resultList;
    }


    public List<Person> filter2 (List<Person> list, Person person){
        List<Person> resultList = new ArrayList<>();
        for (Person e : list){
            if(isSearchConditionalQualified(e,person)){
                resultList.add(e);
            }
        }
        return resultList;
    }

    private boolean checkName(Person e, Person person) {
        if(e.getName().equalsIgnoreCase(person.getName())|| person.getName()==null ||person.getName().isEmpty() ){
            return true;
        }
        return false;
    }

    private boolean checkId(Person e, Person person) {
        if(e.getId().equalsIgnoreCase(person.getId()) || person.getId()==null ||person.getId().isEmpty()  ){
            return true;
        }
        return false;
    }

    private boolean checkGroup(Person e, Person person) {
        if(e.getGroup().equalsIgnoreCase(person.getGroup())|| person.getGroup()==null ||person.getGroup().isEmpty() ){
            return true;
        }
        return false;
    }

// cach 2

    public boolean isSearchConditionalQualified(Person e, Person person){
        if(person == null){
            return false;
        }
        if((!person.getId().isEmpty() && !person.getId().equalsIgnoreCase(e.getId()))
            ||(!person.getName().isEmpty() && !person.getName().equalsIgnoreCase(e.getName()))
                ||(!person.getName().isEmpty() && !person.getName().equalsIgnoreCase(e.getName()))

        ){
            return false;
        }
        return true;

    }




    public  void  printList(List<Person>  list){
        for(Person e:  list){
            System.out.println( e.toString());
        }
    }


}
