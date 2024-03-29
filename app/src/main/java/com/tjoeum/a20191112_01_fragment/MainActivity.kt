package com.tjoeum.a20191112_01_fragment

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()
    }

    override fun setValues() {
        
        firstTxt.text = "첫 테스트"
        secondTxt.text = "두번째 테스트"
        
    }

    override fun setupEvents() {
        testViewPage.setOnClickListener {
            intent = Intent(this,TestActivity::class.java)
            startActivity(intent)
        }
    }
}
