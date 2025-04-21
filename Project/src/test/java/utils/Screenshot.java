package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
public class Screenshot extends Base{
	public static void captureScreenshot(String name){
		File path = new File(System.getProperty("user.dir")+"/screenshots");
		if(!path.exists()) {
			path.mkdirs();
		}
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File change = new File(path, name+timestamp+".png");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, change);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
