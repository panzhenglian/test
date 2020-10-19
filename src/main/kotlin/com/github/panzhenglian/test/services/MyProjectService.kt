package com.github.panzhenglian.test.services

import com.intellij.openapi.project.Project
import com.github.panzhenglian.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
