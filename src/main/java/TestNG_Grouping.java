import org.testng.annotations.*;

public class TestNG_Grouping {

    @BeforeClass
    public void beforeClass(){
        System.out.println("This method runs before class");

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("This method runs before every method");
    }

    @Test(groups = {"Sedan"})
    public void BMW(){
        System.out.println("Running Test - BMW 3 Series");
    }

    @Test(groups = "SUV")
    public void Audi(){
        System.out.println("Running Test - Audi A6");
    }

    @Test(groups = "Bike")
    public void Honda(){
        System.out.println("Running Test - Honda CVR");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This method runs after every method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This method runs after class");
    }

}
