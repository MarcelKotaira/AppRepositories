package br.com.marcelkotaira.apprepositories

import android.app.Application
import br.com.marcelkotaira.apprepositories.data.di.DataModule
import br.com.marcelkotaira.apprepositories.domain.di.DomainModule
import br.com.marcelkotaira.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}