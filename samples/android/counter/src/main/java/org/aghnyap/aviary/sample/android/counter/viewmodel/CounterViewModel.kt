package org.aghnyap.aviary.sample.android.counter.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(): ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> get() = _count

    fun increment() {
        _count.value++
    }
}
