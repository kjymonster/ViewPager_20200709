package kr.co.tjoeun.viewpager_20200709.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*
import kr.co.tjoeun.viewpager_20200709.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeMessageBtn2.setOnClickListener {

            Toast.makeText(activity,"버튼 이벤트 입니다.", Toast.LENGTH_SHORT).show()
             //this로 주면 에러. 여기가 아닌 다른곳을 지정해야함. (여기는 부품임)
             //이 부품(fragment)을 들고 있는 화면인 activity(변수) 또는
            // BaseFragment 클래스를 만들어서 mContext를 지정해야함.


            welcomeMessageTxt2.text = "버튼2가 잘 실행 되었습니다."


        }
    }
}