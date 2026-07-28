/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 *
 * @author varaprasath.s
 */
public class ProjectName {

    /*Loop Statements */
  public static void main(String[] args) throws Throwable {

       /*int countdown = 3;
        while (countdown>0){
            System.out.println(countdown);
            countdown --;
        }
        System.out.println("Happy new year");/* */
        /*int i=10;
        while(i<8){
            System.out.println("This is existed");
        }/* */
        /*for (int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();/* */
       /*  int [] MyNum = {0,1,2,3};
        for(int i=0; i <= MyNum.length; i++){
            for(int j=0; j <= MyNum.length; j++){
                System.out.print(MyNum [i * j ]);
            }
            System.out.println();
        }/* */
    
    //Trainn Application Login Code

        /*WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://app.trainn.co/login");
        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement email = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter your work email']")));
                email.sendKeys("varaprasath.s@cspl.com");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'Log in using email')]")))
                .click();
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='password']")));
                password.sendKeys("Vara@1620");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(.,'Login')]")))
                .click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

         //driver.quit();

         //driver.findElement(By.id("username"));*/

    //CORE application login page

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://uat.coreretirementsolutions.com/");
        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement email =
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Input_Email")));

        email.clear();
        email.sendKeys("varaprasath.s@cspl.com");

        WebElement password =
        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwordInput")));

        password.clear();
        password.sendKeys("Vara@161820");

        wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//button[contains(text(),'Log in')]")))
        .click();
        
    }

}
       
    
