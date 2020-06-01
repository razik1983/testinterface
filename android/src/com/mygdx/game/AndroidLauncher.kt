package com.mygdx.game

import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration

class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val config = AndroidApplicationConfiguration()
        config.useAccelerometer = false;
        config.useCompass = false;
        initialize(MyGame(AndroidLeaderboard()), config)
    }
}


class LeaderboardServiceApi {
    var a = 5
    fun submitVariable(): Int {
        return a
    }
}

class AndroidLeaderboard : Leaderboard {
    private val service: LeaderboardServiceApi
    init {
        service = LeaderboardServiceApi()
    }
    override fun submitVariable(): Int {
        return service.submitVariable()
    }
}