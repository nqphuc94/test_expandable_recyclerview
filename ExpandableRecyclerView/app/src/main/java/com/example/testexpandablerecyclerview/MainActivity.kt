package com.example.testexpandablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testexpandablerecyclerview.adapter.CategoryFoodAdapter
import com.example.testexpandablerecyclerview.entity.CategoryFood
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListCategory()
    }

    private fun initListCategory() {
        val adapter = CategoryFoodAdapter(
            this,
            CategoryFood.fakeData() as List<ExpandableGroup<CategoryFood>>
        )

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL


        lstFood.adapter = adapter
        lstFood.layoutManager = layoutManager
    }
}
