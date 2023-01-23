package com.hilt.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //field injection
    @Inject
    lateinit var musician:Musician

    //field injection
    @Inject
    lateinit var example:ClassExample

    //field injection
    @Inject
    lateinit var example2:InterfaceImplementor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        println(musician.band)//injectable olduğu için çalışır.
        println(musician.instrument)//injectable olduğu için çalışır.
        musician.MyPrinterFun()//injectable olduğu için ve bağlı olduğu band, instrument injectable olduğu için çalışır.
        println(musician)


        println(example.myFunction())//ilk implementorumuzdan alsın
        println("****")
        println(example2.printAnyWithInterface())//burada ise implementorumuzdan direk obje oluşturduk.
        println("****")
        println(example.mySecondFunction())//ikinci implementorumuzdan alsın.


    }
}