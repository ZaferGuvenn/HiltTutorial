package com.hilt.tutorial

import javax.inject.Inject


/*
* Aynı interfacemizi uygulayan ikinci sınıf. Buna da @provides ve @binds ile ulaşabiliriz.
* Fakat bu sınıfın ve diğer sınıfın ikisinin de aynı interfaceyi aynı constructırda kullanması sebebiyle
* (bknz:ClassExample sınıfı)
* bizim iki farklı annotation oluşturup ikisini ayrıştırmamız gerek.
*
*
* */

class SecondInterfaceImplementor @Inject constructor():IMyInterface {
    override fun printAnyWithInterface(): String {
        return "My Second implementor is working..."
    }
}