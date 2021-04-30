package com.bartosz.regularapp;

import com.bartosz.asta.regularapp.AstaBasePage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddOneItemTest extends AstaBaseTest {

    @Test
    public void AddItemTest() {
        astaBasePage.goToTaskOneManually();
        taskOneSite.addGlassesToCart();
        String expectedPrice = "15.54 zł";
        assertThat(taskOneSite.basketSummary.getText()).contains(expectedPrice);
    }
}