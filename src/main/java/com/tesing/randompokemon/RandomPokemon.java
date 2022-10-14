package com.tesing.randompokemon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RandomPokemon {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://randompokemon.com";
        driver.get(url);

        int detik = 2;

        delay(detik);
        String titleNameWeb = driver.getTitle();
        System.out.println("Title Name Web : " +titleNameWeb);

        WebElement elementSelect = driver.findElement(By.id("n"));
        Select selectGenerate = new Select(elementSelect);

        delay(detik);
        selectGenerate.selectByValue("5");
        System.out.println("Select generate pokemon");

        WebElement elementSelectRegion = driver.findElement(By.id("region"));
        Select selectRegion = new Select(elementSelectRegion);

        delay(detik);
        selectRegion.selectByValue("hoenn");
        System.out.println("Select all region");

        WebElement elementSelectType= driver.findElement(By.id("type"));
        Select selectType = new Select(elementSelectType);

        delay(detik);
        selectType.selectByValue("dark");
        System.out.println("Select all type");

        driver.findElement(By.id("legendaries"));
        System.out.println("legendaries Checkbox");

//        driver.findElement(By.id("legendaries")).click();
//        System.out.println("legendaries Checkbox");

        driver.findElement(By.id("nfes")).click();
        System.out.println("Nfes Uncheckbox");

//        driver.findElement(By.id("nfes")).click();
//        System.out.println("Nfes Checkbox");

        driver.findElement(By.id("sprites")).click();
        System.out.println("Sprites Uncheckbox");

//        driver.findElement(By.id("sprites")).click();
//        System.out.println("Sprites Checkbox");

        driver.findElement(By.id("natures")).click();
        System.out.println("Natures Checkbox");

//        driver.findElement(By.id("natures")).click();
//        System.out.println("Natures UnCheckbox");

        driver.findElement(By.id("forms"));
        System.out.println("Forms Checkbox");

//        driver.findElement(By.id("forms")).click();
//        System.out.println("Forms Checkbox");

        delay(detik);
        driver.findElement(By.xpath("//*[@id=\"controls\"]/fieldset[2]/input")).click();
        System.out.println("Click generate");

        delay(5);
        driver.quit();
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}