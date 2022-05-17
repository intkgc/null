package com.jvmfrog.nullgame.render

import com.badlogic.gdx.math.Vector3

interface Renderable {
    fun render(position: Vector3)
    fun render(x: Float, y: Float, z: Float)
    fun render()
}