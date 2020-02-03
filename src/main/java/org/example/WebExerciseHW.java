package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebExerciseHW {
    static protected WebDriver driver;

    @Test
    public void OrangeHarm() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
    }
    @Test
    public void oracle() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://demo.oracle.com/apex/f?p=QUICKTOURS:60:::::LP%2CELQ_CAMPAIGN_CODE:6%2CNAMK15041381MPP010C004");
        driver.findElement(By.id("qt-btn-login")).click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("cb41create-btn")));
        driver.findElement(By.id("sso_username")).sendKeys("Richmond");
        driver.findElement(By.id("ssopassword")).sendKeys("123rich");
        driver.findElement(By.xpath("//input[@type='button']")).click();
    }
    @Test
    public void Website_com() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.website.com/sign-in/");
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("signin-submit2")));
        driver.findElement(By.id("username")).sendKeys("Bimal");
        driver.findElement(By.id("password")).sendKeys("B123");
        driver.findElement(By.id("signin-submit2")).click();
    }
    @Test
    public void mockplus() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.mockplus.com/blog/post/login-page-examples");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("patelradha11@test.com");
        driver.findElement(By.id("password")).sendKeys("patel123");
        driver.findElement(By.id("login")).click();
    }
    @Test
    public void Ocado(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.ocado.com/webshop/startWebshop.do");
        driver.findElement(By.id("loginButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit-button")));
        driver.findElement(By.id("login-input")).sendKeys("patelradha@test.com");
        driver.findElement(By.name("password")).sendKeys("patel123");
        driver.findElement(By.id("login-submit-button")).click();

    }










    }





