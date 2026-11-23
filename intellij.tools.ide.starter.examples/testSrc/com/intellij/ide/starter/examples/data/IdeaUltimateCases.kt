package com.intellij.ide.starter.examples.data

import com.intellij.ide.starter.models.IdeInfo
import com.intellij.ide.starter.project.GitHubProject
import com.intellij.ide.starter.project.GitProjectInfo
import com.intellij.ide.starter.project.TestCaseTemplate
import com.intellij.tools.ide.starter.product.idea.ultimate.IdeaUltimate
import kotlin.io.path.div

object IdeaUltimateCases : TestCaseTemplate(IdeInfo.IdeaUltimate) {

  val GradleJUnitStarter = withProject(
    GitProjectInfo(
      repositoryUrl = "https://github.com/junit-team/junit-examples.git",
      commitHash = "bd1aff56a9c7de7f06a5fe246496992a0c1ebf04",
      branchName = "main",
      projectHomeRelativePath = { it / "junit-jupiter-starter-gradle" }
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