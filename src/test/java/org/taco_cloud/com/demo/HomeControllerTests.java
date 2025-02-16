package org.taco_cloud.com.demo;

import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(HomeController.class)
public class HomeControllerTests {
   
    @Autowired
    private MockMvc mock;

    @Test
    public void testHomePage() throws Exception{
        mock.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(status().isOk())
            .andExpect(view().name("home"))
            .andExpect(content().string(containsString("Welcome to...")));
    }
}
