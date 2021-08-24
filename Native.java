import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Native extends BaseClass {


    @Test

    public void ozon() {
        MobileElement el1 = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Папка Хлам, 1 уведомление\"]/android.widget.ImageView");
        el1.click();
        MobileElement el2 = driver.findElementByAccessibilityId("OZON");
        el2.click();
        MobileElement el3 = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Главная\"]/android.widget.ImageView");
        el3.click();
        MobileElement el4 = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Каталог\"]/android.widget.ImageView");
        el4.click();
        MobileElement el5 = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Корзина\"]/android.widget.ImageView");
        el5.click();
        MobileElement el6 = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Избранное\"]/android.widget.ImageView");
        el6.click();
        MobileElement el7 = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Мой Ozon\"]/android.widget.ImageView");
        el7.click();
    }
}
