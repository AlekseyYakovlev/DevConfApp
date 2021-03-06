package ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import ru.spb.yakovlev.androidacademy.devconfapp.R
import ru.spb.yakovlev.androidacademy.devconfapp.databinding.FragmentSpeakersListBinding
import ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list.views.CustomAdapter


class SpeakersListFragment : Fragment() {
    private val defaultColumnCount = 2

    private lateinit var viewModel: SpeakersViewModel
    private lateinit var binding: FragmentSpeakersListBinding
    //private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpeakersListBinding.inflate(inflater, container, false)
        viewModel = ViewModelProviders.of(this).get(SpeakersViewModel::class.java)
        binding.model = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureRecyclerView()
    }

    private fun configureRecyclerView() {
        val columnCount = (activity?.resources?.getInteger(R.integer.column_count)) ?: defaultColumnCount
        val customAdapter = CustomAdapter(viewModel)
        viewModel.speakers.observe(
            this@SpeakersListFragment, Observer { list -> customAdapter.updateData(list) })

//        val itemTouchHelper = configureItemTouchHelper(columnCount)


        with(binding.employeeListRV) {
            layoutManager = when (columnCount) {
                1 -> androidx.recyclerview.widget.LinearLayoutManager(context)
                else -> androidx.recyclerview.widget.GridLayoutManager(context, columnCount)
            }
            //TODO: Add custom animation
            itemAnimator = androidx.recyclerview.widget.DefaultItemAnimator()

//            itemTouchHelper.attachToRecyclerView(this@with)
            adapter = customAdapter
        }
    }

//    private fun configureItemTouchHelper(columnCount: Int): ItemTouchHelper {
//        val dragDirs: Int
//        val swipeDirs: Int
//        when (columnCount) {
//            1 -> {
//                dragDirs = ItemTouchHelper.UP or ItemTouchHelper.DOWN
//                swipeDirs = ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
//            }
//            else -> {
//                dragDirs = ItemTouchHelper.UP or ItemTouchHelper.DOWN or ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
//                swipeDirs = 0
//            }
//        }
//        return ItemTouchHelper(getItemTouchHelperSimpleCallback(dragDirs, swipeDirs))
//    }
//
//    private fun getItemTouchHelperSimpleCallback(dragDirs: Int, swapDirs: Int) =
//        object : ItemTouchHelper.SimpleCallback(dragDirs, swapDirs) {
//            override fun onMove(
//                recyclerView: RecyclerView,
//                viewHolder: RecyclerView.ViewHolder,
//                target: RecyclerView.ViewHolder
//            ): Boolean {
//                val item1 = (viewHolder as EmployeeHolder).binding.item
//                val item2 = (target as EmployeeHolder).binding.item
//                viewModel.onItemsSwap(this@RecyclerFragment.context, item1, item2)
//                return true
//            }
//
//            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
//                val item = (viewHolder as EmployeeHolder).binding.item
//                viewModel.onItemSwiped(this@RecyclerFragment.context, item)
//            }
//        }
    override fun onResume() {
        super.onResume()
    viewModel.reload()
    }
}
