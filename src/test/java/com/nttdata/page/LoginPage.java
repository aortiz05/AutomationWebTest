package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By closeButton = By.cssSelector("a.logout.hidden-sm-down");
    public static By userconfirmation = By.xpath("//span[text()='arlet ortiz']");

}
