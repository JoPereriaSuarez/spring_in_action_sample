package org.taco_cloud.com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.taco_cloud.com.demo.controllers.DesignTacoController;

@WebMvcTest(DesignTacoController.class)
public class DesignTacoControllerTest {
   
    @Autowired
    private MockMvc mock;

    @Test
    public void testGetStatusOk() throws Exception{
        mock.perform(MockMvcRequestBuilders.get("/design"))
           .andExpect(status().isOk()); 
    }
}
