package com.xhateya.idn.hungray.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.xhateya.idn.hungray.adapter.RecipesAdapter
import com.xhateya.idn.hungray.databinding.FragmentDessertBinding
import com.xhateya.idn.hungray.model.DataRecipes
import com.xhateya.idn.hungray.model.Recipes


class DessertFragment : Fragment() {
    private lateinit var dessertBinding: FragmentDessertBinding
    private val list: ArrayList<Recipes> = arrayListOf()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dessertBinding = FragmentDessertBinding.inflate(inflater,container,false)
        return dessertBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(DataRecipes.dataDessert)
        dessertBinding.rvDessert.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager (context,2)
            val recipesAdapter = RecipesAdapter(list)
            adapter= recipesAdapter
        }
    }


}