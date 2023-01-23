package com.hilt.tutorial

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

/*
* Interfacelerden bir obje oluşturamayız ve dolayısıyla constructor da ekleyemediğimizden
* inject etme işlemlerini onu uygulayan, override eden classlar üzerinden yapmalıyız.
* bknz:InterfaceImplementor,SecondInterfaceImplementor
*
* */

interface IMyInterface {

    fun printAnyWithInterface():String
}


/*
* Aşağıda ise binds ve provides yöntemleriyle bu sınıfların uygulanma durumunu belirtiyoruz.
* InstallIn scope olayıdır.
* */


/* Binds yöntemi, daha az kullanılan yöntem.
@InstallIn(ActivityComponent::class)
@Module
abstract class withBinds{

    @ActivityScoped
    @Binds
    abstract fun withBindsImplementor(

        myInterfaceImplementorWithBinds:InterfaceImplementor

    ):IMyInterface
}*/

/*
* Provides yöntemi, dış kütüphaneler için de kullanılır aşağıda Gson olarak yazdık mesela.
* */
@InstallIn(ActivityComponent::class)
@Module
class withProvides{


    @FirstImplementor
    @ActivityScoped
    @Provides
    fun withProvidesImplementor():IMyInterface{
        return InterfaceImplementor()
    }

    @SecondImplementor
    @ActivityScoped
    @Provides
    fun withProvidesSecondImplementor():IMyInterface{
        return SecondInterfaceImplementor()
    }

    @ActivityScoped
    @Provides
    fun withProvidesGson():Gson{
        return Gson()
    }

}


/*
* Yukarıda iki adet aynı interface Implemente eden ayrı sınıfı ayırmak için,
* kendi annotationumuzu oluşyurduk.
* */

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor