package com.ashwin.android.delegatepattern

import androidx.lifecycle.LifecycleOwner

interface ViewLogger {
    fun registerLifecycleOwner(owner: LifecycleOwner)
}
