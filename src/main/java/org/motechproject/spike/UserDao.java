package org.motechproject.spike;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends CouchDbRepositorySupport<User> {

    @Autowired
    public UserDao(@Qualifier("dbConnector") CouchDbConnector db) {
        super(User.class, db);
        initStandardDesignDocument();
    }

    public void create() {
        User user = new User("Soham", "Bangalore");
        add(user);
    }

    public long count() {
        return getAll().size();
    }
}
