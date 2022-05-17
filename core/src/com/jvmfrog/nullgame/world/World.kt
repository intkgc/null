package com.jvmfrog.nullgame.world

import com.jvmfrog.nullgame.render.Renderable

interface World {
    val renderables: Iterable<Renderable>
}