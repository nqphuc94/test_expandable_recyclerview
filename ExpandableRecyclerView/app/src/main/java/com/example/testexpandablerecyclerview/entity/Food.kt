package com.example.testexpandablerecyclerview.entity

import android.os.Parcel
import android.os.Parcelable

class Food(var name:String?="", var price:Double=0.toDouble()):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble()
    ) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeDouble(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Food> {
        override fun createFromParcel(parcel: Parcel): Food {
            return Food(parcel)
        }

        override fun newArray(size: Int): Array<Food?> {
            return arrayOfNulls(size)
        }


        fun fakeShowerCategory():ArrayList<Food>{
            val result= arrayListOf<Food>()
            result.add(Food("Cam", 5.5))
            result.add(Food("Xoai", 4.5))
            result.add(Food("Coc", 2.5))
            result.add(Food("Oi", 7.5))

            return result
        }

        fun fakeSweetCategory():ArrayList<Food>{
            val result= arrayListOf<Food>()
            result.add(Food("Du Du", 10.0))
            result.add(Food("Nhan", 25.5))
            result.add(Food("Chom chom", 12.0))
            result.add(Food("Sau Rieng", 81.5))

            return result
        }

        fun fakeSaltCategory():ArrayList<Food>{
            val result= arrayListOf<Food>()
            result.add(Food("Muoi Iot", 3.0))
            result.add(Food("Ross", 100.3))
            result.add(Food("Muoi Original", 2.0))

            return result
        }
    }
}