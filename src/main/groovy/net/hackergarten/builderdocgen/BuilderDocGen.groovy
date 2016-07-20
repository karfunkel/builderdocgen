package net.hackergarten.builderdocgen

import groovyx.javafx.SceneGraphBuilder

class BuilderDocGen {
    static void main(args) {
        new BuilderDocGen(SceneGraphBuilder)
    }

    BuilderDocGen(Class<? extends FactoryBuilderSupport> cls) {
        new javafx.embed.swing.JFXPanel()
        new SceneGraphBuilder()

        def proxy = ProxyMetaClass.getInstance(cls)
        proxy.interceptor = new BuilderIterceptor()
        proxy.use {
            new SceneGraphBuilder()
        }
    }
}
