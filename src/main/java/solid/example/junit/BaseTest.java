package solid.example.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    void openDatabaseConnection() {
        //some code
    }

    @AfterAll
    void closeDatabaseConnection() {
        //some other code
    }
}
