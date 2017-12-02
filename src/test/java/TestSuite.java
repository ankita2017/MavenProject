import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuite {

        WebDriver driver;
        String url;

        static Logger log = Logger.getLogger(TestSuite.class);


        @BeforeClass
        public void beforeClass(){
            url = "https://www.expedia.com/";
            System.setProperty("webdriver.gecko.driver", "/Users/Ankita/Documents/Jar Files/geckodriver-1");
            driver = new FirefoxDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            //PropertyConfigurator.configure("log4j.properties");
            driver.get(url);

        }

        @Test
        public void fillInfo() throws InterruptedException {
            SearchPage.navigateToFlightsTab(driver);
            SearchPage.sendOriginTextBox(driver, "New York");
            SearchPage.sendDestinationTextBox(driver, "Chicago");
            SearchPage.departureDate(driver, "12/25/2017");
            SearchPage.returnDate(driver, "12/31/2017");
            SearchPage.selectAdults(driver,"3");
            SearchPage.clickonAdvancedLink(driver);
            Thread.sleep(3000);
            SearchPage.clickNonStopCheckBox(driver);
            Thread.sleep(2000);
            SearchPage.SelectFlightClass(driver,"first");
            SearchPage.clickOnSearchButton(driver);
        }



    }







