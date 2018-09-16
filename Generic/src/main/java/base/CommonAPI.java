package base;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver dr = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.amazon.com/") String url){
        System.setProperty("webdriver.gecko.driver", "/Users/riadh/IdeaProjects/webtest/Generic/browser driver/geckodriver");
        dr = new FirefoxDriver();



    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}
