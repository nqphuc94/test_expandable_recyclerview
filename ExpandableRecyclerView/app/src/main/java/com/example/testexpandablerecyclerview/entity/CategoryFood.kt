package com.example.testexpandablerecyclerview.entity

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class CategoryFood (var name:String?="",var listFood:ArrayList<Food> = arrayListOf()):ExpandableGroup<Food>(name,listFood){
    companion object{
        fun fakeData():List<CategoryFood>{
            val result= arrayListOf<CategoryFood>()
            result.add(CategoryFood("Shower", Food.fakeShowerCategory() ))
            result.add(CategoryFood("Sweet", Food.fakeSweetCategory()))
            result.add(CategoryFood("Salt", Food.fakeSaltCategory()))

            return result.toList()
        }
    }
}