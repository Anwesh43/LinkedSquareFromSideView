package com.anwesh.uiprojects.linkedsquarefromsideview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.squarefromsideview.SquareFromSideView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SquareFromSideView.create(this)
    }
}
