package com.education.online.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.online.R;
import com.education.online.act.discover.DiscoverMap;
import com.education.online.act.discover.InvitePage;
import com.education.online.act.discover.SignEveryday;
import com.education.online.act.discovery.AskAndSpeedAnswer;
import com.education.online.act.discovery.GrowingSpace;
import com.education.online.act.discovery.QuestionDetails;
import com.education.online.act.teacher.AuthMenu;
import com.education.online.act.teacher.MyOrders;
import com.education.online.act.teacher.MyRatePage;
import com.education.online.act.teacher.TeacherCourseStart;
import com.education.online.act.teacher.TeacherHomePage;

/**
 * Created by 可爱的蘑菇 on 2016/9/25.
 */
public class DiscoveryPage extends BaseFragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.discover_layout, container, false);

        initView(view);
        return view;
    }

    private void initView(View v) {
        v.findViewById(R.id.questionAndAnswerLayout).setOnClickListener(this);
        v.findViewById(R.id.growSpaceLayout).setOnClickListener(this);
        v.findViewById(R.id.signLayout).setOnClickListener(this);
        v.findViewById(R.id.sayHiLayout).setOnClickListener(this);
        v.findViewById(R.id.inviteLayout).setOnClickListener(this);
        v.findViewById(R.id.testLayout).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.questionAndAnswerLayout:
                startActivity(new Intent(getActivity(), AskAndSpeedAnswer.class));
//                startActivity(new Intent(getActivity(), TeacherHomePage.class));
                break;
            case R.id.growSpaceLayout:
                startActivity(new Intent(getActivity(), GrowingSpace.class));

                break;
            case R.id.signLayout:
                startActivity(new Intent(getActivity(), SignEveryday.class));
                break;
            case R.id.sayHiLayout:
                startActivity(new Intent(getActivity(), DiscoverMap.class));
                break;
            case R.id.inviteLayout:
                startActivity(new Intent(getActivity(), InvitePage.class));
                break;
            case R.id.testLayout:
//                startActivity(new Intent(getActivity(), TeacherCourseStart.class));
                break;
        }
    }
}
