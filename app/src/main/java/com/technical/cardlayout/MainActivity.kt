package com.technical.cardlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.lifecycle.Observer
import com.example.myapplication.ui.common.getViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                motionLayout.post {
                    when (currentId) {
                        R.id.secondCard -> {
                            motionLayout.progress = 0f
                            motionLayout.setTransition(R.id.start, R.id.secondCard)
                            currentIndex += 1
                        }
                        R.id.firstCard -> {
                            motionLayout.progress = 0f
                            motionLayout.setTransition(R.id.start, R.id.secondCard)
                            currentIndex += 1
                        }
                    }
                }
            }
        })
    }

//    private fun bindCard(it: CreditCardsModel) {
//        cardLeft1.setCardBackgroundColor(it.cardFourLeft.backgroundColor)
//        cardLeft2.setCardBackgroundColor(it.cardThreeLeft.backgroundColor)
//        cardLeft3.setCardBackgroundColor(it.cardTwoLeft.backgroundColor)
//        cardLeft4.setCardBackgroundColor(it.cardOneLeft.backgroundColor)
//        cardCenter.setCardBackgroundColor(it.cardCenter.backgroundColor)
//        cardRight1.setCardBackgroundColor(it.cardOneRight.backgroundColor)
//        cardRight2.setCardBackgroundColor(it.cardTwoRight.backgroundColor)
//        cardRight3.setCardBackgroundColor(it.cardThreeRight.backgroundColor)
//        cardRight4.setCardBackgroundColor(it.cardFourRight.backgroundColor)
//    }
}