package org.aghnyap.aviary.sample.android.counter.viewmodel

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(
    private val sharedPreferences: SharedPreferences
): ViewModel() {
    private val _count = MutableStateFlow(sharedPreferences.getInt("count", 0))
    val count: StateFlow<Int> get() = _count

    fun increment() {
        sharedPreferences.edit().putInt("count", ++_count.value).apply()
    }
}
