package com.bensalcie.droidcon2022automotive

import android.content.Intent
import androidx.annotation.Nullable
import androidx.car.app.CarAppService
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator


class HelloWorldService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return  HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    /**
     * Creates a new [Session] for the application.
     *
     *
     * This method is invoked the first time the app is started, or if the previous
     * [Session] instance has been destroyed and the system has not yet destroyed
     * this service.
     *
     *
     * Once the method returns, [Session.onCreateScreen] will be called on the
     * [Session] returned.
     *
     *
     * Called by the system, do not call this method directly.
     *
     * @see CarContext.startCarApp
     */

    override fun onCreateSession(): Session {
        return object : Session() {
            override fun onCreateScreen(@Nullable intent: Intent): Screen {
                return HelloWorldScreen(carContext)
            }
        }
    }



    //entry part of the auto car

}