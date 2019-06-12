package com.example.testexpandablerecyclerview.entity

import android.os.Parcel
import android.os.Parcelable

data class TestFood(var name:String?="",var price:Double=0.toDouble()) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble()
    ) {}

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeDouble(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TestFood> {
        override fun createFromParcel(parcel: Parcel): TestFood {
            return TestFood(parcel)
        }

        override fun newArray(size: Int): Array<TestFood?> {
            return arrayOfNulls(size)
        }
    }
}