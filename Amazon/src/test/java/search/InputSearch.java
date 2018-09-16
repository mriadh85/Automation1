package search;

public class InputSearch {

    @Test
    public void search(){
        dr.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone XS", Keys.ENTER);
    }
}
