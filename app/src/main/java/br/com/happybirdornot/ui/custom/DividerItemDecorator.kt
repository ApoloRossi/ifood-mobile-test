package br.com.happybirdornot.ui.custom

import android.graphics.Canvas
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class DividerItemDecorator(private val cardMargins : Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.top = cardMargins/2
        }

        outRect.bottom = cardMargins/2
        outRect.left = cardMargins
        outRect.right = cardMargins
    }
}