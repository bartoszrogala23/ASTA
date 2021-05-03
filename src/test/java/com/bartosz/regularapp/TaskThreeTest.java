package com.bartosz.regularapp;

import org.testng.annotations.Test;

public class TaskThreeTest extends AstaBaseTest {

    @Test
    public void fillTheFormTest() {
        astaBasePage.goToTaskThreeSite();
        taskeThreeSite.resetData();
        taskeThreeSite.activateForm();
        taskeThreeSite.fillTheForm();
    }
}
