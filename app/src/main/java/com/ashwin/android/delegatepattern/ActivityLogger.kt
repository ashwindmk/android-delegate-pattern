package com.ashwin.android.delegatepattern

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner

class ActivityLogger : ViewLogger, LifecycleEventObserver {
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("delegate-demo", "${source.javaClass.simpleName}: ${event.name}")
        when (event) {
            Lifecycle.Event.ON_RESUME -> {
                // Do something
            }
            else -> Unit
        }
    }
}
