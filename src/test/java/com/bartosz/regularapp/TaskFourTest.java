package com.bartosz.regularapp;

import org.testng.annotations.Test;

public class TaskFourTest extends AstaBaseTest {


    @Test
    public void applyForTheJon() {
        astaBasePage.goToTaskFourSite();
        taskFourSite.goToApplyForm();
        taskFourSite.switchWindow();
        taskFourSite.fillTheForm();
    }
}
