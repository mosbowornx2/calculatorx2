package com.example.a111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var c=0
    var op=""
    var num:Int=0
    var num1:Int=0
    var sum=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{

            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("1")
                c=0
            }
          else{
                var str = textView.text.toString().plus(1)
                textView.setText(str)

            }
        }
        btn2.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
            textView.setText("2")
                c=0
            }
            else{
                var str = textView.text.toString().plus(2)
                textView.setText(str)
            }
        }
        btn3.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("3")
                c=0
            }
            else{
                var str = textView.text.toString().plus(3)
                textView.setText(str)
            }
        }
        btn4.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("4")
                c=0
            }
            else{
                var str = textView.text.toString().plus(4)
                textView.setText(str)
            }
        }
        btn5.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("5")
                c=0
            }
            else{
                var str = textView.text.toString().plus(5)
                textView.setText(str)
            }
        }
        btn6.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("6")
                c=0
            }
            else{
                var str = textView.text.toString().plus(6)
                textView.setText(str)
            }
        }
        btn7.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("7")
                c=0
            }
            else{
                var str = textView.text.toString().plus(7)
                textView.setText(str)
            }
        }
        btn8.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ) {
                textView.setText("8")
                c = 0

            }
            else{
                var str = textView.text.toString().plus(8)
                textView.setText(str)
            }
        }
        btn9.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                textView.setText("9")
                c=0
            }
            else{
                var str = textView.text.toString().plus(9)
                textView.setText(str)
            }
        }
        btn0.setOnClickListener{
            if (textView.text.toString() == "0" || c==1 ){
                c=0
            }
            else {
                var str = textView.text.toString().plus(0)
                textView.setText(str)
            }
        }
        btnclear.setOnClickListener{
            textView.setText("0")
        }
        btndel.setOnClickListener{
            if(textView.text.toString().length<=1){
                textView.setText("0")
            }
            else if(textView.text.isNotEmpty()) {
                textView.text=textView.text.dropLast(1)
            }
            }
        btnPlus.setOnClickListener {
            num1=textView.text.toString().toInt()
            op="plus"
            c=1
        }
        btnminus.setOnClickListener {
            num1=textView.text.toString().toInt()
            op="minus"
            c=1
        }
       btnmulti.setOnClickListener {
            num1=textView.text.toString().toInt()
            op="multi"
            c=1
        }
        btndivi.setOnClickListener {
            num1=textView.text.toString().toInt()
            op="divi"
            c=1
        }
        btnmod.setOnClickListener {
            num1=textView.text.toString().toInt()
            op="mod"
            c=1
        }
        btnequal.setOnClickListener {
           if(op=="plus"){
               sum=num1+textView.text.toString().toInt()
               textView.setText(sum.toString())
           }
            else if (op=="minus"){
               sum=num1-textView.text.toString().toInt()
               textView.setText(sum.toString())
           }
           else if (op=="multi"){
               sum=num1*textView.text.toString().toInt()
               textView.setText(sum.toString())
           }
           else if (op=="divi"){
               sum=num1/textView.text.toString().toInt()
               textView.setText(sum.toString())
           }
           else if (op=="mod"){
               sum=num1%textView.text.toString().toInt()
               textView.setText(sum.toString())
           }
        }
        }
    }
