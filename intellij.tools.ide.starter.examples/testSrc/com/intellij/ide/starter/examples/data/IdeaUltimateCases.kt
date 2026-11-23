package com.intellij.ide.starter.examples.data

import com.intellij.ide.starter.models.IdeInfo
import com.intellij.ide.starter.project.GitHubProject
import com.intellij.ide.starter.project.TestCaseTemplate
import com.intellij.tools.ide.starter.product.idea.ultimate.IdeaUltimate

object IdeaUltimateCases : TestCaseTemplate(IdeInfo.IdeaUltimate) {

  val GradleBuildScanQuickstart = withProject(
    GitHubProject.fromGithub(
      branchName = "main",
      repoRelativeUrl = "gradle/gradle-build-scan-quickstart.git",
      commitHash = "8c2b1b6c5cbf781dc3399e3eb58da37ec256ddaa"
    )
  )

  val MavenSimpleApp = withProject(
    GitHubProject.fromGithub(
      branchName = "master",
      repoRelativeUrl = "jenkins-docs/simple-java-maven-app"
    )
  )

  val GradleQuantumSimple = withProject(
    GitHubProject.fromGithub(
      branchName = "master",
      repoRelativeUrl = "Perfecto-Quantum/Quantum-Starter-Kit.git",
      commitHash = "1dc6128c115cb41fc442c088174e81f63406fad5"
    )
  )
}