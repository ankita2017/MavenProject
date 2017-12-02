
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SearchPage {

    static WebDriver driver;

    public static WebElement element = null;

    static Logger log = Logger.getLogger(SearchPage.class);

    public static void clearAllFields(WebDriver Driver){
        driver.findElement(By.id("flight-origin-hp-flight")).clear();
        driver.findElement(By.id("flight-destination-hp-flight")).clear();
        driver.findElement(By.id("flight-departing-hp-flight")).clear();
        driver.findElement(By.id("flight-returning-hp-flight")).clear();

    }


    public static void sendOriginTextBox(WebDriver driver, String origin){
        element = driver.findElement(By.id("flight-origin-hp-flight"));
        element.sendKeys(origin);
        element.sendKeys(Keys.TAB);
        log.info("Entered origin city as :" + origin);
    }


    public static void sendDestinationTextBox(WebDriver driver, String destination){
        element = element = driver.findElement(By.id("flight-destination-hp-flight"));
        element.sendKeys(destination);
        element.sendKeys(Keys.TAB);
        log.info("Entered destination city as :" + destination);
    }

    public static void departureDate(WebDriver driver, String date){
        element = driver.findElement(By.id("flight-departing-hp-flight"));
        element.sendKeys(date);
        element.sendKeys(Keys.TAB);
        log.info("Enter departure date as " + date);
    }

    public static void returnDate(WebDriver driver, String date) {
        element = driver.findElement(By.id("flight-returning-hp-flight"));
        element.clear();
        element.sendKeys(date);
        element.sendKeys(Keys.TAB);
        log.info("Enter return date as " + date);
    }

    public static void clickOnSearchButton(WebDriver driver){
        element =driver.findElement(By.xpath(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button"));
        element.click();
    }


    public static void navigateToFlightsTab(WebDriver driver){
        element= driver.findElement(By.id("tab-flight-tab-hp"));
        element.click();
        log.info("Navigate to flights tab");

    }

    public static void clickonAdvancedLink(WebDriver driver){
        element =driver.findElement(By.id("flight-advanced-options-hp-flight"));
        element.click();
        log.info("Clicked on Advanced Options link");
    }

    public static void clickNonStopCheckBox(WebDriver driver){
        element = driver.findElement(By.id("advanced-flight-nonstop-hp-flight"));
        element.click();
        /* new Actions(driver).moveToElement(element).click().perform();
        boolean a = element.isSelected();
        if(a ==false) */
        log.info("Clicked non-stop check box");
    }

    public static  void SelectFlightClass(WebDriver driver, String flightclass) {
        Select options = new Select(driver.findElement(By.id("flight-advanced-preferred-class-hp-flight")));
        options.selectByValue(flightclass);
        log.info("Select flight class as " + flightclass);
    }


    public static void selectAdults(WebDriver driver, String adults){
        Select options = new Select(driver.findElement(By.id("flight-adults-hp-flight")));
        options.selectByValue(adults);
        log.info("Select flight adults as " + adults);

    }

}
