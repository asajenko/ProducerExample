package com.sajenko.producerexample.contracts;

import com.sajenko.producerexample.restservice.User;
import com.sajenko.producerexample.restservice.UserRepository;
import com.sajenko.producerexample.restservice.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseTestClass {

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        when(userRepository.getUserById(10L)).thenReturn(new User(10L, "Adam"));
        when(userRepository.getUserById(100L)).thenReturn(null);
        when(userRepository.getAllUsers()).thenReturn(List.of(new User(1L, "Adam"), new User(2L, "Tomek")));

        RestAssuredMockMvc.standaloneSetup(new UserController(userRepository));
    }
}
