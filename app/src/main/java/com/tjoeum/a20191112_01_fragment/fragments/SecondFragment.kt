package com.tjoeum.a20191112_01_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tjoeum.a20191112_01_fragment.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        secondFragTxt.setOnClickListener {
            Toast.makeText(context,"두번째 프레그먼트",Toast.LENGTH_SHORT).show()
        }
    }
}