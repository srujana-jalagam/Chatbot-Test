import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testingChatBot {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Coding_Softwares\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://qachatbot.ccbp.tech/");


        WebElement inputField = driver.findElement(By.cssSelector("input[id = 'userInput']"));
        inputField.sendKeys("Hi");

        WebElement sendButton = driver.findElement(By.cssSelector("button[id = 'sendMsgBtn']"));
        sendButton.click();

        inputField.sendKeys("Good Morning");
        sendButton.click();

        inputField.sendKeys("Help!!!");
        sendButton.click();


        List<WebElement> messageElements = driver.findElements(By.cssSelector("div[id = 'chatContainer'] span"));

        for (WebElement message : messageElements) {
            System.out.println(message.getText());
        }

        driver.quit();
    }
}
