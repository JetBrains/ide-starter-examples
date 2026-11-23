package com.intellij.ide.starter.examples.driver

import com.intellij.driver.client.service
import com.intellij.driver.sdk.getOpenProjects
import com.intellij.ide.starter.driver.engine.runIdeWithDriver
import com.intellij.ide.starter.driver.execute
import com.intellij.ide.starter.examples.data.IdeaUltimateCases
import com.intellij.ide.starter.examples.driver.model.LafManager
import com.intellij.ide.starter.junit5.hyphenateWithClass
import com.intellij.ide.starter.runner.CurrentTestMethod
import com.intellij.ide.starter.runner.Starter
import com.intellij.tools.ide.performanceTesting.commands.CommandChain
import com.intellij.tools.ide.performanceTesting.commands.openFile
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PerfTestWithDriver {
  @Test
  fun openGradleProject() {
    val testContext = Starter
      .newContext(CurrentTestMethod.hyphenateWithClass(), IdeaUltimateCases.GradleJUnitStarter)
      .prepareProjectCleanImport()

    testContext.runIdeWithDriver().useDriverAndCloseIde {
      execute(CommandChain().openFile("build.gradle")) //invocation of command via JMX call
      assertEquals(1, getOpenProjects().size) // JMX call using predefined interfaces
      assertEquals(service<LafManager>().getCurrentUIThemeLookAndFeel().getName(), "Islands Dark") //JMX call with custom interfaces
    }
  }
}