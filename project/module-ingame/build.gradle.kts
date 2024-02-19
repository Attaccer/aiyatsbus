import io.izzel.taboolib.gradle.*

dependencies {
    // 引入 API
    compileOnly(project(":project:common"))
    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
}

// 子模块
taboolib { subproject = true }