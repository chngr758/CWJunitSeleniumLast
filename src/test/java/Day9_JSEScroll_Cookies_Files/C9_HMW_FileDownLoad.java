package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C9_HMW_FileDownLoad extends BaseTest {

    @Test
    public void downloadTest() throws InterruptedException {
    // Go to https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");
    //  Download sample.png file
        driver.findElement(By.linkText("file.png")).click();

    //  It takes about a second to download the file
    //  Implicit wait cannot solve this issue, cause this is related to Desktop application
        Thread.sleep(3000);//Test will wait for 3 secs

    //  Then verify if the file downloaded successfully
        String path = System.getProperty("user.home")+"/Downloads/file.png";

    //  Assert if this path exist
        boolean isExist = Files.exists(Paths.get(path));
        Assert.assertTrue(isExist);

    }
}
