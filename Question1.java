package CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
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
WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
addtocart.click();
WebElement cart = driver.findElement(By.id("shopping_cart_container"));
cart.click();
WebElement checkout = driver.findElement(By.id("checkout"));
checkout.click();
WebElement f_name=driver.findElement(By.id("first-name"));
f_name.sendKeys("Krishna");
WebElement l_name=driver.findElement(By.id("last-name"));
l_name.sendKeys("Vigashini");
WebElement code=driver.findElement(By.id("postal-code"));
code.sendKeys("638476");
WebElement cont = driver.findElement(By.id("continue"));
cont.click();
WebElement product = driver.findElement(By.id("item_4_title_link"));
System.out.println("Product Name "+product.getText());
WebElement price = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]"));
System.out.println(price.getText());
String Exceptedtitle = "Swag Labs";
String Actualtitle = driver.getTitle();
if(Exceptedtitle.equals(Actualtitle))
{
System.out.println("Title is valid");
}
else
{
System.out.println("Title is not valid");
}

String Exceptedurl = "https://www.saucedemo.com/checkout-step-two.html";
String Actualurl = driver.getCurrentUrl();
if(Exceptedurl.equals(Actualurl))
{
System.out.println("Url is valid");
}
else
{
System.out.println("Url is not valid");
}

}
}