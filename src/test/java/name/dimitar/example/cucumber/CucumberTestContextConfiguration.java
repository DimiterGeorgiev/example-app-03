package name.dimitar.example.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import name.dimitar.example.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
