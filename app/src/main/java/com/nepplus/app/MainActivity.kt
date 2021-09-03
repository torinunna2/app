package com.nepplus.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nepplus.app.utils.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        signInBtn.setOnClickListener {

            val inputId = emailEdt.text.toString()
            val inputPw = passwordEdt.text.toString()


            ServerUtil.postRequestSignIn(inputId, inputPw, object : ServerUtil.JsonResponseHandler {
                override fun onResponse(jsonObj: JSONObject) {

                    Log.d("화면에서 받은 JSON", jsonObj.toString())

                }
            })


        }



    }

    override fun setValues () {


    }

}