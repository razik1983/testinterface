package com.mygdx.game.desktop

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.Leaderboard
import com.mygdx.game.MyGame


object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        LwjglApplication(MyGame(DesktopLeaderboard()), config)
    }
}

class DesktopLeaderboard : Leaderboard {
    fun submitScore(user: String, score: Int) {
        Gdx.app.log("DesktopLeaderboard", "would have submitted score for user $user: $score")
    }

    override fun submitVariable(): Int {
        return 5
    }
}