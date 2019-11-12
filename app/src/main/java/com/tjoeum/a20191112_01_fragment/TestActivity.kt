package com.tjoeum.a20191112_01_fragment

import android.os.Bundle
import android.os.PersistableBundle
import com.tjoeum.a20191112_01_fragment.adapters.TextViwPagerAdapter
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        setupEvents()
        setValues()
    }
    override fun setupEvents() {
    }

    override fun setValues() {
        textViewPager.adapter = TextViwPagerAdapter(supportFragmentManager)

        myTabLayout.setupWithViewPager(textViewPager)

    }
}