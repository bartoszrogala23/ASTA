package com.bartosz.regularapp;

import com.bartosz.asta.regularapp.AstaBasePage;
import org.testng.annotations.Test;

public class AddOneItemTest extends AstaBaseTest {

    @Test
    public void AddItemTest() {
        astaBasePage.goToTaskOne();
        taskOneSite.addGlassesToCart();
    }
}