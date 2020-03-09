package io.code.morning.admin.index

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
class IndexControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `HelloKotlinController - return greeting message successfully`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isUnauthorized)

        // TODO: Spring Security Setting
        /*
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isOk)
                .andExpect(content().string("Hello Morning Code"))
         */
    }
}