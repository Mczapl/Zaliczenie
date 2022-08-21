package pages;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.*;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.io.*;
import java.sql.Timestamp;


public class ScreenShot {
    public WebDriver driver;

    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    public void saveWholePageScreenshot() throws IOException {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        String path = "./Screenshot/" + time.getTime() + ".png";
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "PNG", new File(path));
    }
}
