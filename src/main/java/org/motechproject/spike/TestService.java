package org.motechproject.spike;

import org.springframework.stereotype.Component;

@Component
public class TestService {

    public String create() {
        return "(CouchDB) Created Couch.";
    }

    public String find() {
        long count = -1;
        return "(CouchDB) Count: " + count;
    }
}
