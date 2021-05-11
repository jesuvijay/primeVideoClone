package com.example.primevideoclone.adpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.primevideoclone.R
import com.example.primevideoclone.model.BannerMovies

class BannerPageMovieAdapter(private val bannerMovieList:List<BannerMovies>) : PagerAdapter() {


    override fun getCount(): Int =bannerMovieList.size

    override fun isViewFromObject(view: View, obj: Any): Boolean {
return view==obj
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
       val view=LayoutInflater.from(container.context).inflate(R.layout.banner_movie_layout,null)
       val bannerImage=view.findViewById<ImageView>(R.id.iv_banner_image)
        Glide.with(container.context).load(bannerMovieList[position].imageUrl).into(bannerImage)
        container.addView(view)
        return view
    }
}