import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    public SeleniumTest() {
    }
    
    @BeforeClass
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

         driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
  
    
    @Test
    public void teste1(){
        driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo nome");
    }
   
    @Test
    public void teste2(){
           driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        valorNome.sendKeys("Luciano");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo endereco");
    }
    
    @Test
    public void teste3(){
           driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("Carlos");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo sexo");
    }
    
    @Test
    public void teste4(){
           driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        WebElement valorSexo = driver.findElement(By.id("sexo"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("Carlos");
        valorSexo.sendKeys("m");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo idade com numeros");
    }
    
    @Test
    public void teste5(){
          driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        WebElement valorSexo = driver.findElement(By.id("sexo"));
        WebElement valorIdade = driver.findElement(By.id("idade"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("Carlos");
        valorSexo.sendKeys("m");
        valorIdade.sendKeys("X");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo idade com numeros");
    }
    
    @Test
    public void teste6(){
           driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        WebElement valorSexo = driver.findElement(By.id("sexo"));
        WebElement valorIdade = driver.findElement(By.id("idade"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("Carlos");
        valorSexo.sendKeys("m");
        valorIdade.sendKeys("-1");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Idade com valores acima de 0");
    }
    
    @Test
    public void teste7(){
           driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        WebElement valorSexo = driver.findElement(By.id("sexo"));
        WebElement valorIdade = driver.findElement(By.id("idade"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("Carlos");
        valorSexo.sendKeys("m");
        valorIdade.sendKeys("21");
        botao.click();
        Alert alerta = driver.switchTo().alert();
        Assert.assertEquals(alerta.getText(), "Cadastro realizado");
        alerta.accept();
    }
    
    @Test
    public void teste8(){
          driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        valorNome.sendKeys("Fabiano");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo endereco");
    }
    
    @Test
    public void teste9(){
           driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("Carlos");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo sexo");
    }
    
    @Test
    public void teste10(){
          driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        WebElement valorSexo = driver.findElement(By.id("sexo"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("XXXXXXXX");
        valorSexo.sendKeys("m");
        botao.click();
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertEquals(resultado, "Preencha o campo idade com numeros");
    }
    
    @Test
    public void teste11(){
        driver.get("C:\\Users\\lucia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploPraticoAula11QPPSW\\src\\login.html");
        WebElement botao = driver.findElement(By.id("login"));
        WebElement valorNome = driver.findElement(By.id("nome"));
        WebElement valorEndereco = driver.findElement(By.id("endereco"));
        WebElement valorSexo = driver.findElement(By.id("sexo"));
        WebElement valorIdade = driver.findElement(By.id("idade"));
        valorNome.sendKeys("Luciano");
        valorEndereco.sendKeys("XXXXXXXXX");
        valorSexo.sendKeys("m");
        valorIdade.sendKeys("21");
        botao.click();
        Alert alerta = driver.switchTo().alert();
        Assert.assertEquals(alerta.getText(), "Cadastro realizado");
        alerta.accept();
    }
    
    
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
    
}
