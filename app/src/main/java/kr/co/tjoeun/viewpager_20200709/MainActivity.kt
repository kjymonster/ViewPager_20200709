package kr.co.tjoeun.viewpager_20200709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.viewpager_20200709.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    //어댑터를 멤버변수로 생성

    lateinit var mvpa : MainViewPagerAdapter
     //초기화는 setVlause에서

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        //뷰페이지용 어댑터 변수를 초기화
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

    }


}