package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class ApplicationManager {
    private  String browser;
    WebDriver wd;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        //String browser = BrowserType.CHROME;
        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }
        else if(browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        }
        else if(browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.Login("admin", "secret");
    }

    private void Login(String username, String passsword) {
        wd.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
        wd.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
        wd.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(passsword);
        wd.findElement(By.id("LoginForm")).submit();
        wd.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
