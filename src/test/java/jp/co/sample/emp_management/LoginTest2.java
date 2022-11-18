package jp.co.sample.emp_management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class LoginTest2 {
	
	@Test
	void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/");
		driver.quit();
	}
	@Test
	void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement element ;
		
		driver.get("http://localhost:8080/");
		element = driver.findElement(By.name("mailAddress"));
		element.sendKeys("");
		element = driver.findElement(By.name("password"));
		element.sendKeys("aaa");
		element.sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.cssSelector(" form > fieldset > div:nth-child(2) > div")).getText();
		assertEquals("メールアドレスまたはパスワードが不正です。", text);
		driver.quit();
	}
	@Test
	void test3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement element ;
		
		driver.get("http://localhost:8080/");
		element = driver.findElement(By.name("mailAddress"));
		element.sendKeys("aaa@sample.com");
		element = driver.findElement(By.name("password"));
		element.sendKeys("testtest");
		element.sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.cssSelector(" form > fieldset > div:nth-child(2) > div")).getText();
		assertEquals("メールアドレスまたはパスワードが不正です。", text);
		driver.quit();
	}
	@Test
	void test4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement element ;
		
		driver.get("http://localhost:8080/");
		element = driver.findElement(By.name("mailAddress"));
		element.sendKeys("iga@sample.com");
		element = driver.findElement(By.name("password"));
		element.sendKeys("");
		element.sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.cssSelector(" form > fieldset > div:nth-child(2) > div")).getText();
		assertEquals("メールアドレスまたはパスワードが不正です。", text);
		driver.quit();
	}
	@Test
	void test5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement element ;
		
		driver.get("http://localhost:8080/");
		element = driver.findElement(By.name("mailAddress"));
		element.sendKeys("iga@sample.com");
		element = driver.findElement(By.name("password"));
		element.sendKeys("aaa");
		element.sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.cssSelector(" form > fieldset > div:nth-child(2) > div")).getText();
		assertEquals("メールアドレスまたはパスワードが不正です。", text);
		driver.quit();
	}
	
	@Test
	void test6() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement element ;
		
		driver.get("http://localhost:8080/");
		element = driver.findElement(By.name("mailAddress"));
		element.sendKeys("iga@sample.com");
		element = driver.findElement(By.name("password"));
		element.sendKeys("testtest");
		element.sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.className("breadcrumb")).getText();
		assertEquals("従業員リスト", text);
		driver.quit();
	}

}
