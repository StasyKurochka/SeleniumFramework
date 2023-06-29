package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class FirstTest1 {


        @Test
        public void startDriver() {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://google.com/");
        }

        @Test
        public void openWebsite() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");

        }

        @Test
        public void openSignInPage() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");
            driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        }

        @Test
        public void EmailPasswordFieldsLoginbuttonValidate() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");
            driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
            Thread.sleep(1000);
            System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
            System.out.println(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
            System.out.println(driver.findElement(By.xpath("//button[@class='auth-page-main-block-form-submit-button']")).isDisplayed());

        }

        @Test
        public void InvalidEmailPasswordAndClickLoginButton() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");
            driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Stanislav@sdd.ut");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
            driver.findElement(By.xpath("//button[@class='auth-page-main-block-form-submit-button']")).click();

        }

        @Test
        public void FillInvalidEmailAndPasswordAndValidateError() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");
            driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Stanislav@sdd.ut");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
            driver.findElement(By.xpath("//button[@class='auth-page-main-block-form-submit-button']")).click();
            Thread.sleep(3000);
            System.out.println(driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());
        }

        @Test
        public void ValidateRememberMeCheckbox() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stani\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");
            driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
            Thread.sleep(1000);

            System.out.println(driver.findElement(By.id("auth-page-remember-me")).isSelected());
        }
    }

