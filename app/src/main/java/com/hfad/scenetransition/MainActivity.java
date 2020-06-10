package com.hfad.scenetransition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
ViewGroup rootLayout;
Scene scene1;
Scene scene2;
Transition transitionMg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout=findViewById(R.id.rootContainer);
        scene1=Scene.getSceneForLayout(rootLayout,R.layout.scene_1,this);
        scene2=Scene.getSceneForLayout(rootLayout,R.layout.scene_2,this);
        transitionMg= TransitionInflater.from(this).inflateTransition(R.transition.transition);
        scene1.enter();





    }

    public void goToScene2(View view)
    {
        TransitionManager.go(scene2,transitionMg);
    }

    public void goToScene1(View view)
    {
          TransitionManager.go(scene1,transitionMg);
    }
}