package org.motechproject.spike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    private UserDao userDao;

    public String create() {
        userDao.create();
        return "(CouchDB) Created.";
    }

    public String count() {
        return "(CouchDB) Count: " + userDao.count();
    }
}
