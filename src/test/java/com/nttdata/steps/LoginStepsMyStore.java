package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginStepsMyStore {

    private WebDriver driver;

    //constructor
    public LoginStepsMyStore(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     *
     * @param user el usuario
     */
    public void typeUser(String user) {
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));


    }

    /**
     * Escribir el password
     *
     * @param password el password del usuario
     */
    public void typePassword(String password) {
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login() {
        this.driver.findElement(LoginPage.loginButton).click();
    }

    /**
     * Buscar el titulo de cerrar sesión
     *
     * @return el titulo del botón cerrar sesion
     */
    public String extracttextclosesesion() {
        return this.driver.findElement(LoginPage.userconfirmation).getText();


    }
    /**
     * Hacer click en el botón de salir de sesión
     */
    public void closesesion() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.userconfirmation));

        this.driver.findElement(LoginPage.closeButton).click();
    }


}
