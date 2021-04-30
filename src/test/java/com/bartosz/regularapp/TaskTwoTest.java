package com.bartosz.regularapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskTwoTest extends AstaBaseTest {

    @Test
    public void AddItemTest() {
        astaBasePage.goToTaskTwoSite();
        taskTwoSite.selectSportItems();
        assertThat(taskTwoSite.foundElements.getText()).isEqualTo("Sport");
    }
}