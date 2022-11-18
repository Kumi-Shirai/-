package jp.co.sample.emp_management;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

public class LoginTest {
//	Configuration.browser = WebDriverRunner.CHROME;
//	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

	@Test
	void test() {
		Selenide.open("http://localhost:8080/");
		$("legend").shouldHave(text("ログイン"));
	}
//	@Test
//	void test2() {
//		$("mailAddress").setValue("");
//		$("password").setValue("aaa");
//		String text = $("form.div.div.p").getText();
//		$("form").shouldHave(text("メールアドレスまたはパスワードが間違っています"));
//	}

}
