package com.vaibhavmojidra.androidkotlindemo2databindingwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private val count=MutableLiveData<Int>()

    val countData:LiveData<Int>
    get()=count

    init {
        count.value=0
    }

    fun increment(){
        count.value= count.value!!.plus(1)
    }

}