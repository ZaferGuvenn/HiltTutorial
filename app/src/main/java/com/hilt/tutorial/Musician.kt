package com.hilt.tutorial

import javax.inject.Inject

/*
* Musiciandan oluşturacağımız objeler için instrument ve band objelerinin de initialized olması gerek.
* Bu sebepten inject ederek işimizi kolaylaştırıyoruz. Initialize işlemlerini ayrı ayrı sürekli yapma
* ihtiyacı duymuyoruz.
*
*
* */

class Musician
    @Inject constructor(val instrument: Instrument,val band: Band) {



        fun MyPrinterFun(){
            println(instrument)
        }

}