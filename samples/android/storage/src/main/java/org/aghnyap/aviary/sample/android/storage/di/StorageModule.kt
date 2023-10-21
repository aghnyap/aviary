package org.aghnyap.aviary.sample.android.storage.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {
    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext application: Application): SharedPreferences {
        return application.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)
    }

    companion object {
        const val SHARED_PREFS_NAME = "my_prefs"
    }
}