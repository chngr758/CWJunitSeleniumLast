package Day9_JSEScroll_Cookies_Files;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class C5_HMW_Cookies extends BaseTest {

    @Before
    public void launchApp() {
        driver.get("http://facebook.com");
    }


    @Test
    public void getCookies() {
        System.out.println("get cookies");
        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c );
        }
    }

    @Test
    public void addCookie() {
        System.out.println("add Cookie");
        Cookie name = new Cookie("This is my cookie.", "123456");
        driver.manage().addCookie(name);

        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c );
        }
    }

    @Test
    public void deleteCookieNamed() {
        System.out.println("delete Cookie Named");
        Cookie name = new Cookie("This is my cookie.", "123456");
        driver.manage().addCookie(name);
        driver.manage().deleteCookieNamed("This is my cookie."); //herhangi biri secilip silinebilir, ya da ekledigimizi silebiliriz
        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c );
        }
    }

    @Test
    public void deleteAllCookies() {
        System.out.println("delete All Cookies");
        Cookie name = new Cookie("This is my cookie.", "123456");
        driver.manage().addCookie(name);
        driver.manage().deleteAllCookies();
        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c );
        }
    }
}