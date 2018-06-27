package com.liuwei.demo.mykaptapi

class MyKapt {
    companion object {
        fun bindView(target: Any) {
            val classs = target.javaClass
            val claName = classs.name + "_bindView"
            val clazz = Class.forName(claName)

            val bindMethod = clazz.getMethod("bindView", target::class.java)
            val ob = clazz.newInstance()
            bindMethod.invoke(ob, target)
        }
    }
}