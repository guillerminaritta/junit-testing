import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

// check for system and enviroment variables
// @EnabledIfSystemProperty(named = "os.arch", matches = "x")
// @DisabledIfSystemProperty(named = "os.arch", matches = "x")
// @EnabledIfEnvironmentVariable(named = "USER", matches = "admin")

public class BankAccountConditionalTest {

    @Test
    @EnabledOnOs({OS.MAC})
    public void testMac(){

    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_17})
    public void testJRE(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_17})
    public void testNroJRE17(){

    }
}
