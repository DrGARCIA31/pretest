package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void contextLoads() {
        String dbPassword = "";
        String password = "";
        UserUtils userUtils = new UserUtils();
        assertTrue(UserUtils.isPasswordEqual(dbPassword,password));

    }

}
