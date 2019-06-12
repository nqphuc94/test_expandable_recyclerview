package com.example.testexpandablerecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testexpandablerecyclerview.R
import com.example.testexpandablerecyclerview.entity.CategoryFood
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder
import kotlinx.android.synthetic.main.item_category.view.*
import kotlinx.android.synthetic.main.item_food.view.*

class CategoryFoodAdapter(
    val context: Context,
    groups: List<ExpandableGroup<*>>
) : ExpandableRecyclerViewAdapter<CategoryFoodAdapter.CategoryViewholder, CategoryFoodAdapter.FoodViewHolder>(groups) {

    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): CategoryViewholder {
        return CategoryViewholder(LayoutInflater.from(context).inflate(R.layout.item_category, parent, false))
    }


    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): FoodViewHolder {
        return FoodViewHolder(LayoutInflater.from(context).inflate(R.layout.item_food, parent, false))
    }

    override fun onBindChildViewHolder(
        holder: FoodViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?,
        childIndex: Int
    ) {
        val food = (group as CategoryFood).listFood[childIndex]
        holder?.tvFoodName?.text = food.name
    }

    override fun onBindGroupViewHolder(holder: CategoryViewholder?, flatPosition: Int, group: ExpandableGroup<*>?) {
        val category = group as CategoryFood
        holder?.bindData(category)
    }

    class CategoryViewholder(view: View) : GroupViewHolder(view) {
        val tvCategoryName = view.tvCategoryName

        fun bindData(categoryFood: CategoryFood) {
            tvCategoryName.text = categoryFood.name
        }
    }

    class FoodViewHolder(view: View) : ChildViewHolder(view) {
        val tvFoodName = view.tvFoodName
    }
}