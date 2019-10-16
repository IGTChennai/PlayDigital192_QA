/**
 * 
 */
package com.selenium.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author VANGIREKULA
 *
 */
public class PlayDigital {

	WebDriver driver;

	/**
	 * @throws Exception
	 */
	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\VenkatN\\pd192qa\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate()
				.to("https://qaplaydigital192.dev.igt.com/content/interactive/igaming/en.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Login ']")).isDisplayed();
	}

	@Test
	public void test() throws Exception {

		click_Login_btn();
		enter_Credentials();
		player_Mydetails_Update();
	}

	@After
	public void Quit() throws Exception {
		//driver.quit();
	}
	
	public void click_Login_btn() throws Exception {

		driver.findElement(By.xpath("//*[text()='Login ']")).click();
		Thread.sleep(2000);

	}
	public void enter_Credentials() throws Exception {

		driver.findElement(By.id("loginModal-username")).sendKeys("venbali");
		driver.findElement(By.id("loginModal-password")).sendKeys("Welcome1");
		driver.findElement(By.name("loginSubmit")).click();
		Thread.sleep(2000);
	}

	public void player_Mydetails_Update() throws Exception { 
		try 
		{
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id='accountBarDesktop']/div/div/div[1]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='accountBarDesktop']/div/div/div[1]/div/div[1]/div[2]/nav/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("securityAnswer_0")).sendKeys("city");
		driver.findElement(By.id("apply_changes")).click();
		Thread.sleep(2000);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		}
	}
		



