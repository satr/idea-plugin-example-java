package com.github.satr.ideapluginexamplejava.services

import com.intellij.openapi.project.Project
import com.github.satr.ideapluginexamplejava.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
