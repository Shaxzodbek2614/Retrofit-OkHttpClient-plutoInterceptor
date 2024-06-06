package com.example.retrofitexample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.retrofitexample.api.ApiClient
import com.example.retrofitexample.databinding.ActivityMainBinding
import com.example.retrofitexample.models.Malumot
import com.example.retrofitexample.reqCreate.ReqUser
import com.example.retrofitexample.reqCreate.ResUser
import com.example.retrofitexample.reqCreate.UpdateUser
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        ApiClient.getApiService().getAllInfo()
//            .enqueue(object :Callback<List<Malumot>> {
//                override fun onResponse(p0: Call<List<Malumot>>, p1: Response<List<Malumot>>) {
//                    if (p1.isSuccessful){
//
//                    }
//                }
//
//                override fun onFailure(p0: Call<List<Malumot>>, p1: Throwable) {
//
//                }
//
//            })
        
//        ApiClient.getApiService().createInfo(ReqUser("Developer","Shaxzodbek"))
//            .enqueue(object :Callback<ResUser>{
//                override fun onResponse(p0: Call<ResUser>, p1: Response<ResUser>) {
//                    if(p1.isSuccessful){
//                        println("salom")
//                        Log.d(TAG, "onResponse: ${p1.body()}")
//                    }
//                }
//
//                override fun onFailure(p0: Call<ResUser>, p1: Throwable) {
//                  
//                }
//            })
        
//        ApiClient.getApiService().updateUser(1,ReqUser("developer","Shaxzodbek"))
//            .enqueue(object : Callback<UpdateUser> {
//                override fun onResponse(p0: Call<UpdateUser>, p1: Response<UpdateUser>) {
//                    if(p1.isSuccessful){
//                        Log.d(TAG, "onResponse: ${p1.body()}")
//                    }
//                }
//
//                override fun onFailure(p0: Call<UpdateUser>, p1: Throwable) {
//                    
//                }
//            })
        
        
        ApiClient.getApiService().deleteUser(2)
            .enqueue(object : Callback<ResponseBody> {
                override fun onResponse(p0: Call<ResponseBody>, p1: Response<ResponseBody>) {
                    if (p1.isSuccessful){
                        Log.d(TAG, "onResponse: ${p1}")
                    }
                }

                override fun onFailure(p0: Call<ResponseBody>, p1: Throwable) {
                    
                }
            })

    }
}