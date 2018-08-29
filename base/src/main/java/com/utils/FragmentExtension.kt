package com.utils

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created by Kaz on 08:38 7/20/18
 */
fun Fragment.startActivity(clazz: Class<*>) {
    val intent = Intent(context, clazz)
    startActivity(intent)
}

fun Fragment.startActivity(clazz: Class<*>, bundle: Bundle) {
    val intent = Intent(context, clazz)
    intent.putExtras(bundle)
    startActivity(intent)
}

fun Fragment.startActivityForResult(clazz: Class<*>, requestCode: Int) {
    val intent = Intent(context, clazz)
    activity?.startActivityForResult(intent, requestCode)
}

fun Fragment.startActivityForResult(clazz: Class<*>, requestCode: Int, bundle: Bundle) {
    val intent = Intent(context, clazz)
    intent.putExtras(bundle)
    activity?.startActivityForResult(intent, requestCode)
}

fun Fragment.startActivityNewTask(clazz: Class<*>) {
    val intent = Intent(context, clazz)
    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
}
