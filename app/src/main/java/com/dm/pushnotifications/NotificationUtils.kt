package com.dm.pushnotifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

object NotificationUtils {
    const val CHANNEL_ID = "2002"

    fun createNotificationChannel(context: Context){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Canal principal"
            val descriptionText = "Canal para notificaciones generales"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }

            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}