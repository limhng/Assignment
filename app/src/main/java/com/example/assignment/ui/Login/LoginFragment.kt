package com.example.assignment.ui.Login


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.assignment.R
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BtnAdmin.setOnClickListener(){
            val fragment = AdminFragment()
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.mainFrame,fragment).commit()
        }

        btnCustomer.setOnClickListener(){
            val fragment = CustomerFragment()
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.mainFrame,fragment).commit()
        }
    }




}
