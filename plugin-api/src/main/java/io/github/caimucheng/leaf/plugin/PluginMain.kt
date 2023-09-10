package io.github.caimucheng.leaf.plugin

import android.content.res.Resources

/**
 * The plugin abstract main class
 * */
abstract class PluginMain {

    private lateinit var resources: Resources

    open fun setResources(resources: Resources) {
        this.resources = resources
    }

    open fun getResources(): Resources {
        return resources
    }

}