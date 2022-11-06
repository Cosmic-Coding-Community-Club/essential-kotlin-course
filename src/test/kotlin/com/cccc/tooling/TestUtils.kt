package com.cccc.tooling

import kotlin.reflect.KClass
import kotlin.reflect.full.functions

object TestUtils {
    
    fun getFunction(clazz: KClass<*>, functionName: String) =
        clazz.functions.first { it.name == functionName }
    
}