package com.nabgc.jsonexception;

import org.junit.Test;

import com.nabgc.jsonexception.CustomException;
import com.nabgc.jsonexception.MainController;

public class MainControllerIntegrationTest {

    @Test(expected = CustomException.class)
    public void givenIndex_thenCustomException() throws CustomException {

        MainController mainController = new MainController();

        mainController.index();

    }

}