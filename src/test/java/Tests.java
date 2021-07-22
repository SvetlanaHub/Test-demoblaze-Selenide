import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Tests extends Generator {

    @Before
    public void setUp() {
        open("http://www.demoblaze.com");
    }

    @Test //sign up
    public void signUp() {

        $(By.xpath("//*[@id=\"signin2\"]")).click();
        $(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(Generator.generate());
        $(By.xpath("//*[@id=\"sign-password\"]")).sendKeys(Generator.generate());
        $(By.xpath("//button[@onclick=\"register()\"]")).click();

    }

    @Test //add to cart Nexus 6
    public void addToCartNexus6() {

        $(By.xpath("//*[text()[contains(.,'Nexus 6')]]")).click();
        $(By.xpath("//a[@onclick='addToCart(3)']")).click();
        $(By.xpath("//*[@id='cartur']")).click();

    }

    @Test //add to cart Iphone 6 32gb
    public void addToCartIphone6() {

        $(By.xpath("//*[text()[contains(.,'Iphone 6')]]")).click();
        $(By.xpath("//a[@onclick='addToCart(5)']")).click();
        $(By.xpath("//*[@id='cartur']")).click();

    }

    @Test
    public void placeOrder() {

        $(By.xpath("//*[text()[contains(.,'Nexus 6')]]")).click();
        $(By.xpath("//a[@onclick='addToCart(3)']")).click();
        $(By.xpath("//*[@id='cartur']")).click();
        $(By.xpath("//*[text()[contains(.,'Home')]]")).click();
        $(By.xpath("//*[text()[contains(.,'Iphone 6')]]")).click();
        $(By.xpath("//a[@onclick='addToCart(5)']")).click();
        $(By.xpath("//*[@id='cartur']")).click();
        $(By.xpath("//button[@data-toggle=\"modal\"]")).click();

    }
}
