package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    private WebDriver webDriver;
    @BeforeTest
    public void initTest(){
        System.setProperty("webdriver.chrome.driver","/home/vantu/chromedriver");
        webDriver = new ChromeDriver();

    }
    @BeforeMethod
    public void resetTest(){

    }

//    @Test
//    public void dangKyHoc() throws InterruptedException {
//        webDriver.get("http://dangkyhoc.vnu.edu.vn/dang-nhap");
//        WebElement pass =  webDriver.findElement(By.cssSelector("#Password"));
//        pass.sendKeys("111111");
//        WebElement username = webDriver.findElement(By.cssSelector("#LoginName"));
//        username.sendKeys("17021096");
//        WebElement btn = webDriver.findElement(By.cssSelector(".btn"));
//        btn.click();
//        Thread.sleep(1000);
//        WebElement lblMessage = webDriver.findElement(By.cssSelector(".validation-summary-errors >ul >li"));
//        System.out.println(lblMessage.getText());
//        Assert.assertEquals(lblMessage.getText(),"Sai tên truy cập hoặc mật khẩu!");
//       // webDriver.close();
//    }

    @Test
    public void searchGG() {
        webDriver.get("https://www.google.com.vn/");
        WebElement inputText = webDriver.findElement(By.cssSelector(".gLFyf "));
        inputText.sendKeys("selenium");
        inputText.sendKeys(Keys.ENTER);
    }
}
