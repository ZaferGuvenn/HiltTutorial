package com.hilt.tutorial

import javax.inject.Inject

/*
* Interfacemizi uygulamayan sınıf, @provides veya @binds ile bu sınıfı kullanabiliriz.
*
*
*
* */


class InterfaceImplementor
@Inject
constructor():IMyInterface {
    override fun printAnyWithInterface(): String {
        return "Implementor work!!!"
    }
}