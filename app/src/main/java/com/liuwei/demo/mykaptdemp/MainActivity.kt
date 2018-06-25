package com.liuwei.demo.mykaptdemp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.liuwei.demo.annotation.MyClass


@MyClass
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
