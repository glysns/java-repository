package digytal.spring.explorer.config;

import cucumber.api.java.Before;
import digytal.spring.explorer.SpringBootCucumberExplorerApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

/**
 * Class to use spring application context while running cucumber
 */

/** SE PRETENDE SUBIR A APLICAÇÃO PARA REALIZAR O TESTE

 @SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
 @ContextConfiguration(classes = SpringBootCucumberExplorerApplication.class, loader = SpringBootContextLoader.class)

 */
@SpringBootTest
public class CucumberSpringContextConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);

    /**
     * Need this method so the cucumber will recognize this class as glue and load spring context configuration
     */
    @Before
    public void setUp() {
        LOG.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
    }
}
