package com.fullcycle.ju.admin.catalogo.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.AbstractEnvironment;

public class MainTest {

    //@Test
    public void testMain(){
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "development");
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }

}
