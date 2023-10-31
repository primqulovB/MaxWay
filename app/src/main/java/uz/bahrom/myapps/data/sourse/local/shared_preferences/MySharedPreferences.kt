package uz.bahrom.myapps.data.sourse.local.shared_preferences

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MySharedPreferences @Inject constructor(@ApplicationContext context: Context) {

    private val pref = context.getSharedPreferences("my_max_way", Context.MODE_PRIVATE)
}