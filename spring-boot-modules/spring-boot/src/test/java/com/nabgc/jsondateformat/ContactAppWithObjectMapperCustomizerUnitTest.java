package com.nabgc.jsondateformat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = ContactApp.class)
public class ContactAppWithObjectMapperCustomizerUnitTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port;
    
    String url;

    @Before
    public void before() {
        url=String.format("http://localhost:%s", port);
    }
    
    @Test
    public void givenDefaultDateFormatInAppPropertiesAndLegacyDateType_whenGet_thenReturnExpectedDateFormat() throws IOException {
        ResponseEntity<String> response = restTemplate.getForEntity(url + "/contacts/plainWithJavaUtilDate", String.class);

        assertEquals(200, response.getStatusCodeValue());

        List<Map<String, String>> respMap = mapper.readValue(response.getBody(), new TypeReference<List<Map<String, String>>>(){});

        LocalDate birthdayDate = LocalDate.parse(respMap.get(0).get("birthday"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime lastUpdateTime = LocalDateTime.parse(respMap.get(0).get("lastUpdate"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        assertNotNull(birthdayDate);
        assertNotNull(lastUpdateTime);
    }

    @Test
    public void givenDefaultDateFormatInAppPropertiesAndJava8DateType_whenGet_thenReturnExpectedDateFormat() throws IOException {
        ResponseEntity<String> response = restTemplate.getForEntity(url + "/contacts/plain", String.class);

        assertEquals(200, response.getStatusCodeValue());

        List<Map<String, String>> respMap = mapper.readValue(response.getBody(), new TypeReference<List<Map<String, String>>>(){});

        LocalDate birthdayDate = LocalDate.parse(respMap.get(0).get("birthday"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime lastUpdateTime = LocalDateTime.parse(respMap.get(0).get("lastUpdate"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        assertNotNull(birthdayDate);
        assertNotNull(lastUpdateTime);
    }

}
