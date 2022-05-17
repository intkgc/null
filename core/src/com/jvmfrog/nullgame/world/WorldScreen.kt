package com.jvmfrog.nullgame.world

import com.badlogic.gdx.Screen
import com.jvmfrog.nullgame.render.Render

class WorldScreen(world: World) : Screen {

    private val render = Render(world)

    override fun render(delta: Float) {
        render.render()
    }

    override fun show() {

    }

    override fun resize(width: Int, height: Int) {
        render.resize();
    }

    override fun pause() {
        TODO("Not yet implemented")
    }

    override fun resume() {
        TODO("Not yet implemented")
    }

    override fun hide() {
        TODO("Not yet implemented")
    }

    override fun dispose() {
        TODO("Not yet implemented")
    }
}