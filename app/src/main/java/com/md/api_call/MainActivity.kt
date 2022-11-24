package com.md.api_call

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.md.api_call.api.ApiInterface
import com.md.api_call.api.ApiUtil
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userApi = ApiUtil.getInstance().create(ApiInterface::class.java);

        GlobalScope.launch {

            val res = userApi.getAllUsers()

            val singleUserData = userApi.getSingleUser(1)

            Log.d("MainActivity:", "All_User_Data :${res.body()}")

            Log.d("MainActivity", "Single_User_Data : ${singleUserData.body()}")

        }

    }
}