package io.hwjang.app.demo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    init {
        // test 1
        // test 2
        // test 3
        // test 4
        // test 5
        // test 6
    }
    val text: LiveData<String> = _text
}