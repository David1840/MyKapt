package com.liuwei.demo.mykaptdemp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.liuwei.demo.annotation.MyClass
import com.liuwei.demo.annotation.findView


@MyClass
class MainActivity : Activity() {

    @findView(R.id.text1)
    var text123: TextView? = null

    @findView(R.id.text2)
    var text2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyActivity.bindView(this)
        text123?.text = "gjagdkajsdgaklsjdg"
        text2?.text = "hahahahahahahahaha"
    }
}
