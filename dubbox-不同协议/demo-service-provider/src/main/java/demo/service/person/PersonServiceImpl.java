package demo.service.person;

import demo.service.api.person.Person;
import demo.service.api.person.PersonService;
import demo.service.api.person.QueryParameter;
import org.apache.avro.AvroRemoteException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangjunming on 3/4/16.
 * author: yangjunming@huijiame.com
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Override
    public String ping() throws AvroRemoteException {
        return "pong";
    }

    @Override
    public List<Person> getPersonList(QueryParameter queryParameter) throws AvroRemoteException {
        Person p1 = new Person();
        p1.setAge(queryParameter.getAgeStart());
        p1.setName("Test");
        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        return persons;
    }
}
