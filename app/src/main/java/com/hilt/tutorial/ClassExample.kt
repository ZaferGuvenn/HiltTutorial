package com.hilt.tutorial

import com.google.gson.Gson
import javax.inject.Inject


/*
* Class example 2 adet interface implemente eden sınıfın returnını döndürüyor.
* Gson da dış kütüphane için bir örnek.
* First ve second olarak iki annotation oluşturmamızın sebebi ikisinin de aynı interface'i kullanması
*
* */

//constructor injection
class ClassExample @Inject constructor(@FirstImplementor val myInterfaceImplementor:IMyInterface,
                                       val gson: Gson,
                                       @SecondImplementor val mySecondInterfaceImplementor:IMyInterface) {


    fun myFunction():String{
        return myInterfaceImplementor.printAnyWithInterface()
    }

    fun mySecondFunction():String{
        return mySecondInterfaceImplementor.printAnyWithInterface()
    }
}