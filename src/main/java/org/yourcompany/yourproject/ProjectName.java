/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *
 * @author varaprasath.s
 */
public class ProjectName {

    /*Loop Statements */
  public static void main(String[] args) {

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
    
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();

    }

}
       
    
