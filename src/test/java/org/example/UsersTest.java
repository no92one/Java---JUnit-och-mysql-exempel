package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsersTest {

    Users users;

    @BeforeEach
    void setUp() {
        this.users = new Users();
    }

    @Test
    void getUserName() {
        Assertions.assertEquals(users.getUserName(), "Kalle");
    }

    @Test
    void getLastUsersName(){
        users.createUser("Sara", "BIDDER", "saraBIDD@hotmail.com");
        Assertions.assertEquals(users.getLastUsersName(), "Sara");
    }
}