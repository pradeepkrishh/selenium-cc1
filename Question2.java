package CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);
driver.manage().window().maximize();
driver.navigate().to("https://www.saucedemo.com/");
WebElement username=driver.findElement(By.id("user-name"));
username.sendKeys("standard_user");
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
WebElement login = driver.findElement(By.id("login-button"));
login.submit();
driver.navigate().to("https://www.saucedemo.com/inventory.html");
WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
drop1.click();
Select sel1 = new Select(drop1);
sel1.selectByIndex(0);

WebElement product1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
System.out.println("First Product name in A to Z : ");
System.out.println(product1.getText());

WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
drop2.click();
Select sel2 = new Select(drop2);
sel2.selectByIndex(1);

WebElement product2 = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
System.out.println("First Product name in Z to A : ");
System.out.println(product2.getText());

WebElement drop3 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
drop3.click();
Select sel3 = new Select(drop3);
sel3.selectByIndex(2);

WebElement product3 = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
System.out.println("First Product name in Price(low to high) : ");
System.out.println(product3.getText());

WebElement drop4 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
drop4.click();
Select sel4 = new Select(drop4);
sel4.selectByIndex(3);

WebElement product4 = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
System.out.println("First Product name in Price(high to low) : ");
System.out.println(product4.getText());
}
}