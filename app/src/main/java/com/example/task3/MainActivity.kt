package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.task3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding: ActivityMainBinding by viewBinding(ActivityMainBinding::bind)
    private var a: Int = 0
    private var b: Int = 0
    private var x: Int = 0
    private var y: Int = 0
    private var z: Int = 0

    override fun onStart() {
        super.onStart()
        binding.buttonCheck.setOnClickListener {
            if (binding.a.text.toString() == "" ||
                binding.b.text.toString() == "" ||
                binding.x.text.toString() == "" ||
                binding.y.text.toString() == "" ||
                binding.z.text.toString() == "" ||
                binding.a.text.toString() == "0" ||
                binding.b.text.toString() == "0" ||
                binding.x.text.toString() == "0" ||
                binding.y.text.toString() == "0" ||
                binding.z.text.toString() == "0"
            ) {
                binding.answer.text = "Проверьте введенные значения"
            } else {
                a = binding.a.text.toString().toInt()
                b = binding.b.text.toString().toInt()
                x = binding.x.text.toString().toInt()
                y = binding.y.text.toString().toInt()
                z = binding.z.text.toString().toInt()
                if ((a >= x && (b >= y || b >= z)) ||
                    (a >= y && (b >= z || b >= x)) ||
                    (a >= z && (b >= x || b >= y))
                ) {
                    binding.answer.text = "Пройдет"
                } else {
                    binding.answer.text = "Не пройдет"
                }
            }
        }
    }
}