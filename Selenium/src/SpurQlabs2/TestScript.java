package SpurQlabs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SpurQlabs1.Generic;

public class TestScript extends Generic {
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='4']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='×']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='5']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='5']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		System.out.println(ele.getText());
		
		driver.findElement(By.xpath("//span[.='AC']")).click();
		
		driver.findElement(By.xpath("//span[.='4']")).click();
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//span[.='0']")).click();
		}
		driver.findElement(By.xpath("//span[.='/']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		for(int i=0;i<2;i++)
		{
			driver.findElement(By.xpath("//span[.='0']")).click();
		}
		WebElement el = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		System.out.println(el.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='AC']")).click();
		
		driver.findElement(By.xpath("//span[.='–']")).click();
		for(int i=0;i<2;i++)
		{
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
		}
		driver.findElement(By.xpath("//span[.='+']")).click();
		for(int i=0;i<2;i++)
		{
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='5']")).click();
		}
		WebElement e = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		System.out.println(e.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='AC']")).click();
		
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.='4']")).click();
		driver.findElement(By.xpath("//span[.='8']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		
		driver.findElement(By.xpath("//span[.='–']")).click();
		driver.findElement(By.xpath("//span[.='(']")).click();
		
		driver.findElement(By.xpath("//span[.='–']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.='0']")).click();
		driver.findElement(By.xpath("//span[.='9']")).click();
		driver.findElement(By.xpath("//span[.='4']")).click();
		driver.findElement(By.xpath("//span[.='8']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.=')']")).click();
		
		WebElement elem = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		System.out.println(elem.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='AC']")).click();
	}

}
