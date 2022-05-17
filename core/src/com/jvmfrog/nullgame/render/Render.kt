package com.jvmfrog.nullgame.render

import com.jvmfrog.nullgame.world.World

class Render(private val world: World) {
    fun render(){
        world.renderables.forEach { it.render() }
    }

    fun resize(){

    }
}