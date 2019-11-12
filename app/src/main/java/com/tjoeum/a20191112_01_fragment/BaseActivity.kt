package com.tjoeum.a20191112_01_fragment

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    abstract fun setValues()

    abstract fun setupEvents()

}